import org.apache.shiro.crypto.hash.Sha256Hash
import unfleaplus.User
import unfleaplus.Role
class BootStrap {

    def init = { servletContext ->
		def adminRole = new Role(name: "ROLE_USER")
		adminRole.addToPermissions("*:*")
		adminRole.save()
	   
		def userRole = new Role(name: "ROLE_USER")
		userRole.addToPermissions("User:home")
		userRole.save()
		
        def user = new User(username: "user123", passwordHash: new Sha256Hash("password").toHex())
		user.addToRoles(adminRole)
        user.addToPermissions("*:*")
        user.save()
    }

    def destroy = {
    }
}