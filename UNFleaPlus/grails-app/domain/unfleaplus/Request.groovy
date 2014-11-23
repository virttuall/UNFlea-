package unfleaplus

class Request {
	Product [] products
	double money
	static belongsTo = [products:Product,user:User]
    static constraints = {
    }
}
