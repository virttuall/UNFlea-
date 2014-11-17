$(function() {
	$('img').on('click',function(){
		var src = $(this).attr('src');
        var img = '<img src="' + src + '" class="img-responsive"/>';
  

        $('#myModal').modal();
        $('#myModal').on('shown.bs.modal', function(){
            $('#myModal .modal-body').html(img);
  
        })
        $('#myModal').on('hidden.bs.modal', function(){
            $('#myModal .modal-body').html('');
        });
   });
   	
})(jQuery);
