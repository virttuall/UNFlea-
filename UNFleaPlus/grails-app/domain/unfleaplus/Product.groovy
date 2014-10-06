package unfleaplus

class Product {
	String name
	String description
	boolean state
	static hasMany=[image:Image,category:Category,request:Request]
	static belongsTo= User
	
}
class ProductToDonation extends Product{
	Date openingDate
	Date closingDate
	static constraints = {
		table = 'ProductToDonation'
		openingDate(nullable:false,blank:false)
		closingDate(nullable:false,blank:false)
	}
}
class ProductToAuction extends Product{
	float currentPrice
	Date openingDate
	Date closingDate
	
	static constraints = {
		table = 'ProductToAuction'
		openingDate(nullable:false,blank:false)
		closingDate(nullable:false,blank:false)
		currentPrice(nullable:false,blank:false)
	}
}
