package unfleaplus

class IndexController {

	
	def goView(theController, theView){
		def allProducts = ProductController.recoveryProduct()
		if(session.user){
			def allRequests = UserController.recoveryRequest(session.user)
			render(controller:theController,view:theView, model:[search:allProducts,requests:allRequests,user:User.findByUsername(session.user)])
		}else{
		render(controller:theController,view:theView, model:[search:allProducts])
		}
	}
	
    def index() {
		println(session.user)
		goView('index', 'index')
	}

	
	def viewHome(){
		goView('index', 'index')
//		def products = ProductController.recoveryProduct()
//		render(controller:'index',view:'index',model:[search:products,user:User.findByUsername(session.user)])
		
	}
	def viewContactUs(){
		goView('index', 'contactUs')
//		def products = ProductController.recoveryProduct()
//		render(controller:'index',view:'contactUs',model:[search:products,user:User.findByUsername(session.user)])
	}
	def viewAboutUs(){
		def products = ProductController.recoveryProduct()
		render(controller:'index',view:'aboutUs',model:[search:products,user:User.findByUsername(session.user)])
	}
	
}
