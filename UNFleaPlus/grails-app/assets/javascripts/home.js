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

$(document).on("click", ".openAdditionalInfo", function () {
    var type = $(this).data('type');
    var curPrice = $(this).data('cur-price');
    if( type != "AUCTION")
    	$(".sectionCurPrice").hide();
    else
    	$(".sectionCurPrice").show();
    var openDate = $(this).data('open-date');
    var closeDate = $(this).data('close-date');
    $('#lblCurPrice').text('$ ' + curPrice);
    $('#lblOpenDate').text(openDate);
    $('#lblEndDate').text(closeDate);
});

$(document).on("click", ".openDeleteProduct", function () {
    var myIdProduct = $(this).data('id');
    $(".modal-body #deleteProductId").val( myIdProduct );
});

function sendDeleteProductForm(){
	$("#formDeleteProduct").submit();
}

$(document).on("click", ".openDeleteImage", function () {
    var myIdProduct = $(this).data('id');
    var myIdImage = $(this).data('idimage');
    $(".modal-body #deleteProductId").val( myIdProduct );
    $(".modal-body #deleteImageId").val( myIdImage );
});

function sendDeleteImageForm(){
	$("#formDeleteImage").submit();
}
