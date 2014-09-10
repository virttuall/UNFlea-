package unfleaplus

class User {
	String email
	String userName
	String firstName
	String LastName
	String password

    static constraints = {
		email(blank:false,unique:true)
		userName(blank:false,unique:true)
		firstName(blank:false)
		lastName(blank:false)
		password(blank:false)
    }
	
	String toString(){
		"$userName"
	}
}
