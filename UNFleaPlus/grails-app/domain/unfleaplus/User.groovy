package unfleaplus

class User {
	String email
	String userName
	String firstName
	String lastName
	String password
	String passwordConfirm
	String gender

    static constraints = {
		email(blank:false,unique:true)
		userName(blank:false,unique:true)
		firstName(blank:false)
		lastName(blank:false)
		password(blank:false)
		gender(blank:false)
    }
	
	String toString(){
		"$userName"
	}
}
