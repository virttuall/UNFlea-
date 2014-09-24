<center>
	<h1>Hello ${user.firstName}<p>Welcome to UNFLE+.</p></h1>
	<p>Username: ${user.username}</p>
	<p>password: ${password}</p>
	<g:createLink controller="user" action="confirmEmail" base="http://localhost:8080/UNFleaPlus" params="[email: user.email, password:password]" />
								
</center>