package unfleaplus

class IndexController {
	
    def index() {
		println(session.user)
		if(session.user){
			redirect(controller:'user',action:'viewHome' , params: [name: session.user])
		}
		render(controller:'index',view:'index')
	}
	def viewHome(){
		if(session.user){
			redirect(controller:'user',action:'viewHome', params: [name: session.user])
		}
		render(controller:'index',view:'index')
		
	}
	def viewContactUs(){
		render(controller:'index',view:'contactUs')
	}
	def viewAboutUs(){
		render(controller:'index',view:'aboutUs')
	}
}
