package unfleaplus


class ProductController {
	def temp
	def normal
	def subasta
	def donacion
	def usernameOrder
	def countryOrder
	def cityOrder
	def priceOrder
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
		def nuevaBusqueda=false
		def country
		def state
		def products = IndexController.recoveryProduct()
		def max1=params.max?:10
		def offset1=params.offset?:0
		def price= params.price?:null
		def priceMin
		def priceMax
		def order1=""
		def order="" //Utilizado para odernar
		def where=""//Utilizado para la condicion
		def listWhere=[]
		if(price!=null){
			price= price.split(",")
			priceMin = price[0]
			priceMax = price[1]
		}else{
			priceMin = null
			priceMax = null
		} 
		if (params.search!=null){
			
			nuevaBusqueda=true 
			temp= params.search
		}else{
			nuevaBusqueda=false
		}
		if(nuevaBusqueda){
			normal=null
			subasta=null
			donacion=null
			usernameOrder=null
			countryOrder=null
			cityOrder=null
			priceOrder=null
			if(temp!=null){
				where="b.name=? AND "
				listWhere.add(temp.trim())
			}
		}else{
			if(params.country!=null && !params.country.equals("")){
				where+="b.user.userCountry=? AND "
				listWhere.add(params.country.trim())
				country= params.country
			}
			if(params.country!=null && !params.country.equals("") && params.state!=null  && !params.state.equals("")){
				where+="b.user.userCity=? AND "
				listWhere.add(params.state.trim())
				state=params.state
			}
			if(subasta!=null && params.subasta.equals("-1")){
				subasta=null
			}else if(!params.subsata.equals("-1") && params.subasta!=null) {
				subasta=params.subasta
			}
			if(donacion!=null && params.donacion.equals("-1")){
				donacion=null
			}else if(!params.donacion.equals("-1") && params.donacion!=null) {
				donacion=params.donacion
			}
			if(normal!=null && params.normal.equals("-1")){
				normal=null
			}else if(!params.normal.equals("-1") && params.normal!=null) {
				normal=params.normal
			}
			if(usernameOrder!=null && params.usernameOrder.equals("-1")){
				usernameOrder=null
			}else if(!params.usernameOrder.equals("-1") && params.usernameOrder!=null){
				usernameOrder=params.usernameOrder
				order="b.user.username,"
			}
			if(countryOrder!=null && params.countryOrder.equals("-1")){
				countryOrder=null
			}else if(!params.countryOrder.equals("-1") && params.countryOrder!=null){
				print "hola"
				countryOrder=params.countryOrder
				order+="b.user.userCountry,"
			}
			if(cityOrder!=null && params.cityOrder.equals("-1")){
				cityOrder=null
				
			}else if(!params.cityOrder.equals("-1") && params.cityOrder!=null){
				print "hola1"
				cityOrder=params.cityOrder
				order+="b.user.userCity,"
			}
			if(priceOrder!=null && params.priceOrder.equals("-1")){
				priceOrder=null
			}else if(!params.priceOrder.equals("-1") && params.precioOrder!=null){
				priceOrder=params.priceOrder
				//order+=priceOrder+","
			}
		}
		
		
		if(order.length()>0){
			order=order.substring(0,order.length()-1)
			order1=" order by "
		}
		if(where.length()>0){
			
			where="where "+where.substring(0,where.length()-4)
		} 
		print order
		print where
		
		
		
		if (temp!=null){
			
			def results = Product.findAll("from Product as b " + where+order1+" "+order,listWhere, [max:max1, offset: offset1])
			def results1 = Product.findAll("from Product as b " + where+order1+" "+order,listWhere)
			//No esta implementada la de pricee
			
			render(controller:'product',view:'showProduct',model:[products:results,totalProduct:results1.size(),search:products,subasta:subasta,normal:normal,donacion:donacion,country:country,state:state,priceMin:priceMin,priceMax:priceMax,usernameOrder:usernameOrder,countryOrder:countryOrder,cityOrder:cityOrder,priceOrder:priceOrder])
		}else{
			def results = Product.findAll("from Product as b where b.name=?",[""], [max:max1, offset: offset1])
			render(controller:'product',view:'showProduct',model:[products:results,totalProduct:0,search:products,subasta:subasta,normal:normal,donacion:donacion,country:country,state:state,priceMin:priceMin,priceMax:priceMax,usernameOrder:usernameOrder,countryOrder:countryOrder,cityOrder:cityOrder,priceOrder:priceOrder])
		}
		
		
	}
	
	
	
}