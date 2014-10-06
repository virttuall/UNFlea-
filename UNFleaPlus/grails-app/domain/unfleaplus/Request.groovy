package unfleaplus

class Request {
	Product [] products
	double money
	static belongsTo = [Product,User]
    static constraints = {
    }
}
