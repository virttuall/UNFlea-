function getStartDate(){var e=document.getElementById("myDateStart_day").val();var t=document.getElementById("myDateStart_month").val()-1;var n=document.getElementById("myDateStart_year").val();var r=document.getElementById("myDateStart_hour").val();var i=document.getElementById("myDateStart_minute").val();return new Date(n,t,e,r,i,0,0)}function getEndDate(){var e=document.getElementById("myDateEnd_day").value;var t=document.getElementById("myDateEnd_month").value-1;var n=document.getElementById("myDateEnd_year").value;var r=document.getElementById("myDateEnd_hour").value;var i=document.getElementById("myDateEnd_minute").value;return new Date(n,t,e,r,i,0,0)}function getState(){var e=document.getElementById("myNormalState").checked;var t=document.getElementById("myAuctionState").checked;var n="0";if(e)n="0";else if(t)n="1";else n="2";return n}function onChangeName(){var e=document.getElementById("myName").value;document.getElementById("name").value=e;if(e.length>5){$("#myDescription").removeProp("disabled")}else{$("#myDescription").attr("disabled","disabled")}}function onChangeDescription(){var e=document.getElementById("myDescription").value;document.getElementById("description").value=e;if(e.length>5)$("input[type = radio]").removeProp("disabled");else $("input[type = radio]").attr("disabled","disabled")}function onChangeState(){var e=document.getElementById("myAuctionState").checked;var t=document.getElementById("myDonateState").checked;document.getElementById("state").value=getState();if(e||t){$("#myAditionalOptions").show("fast");if(e)$("#myOptionMinimumCost").show("fast");else $("#myOptionMinimumCost").hide()}else{$("#myAditionalOptions").hide("fast");$("#myOptionMinimumCost").hide("fast")}}function onChangeMinimumCost(){var e=document.getElementById("myMinimumCost").value;e=e.replace("^[.0-9]","");if(e.length==0)e="0";document.getElementById("minimumCost").value=e;document.getElementById("myMinimumCost").value=e}submitForms=function(){var e=document.getElementById("myName").value;document.getElementById("name").value=e;var t=document.getElementById("myDescription").value;document.getElementById("description").value=t;document.getElementById("state").value=getState()};$(document).ready(function(){$("#myAditionalOptions").hide();$("#myOptionMinimumCost").hide();$("select[id ^= myDate]").addClass("fail_data");$("#datesAuction").hide();$("select[id ^= myDate]").change(function(){if(!(getEndDate().getTime()>getStartDate().getTime())){$("select[id ^= myDate]").addClass("fail_data");alert("Start date must be greater than actual date and end date must be greater than start date")}else{$("select[id ^= myDate]").removeClass("fail_data")}})})