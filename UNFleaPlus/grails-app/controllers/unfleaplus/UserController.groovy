package unfleaplus
//TODO 
//Mejorar la logica del chat
//Redireccionar correctamente cuando una sesion se encuetre abierta(Casi terminado)
class UserController {
	def user
    def index() { 
		if (session["user"]){
			render(controller:'user',view:'home')
		}	
	}
	def viewLogin(){
		if (session["user"]){
			render(controller:'user',view:'home')
		}else{
			render(controller:'user',view:'login')
		}
	}
	def viewRegister(){
		if (session["user"]){
			render(controller:'user',view:'home')
		}else{
			render(controller:'user',view:'register')
		}	
	}
	def home(){
		if (session["user"]){
			render(controller:'user',view:'home')
		}else{
			user=User.findByEmailAndPassword(params.email,params.password)
			if (user){
				session["user"] = "John"
				render("Login")
			}else{
				render("No login")
			}
		}
//		flash.message = "user.saved.message"
//		flash.args = [params.email, params.password]
//		flash.defaultMsg = "User Saved"
//			
//		render(controller:'user',view:'home',model:[name: params.email] )
		
		
	}
	def register(){
		if (session["user"]){
			render(controller:'user',view:'home')
		}
		def parameters=[email:params.email,userName:params.username,firstName:params.firstname,lastName:params.lastname,
			password:params.password,passwordConfirm:params.password1,gender:params.gender]
		user = User.findByEmail(params.email)
		if (user){
			flash.message = "Usuario ya existe"
			render("Usuario ya existe")
		}else{
			user = new User(parameters)
			
			if (user.save()){
				session["user"] = "John"
				render("Usuario registrado")
			}else{
				flash.message = "Problema al guardar el usuario"
				render("Error")
			}
		}
		
			
	}
	def logout(){
		if (session["user"]){
			 session.invalidate()
			
		}
		render("Logout")
	}
}
