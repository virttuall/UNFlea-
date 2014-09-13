<!DOCTYPE html>
<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="contactUs" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="contact.css" />
<asset:javascript src="bootstrap.js" />



</head>
<body>
	<div class="navbar-wrapper">
		<div class="container">
			<div class="navbar navbar-inverse navbar-static-top navbar-color"
				role="navigation">
				<div class="container">
					<div class="navbar-header navbar-color">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a href="#" class="logo-icon navbar-color"> <asset:image
								src="REARU.png" alt="UNFlea+" height="50px" width="150px" />
						</a>
					</div>
					<div class="navbar-collapse collapse navbar-color">
						<ul class="nav navbar-nav">
							<li><g:link controller="user" action="viewRegister">
									<g:message code="signUP" />
								</g:link></li>
							<li><a href="#" data-toggle="modal"
								data-target="#normalModal"><g:message code="howUse" /></a></li>
							<li><g:link controller="user" action="viewLogin">
									<g:message code="login" />
								</g:link></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><g:message code="more" /> <b
									class="caret"></b></a>
								<ul class="dropdown-menu" role="menu">
									<li><g:link controller="index" action="viewContactUs">
											<g:message code="contactUs" />
										</g:link></li>
									<li><g:link controller="index" action="viewAboutUs">
											<g:message code="aboutUs" />
										</g:link></li>
								</ul></li>
						</ul>
					</div>

				</div>
			</div>
		</div>
	</div>
	
	<!-- Content -->
	
	<div class="footer">
		<center>
			<g:link params="[lang:'en']">
				<asset:image src="USA.png" alt="UNFlea+" height="55px" width="55px" />
			</g:link>
			<g:link params="[lang:'es']">
				<asset:image src="espana.png" alt="UNFlea+" height="55px"
					width="55px" />
			</g:link>
		</center>
	</div>

</body>
</html>