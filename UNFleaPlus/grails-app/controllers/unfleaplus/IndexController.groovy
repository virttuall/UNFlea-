package unfleaplus

class IndexController {
	public def static recoveryProduct(){
		def products = Product.all
		def lista =[]
		products.each {it->
			lista.add(it.getName())
		}
		return lista
	}
    def index() {
		println(session.user)
		if(session.user){
			redirect(controller:'user',action:'viewHome' , params: [name: session.user])
		}
		def products = recoveryProduct()
		
		render(controller:'index',view:'index', model:[search:products])
	}
	def viewHome(){
		if(session.user){
			redirect(controller:'user',action:'viewHome', params: [name: session.user])
		}
		def products = recoveryProduct()
		render(controller:'index',view:'index',model:[search:products])
		
	}
	def viewContactUs(){
		def products = recoveryProduct()
		render(controller:'index',view:'contactUs',model:[search:products])
	}
	def viewAboutUs(){
		def products = recoveryProduct()
		render(controller:'index',view:'aboutUs',model:[search:products])
	}
	def searchProduct(){
		render "por implementar"
	}
}
