package unfleaplus


import javax.swing.ImageIcon
import javax.imageio.ImageIO;

import java.awt.Graphics2D
import java.awt.GraphicsConfiguration.DefaultBufferCapabilities;
import java.awt.image.BufferedImage
import java.lang.Thread.State;


class ProductController {
	def productRequest
	def temp
	def normal
	def subasta
	def donacion
	def usernameOrder
	def countryOrder
	def cityOrder
	def priceOrder
	def nameOrder
	def mailService
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
		def state = (params.state).toInteger()

		def typeProduct = state == 0?"NORMAL":state==1?"AUCTION":"DONATE";

		def minimumCost = (params.minimumCost).toFloat()

		def startDay = (params.dateStart_day).toInteger()
		def startMonth = (params.dateStart_month).toInteger()
		def startYear = (params.dateStart_year).toInteger()
		def startHour = (params.dateStart_hour).toInteger()
		def startMinute = (params.dateStart_minute).toInteger()
		def startDate = new Date().copyWith(year: startYear,month: startMonth,	dayOfMonth: startDay,hourOfDay: startHour,minute: startMinute,second: 0)

		def endDay = (params.dateEnd_day).toInteger()
		def endMonth = (params.dateEnd_month).toInteger()-1
		def endYear = (params.dateEnd_year).toInteger()
		def endHour = (params.dateEnd_hour).toInteger()
		def endMinute = (params.dateEnd_minute).toInteger()
		def endDate = new Date().copyWith(year: endYear,month: endMonth,dayOfMonth: endDay,hourOfDay: endHour,minute: endMinute,second: 0)

		

		def product

		product = new Product(name:name,description:description,state:false,type:typeProduct,openingDate:startDate,closingDate:endDate,currentPrice:minimumCost)
		
