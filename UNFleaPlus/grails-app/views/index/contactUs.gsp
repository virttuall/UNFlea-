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
<asset:javascript src="modal.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:javascript src="search.js" />



</head>
<body>
	<div class="navbar-wrapper">
		<div class="size-menu">
			<div class="margin-menu navbar-inverse navbar-fixed-top navbar-color"
				role="navigation">
				<div class="container">
					<div class="navbar-header navbar-color">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> 
							<span class="icon-bar"></span> 
							<span class="icon-bar"></span> 
							<span class="icon-bar"></span>
						</button>
						<a href="/UNFleaPlus/index/viewHome" class="navbar-brand">UN Flea+
							<g:link controller = "index" action="viewHome"></g:link>
						</a>
					</div>
					<div class="navbar-collapse collapse navbar-color">
					<g:form class="navbar-form navbar-left" role="search" controller="product" action="searchProduct">
								<div class="form-group">
									<g:set var="search1" value="${g.message(code:'myProducts')}" scope="page"/>
									<input class="typeahead form-control" type="search" placeholder="${search1}" name="search" autocomplete="off">
									
        							<button type="submit" class="btn btn-default" type="button"><g:message code="searchText" /></button>
								</div>					
							
						</g:form>
						<ul class="nav navbar-nav navbar-right">

							<li><g:link controller="user" action="viewRegister">
									<g:message code="signUP" />
								</g:link></li>
							<li><a href="#" data-toggle="modal" data-target="#myModal"><g:message
										code="howUse" /></a></li>
							<!--Un video como el que dijo el profesor-->
							<li class="dropdown"><a class="dropdown-toggle" href="#"
								data-toggle="dropdown" id="navLogin"><g:message code="login" /></a>
								<ul class="dropdown-menu drowmenu-size" role="menu">
									<g:set var="foo" value="${g.message(code: 'email')}"
										scope="page" />
									<g:set var="foo1" value="${g.message(code: 'password')}"
										scope="page" />

									<g:form role="form" controller="user" action="login"
										method="post">
										<div class="form-group form-margin">

											<input type="email" name="email" class="form-control"
												id="ejemplo_email_1" placeholder="${foo}" required>


										</div>
										<div class="form-group form-margin">

											<input type="password" name="password" class="form-control"
												id="ejemplo_password_1" placeholder="${foo1}" required>

										</div>

										<div class="form-margin">
											<label> <input type="checkbox" name="rememberMe">
												<g:message code="rememberMe" />
											</label>
										</div>
										<button type="submit" class="form-margin btn btn-default">
											<g:message code="login" />
										</button>

									</g:form>




								</ul></li>
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


	<div class="container formContact-margin">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="well well-sm">
					
					<g:form class="form-horizontal" controller = "user" action="sendEmail" method="post">
						<g:set var="username_input"
						value="${g.message(code: 'usernameVar')}" scope="page" />
						<g:set var="email_input"
						value="${g.message(code: 'emailRegister')}" scope="page" />
						<g:set var="comments_input"
						value="${g.message(code: 'commentsVar')}" scope="page" />
						<fieldset>
							<legend class="text-center">
								<g:message code="contactUs" />
							</legend>

							<!-- Name input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="name"><g:message
										code="usernameVar" /></label>
								<div class="col-md-9">
									<input id="name" name="name" type="text"
										placeholder="${username_input }" class="form-control" required>
								</div>
							</div>

							<!-- Email input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="email"><g:message
										code="emailVar" /></label>
								<div class="col-md-9">
									<input id="email" name="email" type="email"
										placeholder="${email_input }" class="form-control" required>
								</div>
							</div>

							<!-- Message body -->
							<div class="form-group">
								<label class="col-md-3 control-label" for="message"><g:message
										code="comments" /></label>
								<div class="col-md-9">
									<textarea class="form-control" id="message" name="message"
										placeholder="${comments_input }" rows="5" maxlength="200"
										required></textarea>
								</div>
							</div>

							<!-- Form actions -->
							<div class="form-group">
								<div class="col-md-12 text-right">
									<button type="submit" class="btn btn-primary btn-lg">
										<g:message code="send" />
									</button>
								</div>
							</div>
						</fieldset>
					</g:form>
				</div>
			</div>
		</div>
	</div>

	<div id="footer">
		<div class="container">
			<ol>
				<p>
					<g:link  controller="index" action="viewContactUs" params="[lang:'en']">
						<asset:image src="ENDEF.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
					<g:link controller="index" action="viewContactUs" params="[lang:'es']">
						<asset:image src="ESDEF.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
					<g:link controller="index" action="viewContactUs" params="[lang:'fr']">
						<asset:image src="FRDEF.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
				</p>
				<p>
					<asset:image src="facebook.png" alt="UNFlea+" height="40px" width="40px"/>
					<a href="https://twitter.com/unfleaplus">
						<asset:image src="twitter.png" alt="UNFlea+" height="40px" width="40px" />
					</a>
					<asset:image src="googleplus.png" alt="UNFlea+" height="40px" width="40px" />
				    <asset:image src="youtube.png" alt="UNFlea+" height="40px" width="40px" />
				    <asset:image src="in.png" alt="UNFlea+" height="40px" width="40px" /> 
				    <a href="https://github.com/virttuall/UNFlea-">
						<asset:image src="github.png" alt="UNFlea+" height="40px" width="40px" />
					</a>
					<asset:image src="instagram.png" alt="UNFlea+" height="40px" width="40px" />
				    <asset:image src="pinterest.png" alt="UNFlea+" height="40px" width="40px" />
					<asset:image src="vimeo.png" alt="UNFlea+" height="40px" width="40px" />
				</p>
				<p>
					&copy; 2014 UN Flea+. <a href="#">Privacy </a> &amp;<a href="#">
						Terms</a>
				</p>
			</ol>
		</div>
	</div>
	<div id ="search" style="display: none;">${search}</div>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<div class="centering">
						<h3>
							<g:message code="tutorial" />
						</h3>
					</div>

				</div>
				<div class="modal-body"></div>
			</div>
		</div>
	</div>

</body>
</html>
