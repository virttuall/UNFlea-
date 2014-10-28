package unfleaplus

class ProductController {

	def index() {
		redirect(controller:'product',action:'viewAddProduct')
	}

	def viewAddProduct(){
		println(session.user)
		if(session.user){
			render(controller:'product',view:'addProduct')
		}else{
			redirect(controller:'index',action:'viewHome')
		}
	}
	def viewDeleteProduct(){
		if (session.user){
			def user= User.findByUsername(session.user)
			def c = Product.createCriteria()
			def results = c.list(params){
				createAlias("user", "c")
				eq("c.id", user.getId())
			}
			render(controller:'product',view:'deleteProduct',model:[products:results,totalProduct:Product.count])
		}else{
			redirect(controller:'index',action:'viewHome')
		}
	}

	def addProduct(){
		def user = User.findByUsername(session.user)
		def name = params.name
		def description = params.description
		def state = params.state
		def product = new Product(name:name,description:description,state:false)
		println("name product "+name)
		println("description product "+description)
		println("state product "+state)
		def allImages =request.getFileNames()
		for(image in allImages){
			def imageTemp = new Image(image:request.getFile(image).getBytes())
			
			product.addToImage(imageTemp)
			imageTemp.save(flush:true)
			

		}
		user.addToProducts(product)
		product.save(flush:true)
		user.save(flush:true)
		def list=user.products//Asi se recuperan los productos que tiene un usuario asociado
		list.each {def listImage =it.image
			print listImage
		}
		
		
		//println("Bucar" + name+" "+Product.findByName(name).description)
		
	}
	def deleteProduct(){
		def keys = params.keySet()
		for (Object key : keys) {
			if (!key.equals("action") && !key.equals("controller") && !key.equals("format")) {
				def product = Product.get(params.get(key))
				product.delete(flush:true)
			}
		}
		redirect(controller:'user',action:'viewHome')
	}
	
}