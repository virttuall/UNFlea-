function sendLoginForm(){$("#formLogin").submit()}function onChangePrice(){var e=document.getElementById("price").value;e=e.replace("^[.0-9]","");if(e.length==0)e="0";document.getElementById("price").value=e}function sendNormalSendRequest(){$("#formNormalSendRequest").submit()}function sendAuctionSendRequest(){$("#formAuctionSendRequest").submit()}function sendDonateSendRequest(){$("#formDonateSendRequest").submit()}$(document).ready(function(){$("#img_01").elevateZoom({gallery:"gallery_01",cursor:"pointer",galleryActiveClass:"active",responsive:true,scrollZoom:true,imageCrossfade:true});$("#img_01").bind("click",function(e){var t=$("#img_01").data("elevateZoom")});$("#slider3").Thumbelina({$bwdBut:$("#slider3 .left"),$fwdBut:$("#slider3 .right")})});$(document).on("click",".openNormalSendProduct",function(){})