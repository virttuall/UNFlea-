$(document).ready(function(){
	$("#img_01").elevateZoom({
		gallery:'gallery_01', cursor: 'pointer', galleryActiveClass: 'active',responsive:true,scrollZoom : true, imageCrossfade: true}); 
	$("#img_01").bind("click", function(e) {  
		var ez =   $('#img_01').data('elevateZoom');	
		
	});
	$('#slider3').Thumbelina({
        // Use vertical mode (default horizontal).
		$bwdBut:$('#slider3 .left'),    // Selector to left button.
        $fwdBut:$('#slider3 .right')  // Selector to bottom button.
    });
});
function sendLoginForm(){
	
	$("#formLogin").submit();
}
function onChangePrice(){
	var minCost = document.getElementById('price').value;
	minCost = minCost.replace("^[.0-9]","");
	if(minCost.length==0)
		minCost = "0";
	document.getElementById('price').value = minCost;
}

$(document).on("click", ".openNormalSendProduct", function () {
//    var myIdProduct = $(this).data('id');
//    $(".modal-body #deleteProductId").val( myIdProduct );
});

function sendNormalSendRequest(){
	$("#formNormalSendRequest").submit();
}

function sendAuctionSendRequest(){
	$("#formAuctionSendRequest").submit();
}

function sendDonateSendRequest(){
	$("#formDonateSendRequest").submit();
}