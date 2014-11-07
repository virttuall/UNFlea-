submitForms = function() {
	var name = document.getElementById('myName').value;
	document.getElementById('name').value = name;
	var desc = document.getElementById('myDescription').value;
	document.getElementById('description').value = desc;
	document.getElementById('state').value = getState();
	// document.forms["files"].submit();
	// document.forms["genDesc"].submit();
	// document.getElementById('myName').value = "";
}

function getState() {
	var normalState = document.getElementById('myNormalState').checked;
	var auctionState = document.getElementById('myAuctionState').checked;
	var theState = "0"
	if (normalState)
		theState = "0";
	else if (auctionState)
		theState = "1";
	else
		theState = "2"
	return theState
}

function onChangeName() {
	var name = document.getElementById('myName').value;
	document.getElementById('name').value = name;
}

function onChangeDescription() {
	var desc = document.getElementById('myDescription').value;
	document.getElementById('description').value = desc;
}

function onChangeState() {
	var auctionState = document.getElementById('myAuctionState').checked;
	document.getElementById('state').value = getState();
	if (auctionState)
		$("#myAuctionOptions").show("fast");
	else
		$("#myAuctionOptions").hide("fast");
}

$(document).ready(function() {
	$("#myAuctionOptions").hide();
});