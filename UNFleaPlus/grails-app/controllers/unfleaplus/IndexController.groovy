package unfleaplus

class IndexController {
	public def static recoveryProduct(){
		def products = Product.all
		def lista =[] as Set
		products.each {it->
			lista.add(it.getName())
		}
		return lista
	}
    def index() {
		println(session.user)
//		if(session.user){
//			redirect(controller:'user',action:'viewHome' , params: [name: session.user])
//		}
		def products = recoveryProduct()
		
		render(controller:'index',view:'index', model:[search:products,user:User.findByUsername(session.user)])
	}
	def viewHome(){
//		if(session.user){
//			redirect(controller:'user',action:'viewHome', params: [name: session.user])
//		}
		def products = recoveryProduct()
		render(controller:'index',view:'index',model:[search:products,user:User.findByUsername(session.user)])
		
	}
	def viewContactUs(){
		def products = recoveryProduct()
		render(controller:'index',view:'contactUs',model:[search:products,user:User.findByUsername(session.user)])
	}
	def viewAboutUs(){
		def products = recoveryProduct()
		render(controller:'index',view:'aboutUs',model:[search:products,user:User.findByUsername(session.user)])
	}
	
}
