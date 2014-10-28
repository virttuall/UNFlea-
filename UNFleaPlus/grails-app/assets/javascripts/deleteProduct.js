$( document ).ready(function() {
	$('.radio').on('click',  function() {
	    if (this.getAttribute('checked')) { 
	        $(this).removeAttr('checked'); 
	    } else {
	        $(this).attr('checked', true); 
	    }
	});
});