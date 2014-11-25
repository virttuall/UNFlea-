package unfleaplus

class Request {
	int [] productsToRequest
	User userReciving
	double money
	static belongsTo = [products:Product,user:User] //Este es el usuario que hace la solicitud
    static constraints = {
    }
}
