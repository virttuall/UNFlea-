$(document).ready(function(){
	$("#img_01").elevateZoom({
		gallery:'gallery_01', cursor: 'pointer', galleryActiveClass: 'active',responsive:true,scrollZoom : true, imageCrossfade: true}); 
	$("#img_01").bind("click", function(e) {  
		var ez =   $('#img_01').data('elevateZoom');	
		 
	});
});