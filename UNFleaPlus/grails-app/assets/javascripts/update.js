$(document).ready(function() {
	$('#myModal').on('hidden.bs.modal', function(){
		document.getElementById("update").reset();
    });
	$('#myModal2').on('hidden.bs.modal', function(){
		document.getElementById("deleteImage").reset();
    });
	$('.radio1').on('click',  function() {
	    if (this.getAttribute('checked')) { 
	        $(this).removeAttr('checked'); 
	    } else {
	        $(this).attr('checked', true); 
	    }
	});
	
})(jQuery);