package unfleaplus

class User {
	String email
	String username
	String firstName
	String lastName
	String passwordHash
	String gender
	boolean active
	static hasMany = [ roles: Role, permissions: String,products:Product,request:Request ]
	static belongsTo = City
    static constraints = {
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
