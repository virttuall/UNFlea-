package unfleaplus

class ProductController {

    def index() { }
	
	def viewAddProduct(){
		render(controller:'product',view:'addProduct')
	}
}