package unfleaplus

class UserController {

    def index() { }
	def viewLogin(){
		render(controller:'user',view:'login')
	}
	def viewRegister(){
		render(controller:'user',view:'register')	
	}
}
