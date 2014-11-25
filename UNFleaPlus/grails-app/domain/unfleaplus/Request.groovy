package unfleaplus

class Request {
	Product [] productsToRequest
	double money
	static belongsTo = [products:Product,user:User]
    static constraints = {
    }
}
