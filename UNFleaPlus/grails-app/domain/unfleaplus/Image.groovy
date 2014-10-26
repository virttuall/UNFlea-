package unfleaplus

class Image {
	byte [] image
	static belongsTo=Product
    static constraints = {
		image(nullable:false,blank:false,maxSize: 10024 * 10024)
    }
}
