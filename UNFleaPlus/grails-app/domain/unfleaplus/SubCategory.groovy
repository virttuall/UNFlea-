package unfleaplus

class SubCategory {
	String name
	static belongsTo =Category
    static constraints = {
		name(nullable:false,blank:false)
    }
}
