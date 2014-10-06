package unfleaplus

class City {
	String name
	static hasMany=[user:User]
	static belongsTo = Country
    static constraints = {
		name(nullable:false,blank:false) 
    }
}
