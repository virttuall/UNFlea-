<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Simple Chat</title>
<g:javascript library="jquery" plugin="jquery" />
<style type="text/css">
  #chatMessages { color: black; font-family: Verdana; width:1130px; height:600px;margin-left:   100px;}
  #messageBox { width: 1130px; margin-left:   100px;}
</style>
</head>
<body>
		<div id="chatMessages"></div>
		<input type="text" id="messageBox" name="message" onkeypress="messageKeyPress(this,event);"/>
		<div id="temp"></div>

	<script>
		function messageKeyPress(field, event) {
			var theCode = event.keyCode ? event.keyCode
					: event.which ? event.which : event.charCode;
			var message = $('#messageBox').val();
			if (theCode == 13) {
				<g:remoteFunction action="submitMessage" params="\'message=\'+message" update="temp"/>
				$('#messageBox').val('');
				return false;
			} else {
				return true;
			}
		}
		function retrieveLatestMessages() {
			<g:remoteFunction action="retrieveLatestMessages" update="chatMessages"/>
		}
		function pollMessages() {
			retrieveLatestMessages();
			setTimeout('pollMessages()', 5000);
		}
		pollMessages();
	</script>
</body>
</html>






