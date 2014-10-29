$( document ).ready(function() {
	$('.radio1').on('click',  function() {
	    if (this.getAttribute('checked')) { 
	        $(this).removeAttr('checked'); 
	    } else {
	        $(this).attr('checked', true); 
	    }
	});
});