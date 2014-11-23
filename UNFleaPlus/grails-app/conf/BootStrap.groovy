import org.apache.shiro.crypto.hash.Sha256Hash
import unfleaplus.User
import unfleaplus.Role
class BootStrap {

    def init = { servletContext ->
		def adminRole = new Role(name: "ROLE_ADMI")
		adminRole.addToPermissions("*:*")
		adminRole.save()
	   
		def userRole = new Role(name: "ROLE_USER")
		userRole.addToPermissions("*:*")
		userRole.save()
		
		def user = new User(email:"andresrene2005@hotmail.com",firstName:"Andres",lastName:"Gutierrez",username: "andres930410",
			passwordHash: new Sha256Hash("gutierrez2011").toHex(),gender:"Male",active:true,avatar:null,userCity:'Boyaca',userCountry:'Colombia', reputation:50)
		user.addToRoles(adminRole)
		user.addToPermissions("*:*")
		user.save()
		
		def user2 = new User(email:"fdconejop@unal.edu.co",firstName:"Fabian",lastName:"Conejo",username: "fdconejop",
			passwordHash: new Sha256Hash("12345").toHex(),gender:"Male",active:true,avatar:null,userCity:'Bogota',userCountry:'Colombia', reputation:50)
		user2.addToRoles(adminRole)
		user2.addToPermissions("*:*")
		user2.save()
				
    }

    def destroy = {
    }
}