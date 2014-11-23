package unfleaplus

class User {
	byte[] avatar
	String email
	String username
	String firstName
	String lastName
	String passwordHash
	String gender
	boolean active
	String userCity
	String userCountry
	long reputation
	static hasMany = [ roles: Role, permissions: String,products:Product,requests:Request ]
    static constraints = {
		avatar(nullable:true,maxSize: 10024 * 10024)
		email(nullable: false,blank:false,unique:true)
		username(nullable: false,blank:false,unique:true)
		firstName(nullable: false,blank:false)
		lastName(nullable: false,blank:false)
		passwordHash(nullable: false,blank:false)
		gender(nullable: false,blank:false)
		userCity(nullable:false,blank:false)
		userCountry(nullable:false,blank:false)
    }
	
	String toString(){
		"$username"
	}
	

}
