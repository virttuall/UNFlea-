package unfleaplus
import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.AuthenticationException
import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.web.util.SavedRequest
import org.apache.shiro.web.util.WebUtils
//TODO 
//Mejorar la logica del chat
//Redireccionar correctamente cuando una sesion se encuetre abierta(Casi terminado)
class UserController {
	def shiroSecurityService
	def user
	def user1
    def index() {
		render(controller:'user',view:'home')
	}
	
	def viewRegister(){
		render(controller:'user',view:'register')
	}
	def viewHome(){
		render(controller:'user',view:'home')
	}
	def login(){
		user=User.findByEmail(params.email)
		def authToken
		if (user){
			authToken = new UsernamePasswordToken(user.username, params.password as String)
		}else{
			authToken = new UsernamePasswordToken(params.email, params.password as String)
		}
		
		if (params.rememberMe) {
			authToken.rememberMe = true
		}
		
		try{
			// Perform the actual login. An AuthenticationException
			// will be thrown if the username is unrecognised or the
			// password is incorrect.
			SecurityUtils.subject.login(authToken)

			session["user"]=user.username
			println(session.user)
			redirect(controller:'user',action:'viewHome', params: [name: user.username] )
		}
		catch (AuthenticationException ex){
			// Authentication failed, so display the appropriate message
			// on the login page.
			flash.message = message(code: "login.failed")

			// Keep the username and "remember me" setting so that the
			// user doesn't have to enter them again.
			def m = [ username: params.username ]
			if (params.rememberMe) {
				m["rememberMe"] = true
			}


			// Now redirect back to the login page.
			redirect(controller:'index',action:'viewHome')
		}
		
		
		
		
	}
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
			def parameters =[email:params.email,username:params.username,firstName:params.firstname,lastName:params.lastname
				,gender:params.gender,passwordHash:shiroSecurityService.encodePassword(params.password)]
			user= new User(parameters)
			if(user.save()){
				user.addToRoles(Role.findByName('ROLE_USER'))
				// Login user
				def authToken = new UsernamePasswordToken(user.username, params.password)
				SecurityUtils.subject.login(authToken)
				session["user"]=user.username
				redirect(controller:'user',action:'viewHome', params: [name: user.username] )
			} 
		}
		
	}
	def logout(){
		SecurityUtils.subject?.logout()
		webRequest.getCurrentRequest().session = null
		session["user"]=null
		// For now, redirect back to the home page.
		
		redirect(controller:'index',action:'viewHome')
	}
}
