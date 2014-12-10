<center>
	<h1><g:message code="greeting" /> ${user.firstName}<p><g:message code="welcome" /></p></h1>
	<p><g:message code="usernameVar" />: ${user.username}</p>
	<p><g:message code="password" />: ${password}</p>
	<p><g:message code="toValidateAccount" /></p>
	<g:createLink controller="user" action="confirmEmail" base="http://unfleaplus-unfleaplus.rhcloud.com" params="[email: user.email, password:password]" />								
</center>
