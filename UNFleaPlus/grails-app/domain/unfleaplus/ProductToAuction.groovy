package unfleaplus

import java.util.Date;

class ProductToAuction extends Product {
	float currentPrice
	Date openingDate
	Date closingDate
	
	static constraints = {
		openingDate(nullable:false,blank:false)
		closingDate(nullable:false,blank:false)
		currentPrice(nullable:false,blank:false)
	}

    
}
