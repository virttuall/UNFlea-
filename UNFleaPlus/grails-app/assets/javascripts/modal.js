$(function() {
	
	$('#myModal').on('shown.bs.modal', function(){
		$('#myModal .modal-body').html('<iframe width="100%" height="350" src="//www.youtube.com/embed/ybgOv-k5mOk"></iframe>');
    });
    $('#myModal').on('hidden.bs.modal', function(){
    	$('#myModal .modal-body').html('');
    });
    
})(jQuery);