		println("name product "+name)
		println("description product "+description)
		println("state product "+state)
		println("type product "+typeProduct)
		println("minimum cost " +minimumCost)
		println("start date " + startDate)
		println("end date " +endDate)
		
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
		list.each {
			def listImage =it.image
			print listImage
		}


	}
	def small_image(){
		byte [] buffer
		def temp = Image.get(params.id)
		ImageIcon a = new ImageIcon(temp.image)
		a= new ImageIcon(a.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))
		BufferedImage bi = new BufferedImage(a.getImage().getWidth(null)
				,a.getImage().getWidth(null)
				, BufferedImage.BITMASK)
		Graphics2D g2 = bi.createGraphics();
		g2.drawImage(a.getImage(), 0, 0, null);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ImageIO.write(bi, "PNG", baos);
		} catch (IOException ex) {}
		buffer = baos.toByteArray()

		OutputStream out = response.outputStream
		out.write(buffer)
		out.close()

	}
	def large_image(){
		byte [] buffer
		def temp = Image.get(params.id)
		ImageIcon a = new ImageIcon(temp.image)
		a= new ImageIcon(a.getImage().getScaledInstance(1000, 1000, java.awt.Image.SCALE_SMOOTH))
		BufferedImage bi = new BufferedImage(a.getImage().getWidth(null)
				,a.getImage().getWidth(null)
				, BufferedImage.BITMASK)
		Graphics2D g2 = bi.createGraphics();
		g2.drawImage(a.getImage(), 0, 0, null);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ImageIO.write(bi, "PNG", baos);
		} catch (IOException ex) {}
		buffer = baos.toByteArray()

		OutputStream out = response.outputStream
		out.write(buffer)
		out.close()

	}
	def normal_image(){
		byte [] buffer
		def temp = Image.get(params.id)
		ImageIcon a = new ImageIcon(temp.image)
		a= new ImageIcon(a.getImage().getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH))
		BufferedImage bi = new BufferedImage(a.getImage().getWidth(null)
				,a.getImage().getWidth(null)
				, BufferedImage.BITMASK)
		Graphics2D g2 = bi.createGraphics();
		g2.drawImage(a.getImage(), 0, 0, null);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ImageIO.write(bi, "PNG", baos);
		} catch (IOException ex) {}
		buffer = baos.toByteArray()

		OutputStream out = response.outputStream
		out.write(buffer)
		out.close()

	}

	def deleteProduct(){
		println "Delete"
		def product = Product.get(params.id)
		product.delete(flush:true)
		redirect(controller:'user',action:'viewHome')
	}
	def deleteProduct1(){
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
			def product = Product.get(params.infoIdProduct)
			product.name=params.myName
			product.description=params.myDescription
			product.save(flush:true)
			redirect(controller:'user',action:'viewHome')
		}else{
			redirect(controller:'user',action:'viewHome')
		}
	}

	def addImage(){
		def temp = Product.get(params.imagesIdProduct)
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

		def product = Product.get(params.idProduct)
		def images = []
		print params
		print product
		images += product.image
		print params.idProduct
		if(images.size() > 1){
			images.each { it ->
				if(it.getId() == params.idImage.toInteger()){
					product.removeFromImage(it)
					it.delete(flush:true)
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
		def type=""
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
			nameOrder=null
			if(temp==null){
				temp=""
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
			
			if(nameOrder!=null && params.nameOrder.equals("-1")){
				nameOrder=null
			}else if(!params.nameOrder.equals("-1") && params.nameOrder!=null){
				nameOrder=params.nameOrder
				order="b.name,"
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
			
			if(subasta!=null && params.subasta.equals("-1")){
				subasta=null
			}else if(!params.subsata.equals("-1") && params.subasta!=null) {
				type+="b.type=? OR "
				listWhere.add("AUCTION")
				subasta="AUCTION"
			}
			if(donacion!=null && params.donacion.equals("-1")){
				donacion=null
			}else if(!params.donacion.equals("-1") && params.donacion!=null) {
				type+="b.type=? OR "
				listWhere.add("DONATE")
				donacion="DONATE"
			}
			if(normal!=null && params.normal.equals("-1")){
				normal=null
			}else if(!params.normal.equals("-1") && params.normal!=null) {
				type+="b.type=? 0R "
				listWhere.add("NORMAL")
				normal="NORMAL"
			}
			
		}

		
		if(order.length()>0){
			order=order.substring(0,order.length()-1)
			order1=" order by "
		}
		if(where.length()>0){

			where="AND "+where.substring(0,where.length()-4)
		}
		if(type.length()>0){
			type = type.substring(0,type.length()-3)
			where+=" AND ( "+type+" )"
		}
		
		print order
		print where
		print listWhere



		//if (temp!=null){
		def results = Product.findAll("from Product as b " + "where b.name like '%"+temp.trim()+"%' "+where+order1+" "+order,listWhere, [max:max1, offset: offset1])
		def results1 = Product.findAll("from Product as b " + "where b.name like '%"+temp.trim()+"%' "+where+order1+" "+order,listWhere)
		//No esta implementada la de pricee

		render(controller:'product',view:'showProduct',model:[products:results,totalProduct:results1.size(),search:products,subasta:subasta,normal:normal,donacion:donacion,country:country,state:state,priceMin:priceMin,priceMax:priceMax,usernameOrder:usernameOrder,countryOrder:countryOrder,cityOrder:cityOrder,priceOrder:priceOrder,nameOrder:nameOrder])
		//}


	}
	def viewRequest(){
		def product = Product.get(params.product)
		if(product!=null){
			productRequest=product
		}
		def products = IndexController.recoveryProduct()
		if (session.user){
			def user= User.findByUsername(session.user)
			def c = Product.createCriteria()
			def results = c.list(params){
				createAlias("user", "c")
				eq("c.id", user.getId())
			}
			render(controller:'prodcut',view:'showRequest',model:[product:productRequest,search:products, myProducts:results])
		}else{
			render(controller:'prodcut',view:'showRequest',model:[product:productRequest,search:products])
		}
	}

	def sendNormalRequest(){
		def toDoUser = User.findByUsername(session.user)
		def userReceiving = User.findByUsername(params.userReceiving)
		def product = Product.get(params.idTheProduct)
		def price = params.price.toDouble()
		def products = []
		print params
		print userReceiving
		params.remove("idTheProduct"); params.remove("price"); params.remove("userReceiving");
		params.remove("controller"); params.remove("format"); params.remove("action")
		def productKeys = params.keySet()
		print productKeys
		for (Object keyProduct : productKeys) {
			println(keyProduct.value.toString().toLong())
			products.add(keyProduct.value.toString().toInteger())
		}
		print products
		def value = Request.findAll ("from Request as b where b.products.id=? ",[product.id])
		def a=true
		if(value.size()>0){
			 value.each {
				 if(it.user.username==toDoUser.username){
					 a=false //Ya hay peticion entre eso usuarios para ese producto
				 }
			 }
		}
		print a
		if (a){// Es la primera solicitud entonces la segunda se ignora
			mailService.sendMail {
					to "${userReceiving.email}"
					bcc "${toDoUser.email}"
					subject "Solicitud a la producto "+product.name
					html    g.render(template:'/email/request', model:[user1:userReceiving,user:toDoUser,price:price,product:product])
			}
			def theRequest = new Request(money:price,productsToRequest:products,userReciving:userReceiving)
		
			product.addToRequests(theRequest)
			toDoUser.addToRequests(theRequest)
		
			print product
			theRequest.save(flush:true)
			product.save(flush:true)
			toDoUser.save(flush:true)
		}
		
		
		redirect(controller:'user',action:'index')
	}
	
	def sendAuctionRequest(){
		def toDoUser = User.findByUsername(session.user)
		def product = Product.get(params.idTheProduct)
		def price = params.price.toDouble()
		def products = []
		def userReceiving = User.findByUsername(params.userReceiving)
		def today = new Date()
		def value = Request.findAll ("from Request as b where b.products.id=? ",[product.id])
		def a=true
		if(value.size()>0){
			 value.each {
				 if(it.user.username==toDoUser.username){
					 a=false //Ya hay peticion entre eso usuarios para ese producto
				 }
			 }
		}
		if(a){
			if(product.openingDate.compareTo(today)>=0 && product.closingDate.compareTo(today)<= 0){
				mailService.sendMail {
					to "${userReceiving.email}"
					bcc "${toDoUser.email}"
					subject "Solicitud a la producto "+product.name
					html    g.render(template:'/email/request', model:[user1:userReceiving,user:toDoUser,price:price,product:product])
				}
				def theRequest = new Request(money:price, productsToRequest:products,userReciving:userReceiving)
				product.addToRequests(theRequest)
				toDoUser.addToRequests(theRequest)
				theRequest.save(flush:true)
				product.save(flush:true)
				toDoUser.save(flush:true)
				//product.currentPrice = max(product.currentPrice, price)
				
			}
		}
		
		redirect(controller:'user',action:'index')
	}
	
	def sendDonateRequest(){
		
		def toDoUser = User.findByUsername(session.user)
		def product = Product.get(params.idTheProduct)
		def price = 0
		def products = []
		def userReceiving = User.findByUsername(params.userReceiving)
		def today = new Date()
		def value = Request.findAll ("from Request as b where b.products.id=? ",[product.id])
		def a=true
		if(value.size()>0){
			 value.each {
				 if(it.user.username==toDoUser.username){
					 a=false //Ya hay peticion entre eso usuarios para ese producto
				 }
			 }
		}
		if(a){
			if(product.openingDate.compareTo(today)>=0 && product.closingDate.compareTo(today)<= 0){
				mailService.sendMail {
					to "${userReceiving.email}"
					bcc "${toDoUser.email}"
					subject "Solicitud a la producto "+product.name
					html    g.render(template:'/email/request', model:[user1:userReceiving,user:toDoUser,price:price,product:product])
				}
				def theRequest = new Request(money:price,productsToRequest:products, userReciving:userReceiving)
				product.addToRequests(theRequest)
				toDoUser.addToRequests(theRequest)
				theRequest.save(flush:true)
				product.save(flush:true)
				toDoUser.save(flush:true)
			}
		}
		
		
		redirect(controller:'user',action:'index')
	}
	def showRequest(){
		def requests = Request.findAll("from Request as b where b.userReciving.username=? AND b.products.name",[session.user,params.name])
	}


}
