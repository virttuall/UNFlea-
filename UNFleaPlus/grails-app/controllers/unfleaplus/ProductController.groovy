package unfleaplus

class ProductController {

	def index() { }

	def viewAddProduct(){
		println(session.user)
		if(session.user){
			render(controller:'product',view:'addProduct')
		}else{
			redirect(controller:'user',action:'viewHome' , params: [name: session.user])
		}
	}

	def addProduct(){
		def name = params.name
		def description = params.description
		def state = params.state
		def product = new Product(name:name,description:description,state:false)
		println("name product "+name)
		println("description product "+description)
		println("state product "+state)
		def allImages =request.getFileNames()
		for(image in allImages){
			product.addToImage(image:image.getBytes())
			//			println("${var}")
			//			println("${request.getFile(var).getBytes()}")

		}
		//		product.addToUser()
		product.save()
		println("Bucar" + name+" "+Product.findByName(name).description)
	}
}