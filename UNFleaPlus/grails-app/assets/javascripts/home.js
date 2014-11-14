$(function() {
	$('li img').on('click',function(){
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
	
});

$(document).on("click", ".openUpdateInfo", function () {
    var myIdProduct = $(this).data('id');
    var myNameProduct = $(this).data('name');
    var myDescProduct = $(this).data('desc');
    $(".modal-body #infoIdProduct").val( myIdProduct );
    $(".modal-body #myName").val( myNameProduct );
    $(".modal-body #myDescription").val( myDescProduct );
});

$(document).on("click", ".openUpdateImages", function () {
    var myIdProduct = $(this).data('id');
    var myNImages = $(this).data('nimages');
    var intMyNImages = parseInt($(this).data('nimages'));
    $(".modal-body #imagesIdProduct").val( myIdProduct );
    $(".modal-body #imagesNImages").val( (10-intMyNImages).toString() );
});