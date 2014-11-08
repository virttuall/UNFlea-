import org.apache.shiro.crypto.hash.Sha256Hash
import unfleaplus.City
import unfleaplus.Country
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
		def city = new City(name:"Bogota")
		def country = new Country(name:"Colombia")
		
		def user = new User(email:"andresrene2005@hotmail.com",firstName:"Andres",lastName:"Gutierrez",username: "andres930410",
			passwordHash: new Sha256Hash("gutierrez2011").toHex(),gender:"Male",active:true,avatar:null)
		user.addToRoles(adminRole)
		user.addToPermissions("*:*")
		city.addToUser(user)
		country.addToCity(city)
		user.save()
		country.save()
		city.save()
				
    }

    def destroy = {
    }
}