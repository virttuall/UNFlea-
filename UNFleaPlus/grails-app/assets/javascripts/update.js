$(document).ready(function() {
	$('#myModal').on('hidden.bs.modal', function(){
		document.getElementById("update").reset();
    });
	$('#myModal2').on('hidden.bs.modal', function(){
		document.getElementById("deleteImage").reset();
    });
	
})(jQuery);