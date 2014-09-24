<!DOCTYPE html>
<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="AboutUs" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="about.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="modal.js" />
</head>

<!-- NAVBAR
================================================== -->
<body>
	<div class="navbar-wrapper">
		<div class="container size-menu">
			<div class="margin-menu navbar-inverse navbar-color navbar-fixed-top"
				role="navigation">
				<div class="container">
					<div class="navbar-header navbar-color">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<div class="logo-icon navbar-color">
							<g:link controller="index" action="viewHome">
								<asset:image src="REARU.png" alt="UNFlea+" height="50px"
									width="150px" />
							</g:link>
						</div>
					</div>
					<div class="navbar-collapse collapse navbar-color">
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
									<form role="form ">
										<div class="form-group form-margin">
											<input type="email" class="form-control" id="ejemplo_email_1"
												placeholder="${foo}">
										</div>
										<div class="form-group form-margin">
											<input type="password" class="form-control"
												id="ejemplo_password_1" placeholder="${foo1}">
										</div>
										<div class="form-margin">
											<label> <input type="checkbox"> <g:message
													code="rememberMe" />
											</label>
										</div>
										<button type="submit" class="form-margin btn btn-default">
											<g:message code="login" />
										</button>
									</form>
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


	<div class="container marketing">
		<h1>Team Members</h1>
		<div class="row">
			<div class="col-lg-4">
				<asset:image class="img-circle" src="FabianConejo.png"
					alt="Generic placeholder imag" height="140px" width="140px" />
				<h3>Fabian Conejo</h3>
				<a href="https://twitter.com/FabianConP"
					class="twitter-follow-button" data-show-count="false"
					data-size="large" data-dnt="true">Follow</a>

				<p>
					<g:message code="fabianDescription" />
				</p>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<asset:image class="img-circle" src="AndresGutierrez.png"
					alt="Generic placeholder imag" height="140px" width="140px" />
				<h3>Andres Gutierrez</h3>
				<a href="https://twitter.com/agutierrezt9410"
					class="twitter-follow-button" data-show-count="false"
					data-size="large" data-dnt="true">Follow</a>

				<p>
					<g:message code="andresDescription" />
				</p>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<asset:image class="img-circle" src="SamuelCabezas.png"
					alt="Generic placeholder imag" height="140px" width="140px" />
				<h3>Samuel Cabezas</h3>
				<a href="https://twitter.com/9406samuel"
					class="twitter-follow-button" data-show-count="false"
					data-size="large">Follow</a>

				<p>
					<g:message code="samuelDescription" />
				</p>
			</div>
			<!-- /.col-lg-4 -->
		</div>

		<!-- Three columns of text below the carousel -->
		<div class="row">
			<div class="col-lg-4">
				<asset:image class="img-circle" src="YeisonGarcia.png"
					alt="Generic placeholder imag" height="140px" width="140px" />
				<h3>Yeison Garcia</h3>
				<a href="https://twitter.com/yeisongg" class="twitter-follow-button"
					data-show-count="false" data-size="large">Follow</a>

				<p>
					<g:message code="yeisonDescription" />
				</p>

			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<asset:image class="img-circle" src="MateoNieto.png"
					alt="Generic placeholder imag" height="140px" width="140px" />
				<h3>Mateo Nieto</h3>
				<a href="https://twitter.com/mateonietod"
					class="twitter-follow-button" data-show-count="false"
					data-size="large" data-dnt="true">Follow</a>

				<p>
					<g:message code="mateoDescription" />
				</p>
			</div>
		</div>
	</div>

	<div id="footer">
		<div class="container">
			<ul>
				<p>
					<g:link params="[lang:'en']">
						<asset:image src="USA.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
					<g:link params="[lang:'es']">
						<asset:image src="espana.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
				</p>
				<p>
					&copy; 2014 UN Flea+. <a href="#">Privacy </a> &amp;<a href="#">
						Terms</a>
				</p>
			</ul>
		</div>
	</div>
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
	<script>
		!function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/
					.test(d.location) ? 'http' : 'https';
			if (!d.getElementById(id)) {
				js = d.createElement(s);
				js.id = id;
				js.src = p + '://platform.twitter.com/widgets.js';
				fjs.parentNode.insertBefore(js, fjs);
			}
		}(document, 'script', 'twitter-wjs');
	</script>
</body>
</html>