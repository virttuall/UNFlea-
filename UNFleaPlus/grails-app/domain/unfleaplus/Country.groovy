package unfleaplus

class Country {
	String name
	static hasMany=[city:City]
    static constraints = {
		name(nullable:false,blank:false)
    }
}
