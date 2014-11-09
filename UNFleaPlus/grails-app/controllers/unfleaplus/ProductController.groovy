package unfleaplus


class ProductController {
	def temp
	def normal
	def subasta
	def donacion
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
	
	def viewUpdateProduct(){
		def valor = Product.get(params.id)
		print valor
		if (session.user){
			render(controller:'product',view:'updateProduct',model:[product:valor])
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
	
	def updateProduct(){
		def user = User.findByUsername(session.user)
		def prevName = params.prevName
		def name = params.name
		def description = params.description
		def state = params.state
		def c = Product.createCriteria()
		def results = c.list(params){
			createAlias("user", "c")
			eq("c.id", user.getId())
		}
		def theProduct = (Product)results.get(0)
		theProduct.name = name
		theProduct.description = description
		theProduct.save(flush:true)
		user.save(flush:true)
		redirect(controller:'user',action:'viewHome')
	}

	
	def deleteProduct(){
		println "Delete"
		def keys = params.keySet()
		for (Object key : keys) {
			if (!key.equals("action") && !key.equals("controller") && !key.equals("format")) {
				def product = Product.get(params.get(key))
				product.delete(flush:true)
			}
		}
		redirect(controller:'user',action:'viewHome')
	}
	def updateData(){
		if (session.user){
			def temp = Product.get(params.product)
			temp.name=params.myName
			temp.description=params.myDescription
			temp.save(flush:true)
			redirect(controller:'user',action:'viewHome')
		}else{
			redirect(controller:'user',action:'viewHome')
		}
	}
	def addImage(){
		def temp = Product.get(params.product)
		def allImages =request.getFileNames()
		for(image in allImages){
			def imageTemp = new Image(image:request.getFile(image).getBytes())
			
			temp.addToImage(imageTemp)
			imageTemp.save(flush:true)
			

		}
		
		temp.save(flush:true)
		redirect(controller:'user',action:'viewHome')
		
	}
	def deleteImage(){
		def a = Product.get(params.product)
		def l = []
		l += a.image
		
		def keys = params.keySet()
		print l
		print keys
		
		l.each { it ->
			for (Object key : keys) {
				if (!key.equals("action") && !key.equals("controller") && !key.equals("format") && !key.equals("product")) {
					
					if(it.getId()==Integer.parseInt(key)){
						a.removeFromImage(it)
						it.delete(flush:true)
					}
				}
			}
			
		}	
		redirect(controller:'user',action:'viewHome')
	}
	def searchProduct(){
		/*Todavia no se pueden implementar los filtros de de precio y tipo
		 * ya que se estan haciendo cambios a la base de datos.
		 */
		print params
		
		def country=params.country?:null
		def state= params.state?:null
		def products = IndexController.recoveryProduct()
		def max1=params.max?:10
		def offset1=params.offset?:0
		def price= params.price?:null
		def priceMin
		def priceMax
		if(price!=null){
			price= price.split(",")
			priceMin = price[0]
			priceMax = price[1]
		}else{
			priceMin = null
			priceMax = null
		}
		print priceMin
		print priceMax
		print params.subasta
		if(subasta!=null && params.subasta.equals("-1")){
			subasta=null
		}else if(!params.subsata.equals("-1")) {
			subasta=params.subasta
		}  
		if(donacion!=null && params.donacion.equals("-1")){
			donacion=null
		}else if(!params.donacion.equals("-1")) {
			donacion=params.donacion
		}
		if(normal!=null && params.normal.equals("-1")){
			normal=null
		}else if(!params.normal.equals("-1")) {
			normal=params.normal
		}
		
		if (params.search!=null){
			temp= params.search	
		}
		if (temp!=null){
			def results = Product.findAll("from Product as b where b.name=?",[temp.trim()], [max:max1, offset: offset1])
			def results1 =Product.findAllWhere(name: temp.trim())
			if(params.country!=null && params.state!=null && !params.state.equals("")){
				print params.state
				results =Product.findAll("from Product as b where b.name=? AND b.user.userCountry=? AND b.user.userCity=?",[temp.trim(),params.country.trim(),params.state], [max:max1, offset: offset1])
				print results
			}
			else if(params.country!=null && !params.country.equals("")) {
				results =Product.findAll("from Product as b where b.name=? AND b.user.userCountry=?",[temp.trim(),params.country.trim()], [max:max1, offset: offset1])
				print results
			}
			
			render(controller:'product',view:'showProduct',model:[products:results,totalProduct:results1.size(),search:products,subasta:subasta,normal:normal,donacion:donacion,country:country,state:state,priceMin:priceMin,priceMax:priceMax])
		}else{
			def results = Product.findAll("from Product as b where b.name=?",[""], [max:max1, offset: offset1])
			render(controller:'product',view:'showProduct',model:[products:results,totalProduct:0,search:products,subasta:subasta,normal:normal,donacion:donacion,country:country,state:state,priceMin:priceMin,priceMax:priceMax])
		}
		
		
	}
	
	
	
}