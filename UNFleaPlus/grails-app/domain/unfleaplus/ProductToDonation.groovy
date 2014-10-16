package unfleaplus

import java.util.Date;

class ProductToDonation extends Product{
	Date openingDate
	Date closingDate
	static constraints = {
		openingDate(nullable:false,blank:false)
		closingDate(nullable:false,blank:false)
	}
    
}
