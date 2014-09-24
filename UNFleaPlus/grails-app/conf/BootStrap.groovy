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
		
        def user = new User(email:"agutierrezt@unal.edu.co",firstName:"Andres",lastName:"Gutierrez",username: "agutierrezt", 
			passwordHash: new Sha256Hash("gutierrez2011").toHex(),gender:"Male")
		user.addToRoles(adminRole)
        user.addToPermissions("*:*")
        user.save()
    }

    def destroy = {
    }
}