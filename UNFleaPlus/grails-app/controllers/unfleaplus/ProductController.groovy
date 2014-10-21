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
		def all =request.getFileNames()
		for(var in all){//Aca estoy intentando recuperar la imagen y transformala a bits pero no esta funcionando
			println("${var}")
			println("${request.getFile(var).getBytes()}")
			
		}
	}
}