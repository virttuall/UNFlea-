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
	static hasMany = [ roles: Role, permissions: String ]
    static constraints = {
		avatar(nullable:false,maxSize: 1024 * 1024)
		email(nullable: false,blank:false,unique:true)
		username(nullable: false,blank:false,unique:true)
		firstName(nullable: false,blank:false)
		lastName(nullable: false,blank:false)
		passwordHash(nullable: false,blank:false)
		gender(nullable: false,blank:false)
    }
	
	String toString(){
		"$username"
	}
	

}
