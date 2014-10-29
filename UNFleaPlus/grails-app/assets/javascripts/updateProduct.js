submitForms = function(){
	var name = document.getElementById('myName').value;
	document.getElementById('name').value = name;
	var desc = document.getElementById('myDescription').value;
	document.getElementById('description').value = desc;
	var state = document.getElementById('myState').value;
	document.getElementById('state').value = state;
//    document.forms["files"].submit();
//    document.forms["genDesc"].submit();
//    document.getElementById('myName').value = "";
}

function onChangeName(){
	var name = document.getElementById('myName').value;
	document.getElementById('name').value = name;
}

function onChangeDescription(){
	var desc = document.getElementById('myDescription').value;
	document.getElementById('description').value = desc;
}

function onChangeState(){
	var state = document.getElementById('myState').value;
	document.getElementById('state').value = state;
}