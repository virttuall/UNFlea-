package unfleaplus

class Product {
	String name
	String description
	boolean state
	String type
	double currentPrice
	Date openingDate
	Date closingDate
	static hasMany=[image:Image,category:Category,requests:Request]
	static belongsTo= [user:User]
	static constraints ={
		tablePerHierarchy : false
		name(nullable:false,blank:false)
		description(nullable:false,blank:false)
	}
	
}
