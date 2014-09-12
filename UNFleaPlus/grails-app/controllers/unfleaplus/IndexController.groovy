package unfleaplus

class IndexController {

    def index() { }
	def viewHome(){
		render(controller:'index',view:'index')
	}
	def viewContactUs(){
		render(controller:'index',view:'contactUs')
	}
	def viewAboutUs(){
		render(controller:'index',view:'aboutUs')
	}
}
