class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		"/$lang/$controller/$action?/$id?"{
		
		}
		

		"/"(controller: 'index')
        "500"(view:'/error')
		
	}
	
}
