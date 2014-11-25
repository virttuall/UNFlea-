package unfleaplus

class Request {
	User userReciving
	double money
	static belongsTo = [products:Product,user:User] //Este es el usuario que hace la solicitud
    static constraints = {
    }
}
