submitForms = function() {
	var name = document.getElementById('myName').value;
	document.getElementById('name').value = name;
	var desc = document.getElementById('myDescription').value;
	document.getElementById('description').value = desc;
	document.getElementById('state').value = getState();
//	checkDates();
	// document.forms["files"].submit();
	// document.forms["genDesc"].submit();
	// document.getElementById('myName').value = "";
}

function checkDates() {
	if (document.getElementById('myAuctionState').checked) {
		alert("Entro");
		var dayStart = document.getElementById('myDateStart_day').value;
		var monthStart = document.getElementById('myDateStart_month').value;
		var yearStart = document.getElementById('myDateStart_year').value;
		var hourStart = document.getElementById('myDateStart_hour').value;
		var minuteStart = document.getElementById('myDateStart_minute').value;
		var startDate = new Date(yearStart, monthStart, dayStart, hoursStart,
				minutesStart, 0, 0);
		alert("Start date " + startDate);

		var dayEnd = document.getElementById('myDateEnd_day').value;
		var monthEnd = document.getElementById('myDateEnd_month').value;
		var yearEnd = document.getElementById('myDateEnd_year').value;
		var hourEnd = document.getElementById('myDateEnd_hour').value;
		var minuteEnd = document.getElementById('myDateEnd_minute').value;
		var endDate = new Date(yearEnd, monthEnd, dayEnd, hoursEnd, minutesEnd,
				0, 0);
		alert("End date " + endDate);

		if (dates.compare(startDate, endDate) > 1)
			alert("Correct date");
	} else {
		alert("No entro");
	}
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