$(document).ready(function() {
	var country_arr=new Array("Argentina","Colombia","Chile","USA");
	var state=new Array();
	state[0]="";
	state[1]="Buenos Aires|Catamarca|Chaco|Chubut|Córdoba|Corrientes|Distrito Federal|Entre Ríos|Formosa|Jujuy|La Pampa|" +
			"La Rioja|Mendoza|Misiones|Neuquén|Río Negro|Salta|San Juan|San Luis|Santa Cruz|Santa Fe|Santiago del Estero|" +
			"Tierra del Fuego|Tucumán"
	state[2]="Amazonas|Antioquia|Arauca|Atlantico|Bolivar|Boyaca|Caldas|Caqueta|Casanare|Cauca|Cesar|Choco|Cordoba" +
	"|Cundinamarca|Guainia|Guaviare|Huila|La Guajira|Magdalena|Meta|Nariño|Norte de Santander|Putumayo|Quindio|Risaralda" +
	"|San Andres y Providencia|Santader|Sucre|Tolima|Valle del Cauca|Vaupes|Vichada";
	state[3]="Antafagosta|Araucanía|Arica y Parinacota|Atacama|Aysén del General Carlos Ibañez del Campo|Bío-Bío|Coquimbo|Lagos|" +
			"Libertador General Bernardo O'higgins|Magallanes y la Antartica Chilena|Maule|Metropolitana|Ríos|Tarapacá|Valparaiso"
	state[4]="Alabama|Alaska|Arizona|Arkansas|California|Colorado|Connecticut|Delaware|Florida|Georgia|" +
			"Hawaii|Idaho|Illinois|Indiana|Iowa|ansas|Kentucky|Louisiana|Maine|Maryland|Massachusetts|Michigan|Minnesota|" +
			"Mississippi|Missouri|Montana|Nebraska|Nevada|New Hampshire|New Jersey|New Mexico|New York|North Carolina|North Dakota|" +
			"Ohio|Oklahoma|Oregon|Pennsylvania|Rhode Island|South Carolina|South Dakota|Tennessee|Texas|Utah|Vermont|Virginia" +
			"|Washington|West Virginia|Wisconsin|Wyoming";
	
	
	$('#country').ready(function(){
		var a= $('.country').text();
		a = a.trim();
		var option_str = document.getElementById('country');
		option_str.length=0;
	    option_str.options[0] = new Option('----------','');
	    option_str.selectedIndex = 0;
	    for (var i=0; i<country_arr.length; i++) {
	    	
	    	option_str.options[option_str.length] = new Option(country_arr[i],country_arr[i]);
	    	if(a==country_arr[i]){
	    		option_str.selectedIndex = i+1;
	    			
	    	}
	    	
	    }
	    var selected=document.getElementById('country').selectedIndex;
		
		if(selected!=0){
			var b= $('.state').text();
			b=b.trim();
			$("#selected-state").css("display","block");
			var option_state= document.getElementById('state');
			option_state.length=0;
			option_state.options[0]=new Option("----------",'');
			option_state.selectedIndex = 0;
			var state_arr= state[selected].split("|");
			for (var i =0; i<state_arr.length; i++){
				option_state.options[option_state.length]=new Option(state_arr[i],state_arr[i]);
				if(b==state_arr[i]){
					option_state.selectedIndex = i+1;
		    			
		    	}

			
			}
		}else{
			option_state.selectedIndex = 0;
			$("#selected-state").css("display","none");
			
		}
	   
		
	});
	$('#country').change(function(){
		var selected=document.getElementById('country').selectedIndex;
		
		if(selected!=0){
			var b= $('.state').text();
			$("#selected-state").css("display","block");
			var option_state= document.getElementById('state');
			option_state.length=0;
			option_state.options[0]=new Option("----------",'');
			option_state.selectedIndex = 0;
			var state_arr= state[selected].split("|");
			for (var i =0; i<state_arr.length; i++){
				option_state.options[option_state.length]=new Option(state_arr[i],state_arr[i]);
				if(b==state_arr[i]){
					option_state.selectedIndex = i+1;
		    			
		    	}
			
			}
		}else{
			$("#selected-state").css("display","none");
		}
	});
	
	
})(jQuery);