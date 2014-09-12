package unfleaplus

class IndexController {

    def index() { }
	def viewHome(){
		render(controller:'index',view:'index')
	}
}
