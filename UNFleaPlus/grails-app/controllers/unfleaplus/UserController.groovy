package unfleaplus
import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.AuthenticationException
import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.web.util.SavedRequest
import org.apache.shiro.web.util.WebUtils

import grails.plugin.email.*
import grails.transaction.Transactional;
class UserController {
	def shiroSecurityService
	def user
	def user1
	def mailService
    def index() {
		redirect(controller:'user',action:'list')
	}
	
	def viewRegister(){

		if(session.user){
			redirect(controller:'user',action:'viewHome')
		}
		render(controller:'user',view:'register')
	}
	def viewHome(){

		redirect(controller:'user',action:'list')
	}
	@Transactional
	def login(){
		def authToken
		user=User.findByEmail(params.email)
		
		if (user){
			if(user.active){
				authToken = new UsernamePasswordToken(user.username, params.password as String)
			}else{
				authToken = new UsernamePasswordToken(user.username, "" as String)
				flash.message = message(code: "active")
			}
			
		}else{
			authToken = new UsernamePasswordToken(params.email, params.password as String)
		}
		
		
		try{
			// Perform the actual login. An AuthenticationException
			// will be thrown if the username is unrecognised or the
			// password is incorrect.
			SecurityUtils.subject.login(authToken)

			session["user"]=user.username
			println(session.user)
		
			
			redirect(controller:'user',action:'viewHome')
		}
		catch (AuthenticationException ex){
			// Authentication failed, so display the appropriate message
			// on the login page.
			if(!flash.message){ 
				flash.message = message(code: "login.failed")
			}

			


			// Now redirect back to the login page.
			redirect(controller:'index',action:'viewHome')
		}
		// Keep the username and "remember me" setting so that the
		// user doesn't have to enter them again.
		
		
		
		
	}
	@Transactional
	def register(){
		user=User.findByEmail(params.email)
		user1 =User.findByUsername(params.username)
		if(user){ //El usuario ya existe
			flash.message = "User already exists with the email '${params.email}'"
			//TODO
			//Arreglar este render 
			redirect(controller:'user',action:'viewRegister')
		} 
		else if(user1){ //El usuario ya existe
			flash.message = "User already exists with the username '${params.username}'"
			//TODO
			//Arreglar este render
			redirect(controller:'user',action:'viewRegister')
		}
		else{//Nuevo Usario
			def f = request.getFile("avatar")
			def parameters =[email:params.email,username:params.username,firstName:params.firstname,lastName:params.lastname
				,gender:params.gender,passwordHash:shiroSecurityService.encodePassword(params.password),active:false,avatar:f.getBytes()]
			user= new User(parameters)
			mailService.sendMail {
				to "${user.email}"
				subject "Confirmar email"
				html    g.render(template:'/email/registrationConfirmation', model:[user:user,password:params.password])
			}
			if(user.save(flush: true)){
				user.addToRoles(Role.findByName('ROLE_USER'))
				// Login user
				
				redirect(controller:'index', action:'viewHome')
			} 
		}
		
	}
	def avatar_image(){
		user = User.get(params.id)
		OutputStream out = response.outputStream
		out.write(user.avatar)
		out.close()
		
	}
	@Transactional
	def confirmEmail(){
		user=User.findByEmail(params.email)
		user.active=true
		user.save(flush: true)
		redirect(controller:'index', action:'viewHome')
	}
	@Transactional
	def logout(){
		SecurityUtils.subject?.logout()
		webRequest.getCurrentRequest().session = null
		session["user"]=null
		// For now, redirect back to the home page.
		
		redirect(controller:'index',action:'viewHome')
	}
	def list(){
		user= User.findByUsername(session.user)
		def c = Product.createCriteria()
		def results = c.list(params){
			createAlias("user", "c")
			eq("c.id", user.getId())
		}
		if(session.user){
			user= User.findByUsername(session.user)
			render(controller:'user',view:'home',model:[products:results, totalProduct:Product.count(),user:user])
		}else{
			redirect(controller:'index',action:'viewHome')
		}
		
	}
	def product_image(){
		
		def temp = Image.get(params.id)
		
		OutputStream out = response.outputStream
		out.write(temp.image)
		out.close()
					
	}
}
