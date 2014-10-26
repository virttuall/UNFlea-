package unfleaplus

class Category {
	String name
	static hasMany=[products:Product,subCategory:SubCategory]
	static belongsTo= Product
    static constraints = {
		name(nullable:false,blank:false)
    }
}
