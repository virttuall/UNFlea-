$(function() {
	
	$('.img-modal').on('click',function(){
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
	
	$('input:checkbox').change(function () {
        if($('#filterNormal').is(':checked'))
        	$('.NORMAL_TYPE').show("fast");
        else
        	$('.NORMAL_TYPE').hide("fast");
        if($('#filterAuction').is(':checked'))
        	$('.AUCTION_TYPE').show("fast");
        else
        	$('.AUCTION_TYPE').hide("fast");
        if($('#filterDonate').is(':checked'))
        	$('.DONATE_TYPE').show("fast");
        else
        	$('.DONATE_TYPE').hide("fast");
    });
	
});