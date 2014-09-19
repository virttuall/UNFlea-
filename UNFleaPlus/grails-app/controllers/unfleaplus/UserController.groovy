package unfleaplus

class UserController {

    def index() { }
	def viewLogin(){
		render(controller:'user',view:'login')
	}
	def viewRegister(){
		render(controller:'user',view:'register')	
	}
	def home(){
		flash.message = "user.saved.message"
		flash.args = [params.email, params.password]
		flash.defaultMsg = "User Saved"
		
		
		render(controller:'user',view:'home',model:[name: params.email] )
	}
}
