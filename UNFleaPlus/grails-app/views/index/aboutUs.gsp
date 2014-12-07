<!DOCTYPE html>
<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="AboutUs" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="about.css" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="sticky-footer.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="modal.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:javascript src="search.js" />




</head>

<!-- NAVBAR
================================================== -->
<body>
	<div id="wrap">
		<g:if test="${session.user}">
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>

						</button>
						<g:if test="${user.avatar}">
							<img class="avatar"
								src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
						</g:if>
						<a class="font-menu" href="#"> ${user.username}
						</a>

					</div>
					<div class="collapse navbar-collapse">
						<g:form class="navbar-form navbar-left" role="search"
							controller="product" action="searchProduct">
							<div class="form-group">
								<g:set var="search1" value="${g.message(code:'myProducts')}"
									scope="page" />
								<input class="typeahead form-control" type="search"
									placeholder="${search1}" name="search" autocomplete="off">

								<button type="submit" class="btn btn-default" type="button">
									<g:message code="searchText" />
								</button>
							</div>

						</g:form>
						<ul class="nav navbar-nav navbar-right">

							<li><a href="#"> Home</a></li>


							<li><a href="#">Profile</a></li>
							<li><g:link controller="user" action="logout">Logout</g:link>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</g:if>
		<g:else>
			<div class="navbar-wrapper">
				<div class="container size-menu">
					<div
						class="margin-menu navbar-inverse navbar-color navbar-fixed-top"
						role="navigation">
						<div class="container">
							<div class="navbar-header navbar-color">
								<button type="button" class="navbar-toggle"
									data-toggle="collapse" data-target=".navbar-collapse">
									<span class="sr-only">Toggle navigation</span> <span
										class="icon-bar"></span> <span class="icon-bar"></span> <span
										class="icon-bar"></span>
								</button>
								<a href="/UNFleaPlus/index/viewHome" class="navbar-brand">UN
									Flea+ <g:link controller="index" action="viewHome"></g:link>
								</a>
							</div>
							<div class="navbar-collapse collapse navbar-color">
								<g:form class="navbar-form navbar-left" role="search"
									controller="product" action="searchProduct">
									<div class="form-group">
										<g:set var="search1" value="${g.message(code:'myProducts')}"
											scope="page" />
										<input class="typeahead form-control" type="search"
											placeholder="${search1}" name="search" autocomplete="off">

										<button type="submit" class="btn btn-default" type="button">
											<g:message code="searchText" />
										</button>
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
										data-toggle="dropdown" id="navLogin"><g:message
												code="login" /></a>
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
		</g:else>

		<div class="container marketing">
			<h1>Team Members</h1>
			<div class="row">
				<div class="col-lg-4">
					<asset:image class="img-circle" src="UNFlea.png"
						alt="Generic placeholder imag" height="140px" width="140px" />
					<h3>UN Flea+</h3>
					<a href="https://twitter.com/unfleaplus"
						class="twitter-follow-button" data-show-count="true"
						data-size="large">Follow</a>

					<p>
						<g:message code="unfleaDescription" />
					</p>
				</div>
				<div class="col-lg-4">
					<asset:image class="img-circle" src="FabianConejo.png"
						alt="Generic placeholder imag" height="140px" width="140px" />
					<h3>Fabian Conejo</h3>
					<a href="https://twitter.com/FabianConP"
						class="twitter-follow-button" data-show-count="true"
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
						class="twitter-follow-button" data-show-count="true"
						data-size="large" data-dnt="true">Follow</a>

					<p>
						<g:message code="andresDescription" />
					</p>
				</div>
				<!-- /.col-lg-4 -->

				<!-- /.col-lg-4 -->
			</div>

			<!-- Three columns of text below the carousel -->
			<div class="row">
				<div class="col-lg-4">
					<asset:image class="img-circle" src="SamuelCabezas.png"
						alt="Generic placeholder imag" height="140px" width="140px" />
					<h3>Samuel Cabezas</h3>
					<a href="https://twitter.com/9406samuel"
						class="twitter-follow-button" data-show-count="true"
						data-size="large">Follow</a>

					<p>
						<g:message code="samuelDescription" />
					</p>
				</div>
				<div class="col-lg-4">
					<asset:image class="img-circle" src="YeisonGarcia.png"
						alt="Generic placeholder imag" height="140px" width="140px" />
					<h3>Yeison Garcia</h3>
					<a href="https://twitter.com/yeisongg"
						class="twitter-follow-button" data-show-count="true"
						data-size="large">Follow</a>

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
						class="twitter-follow-button" data-show-count="true"
						data-size="large" data-dnt="true">Follow</a>

					<p>
						<g:message code="mateoDescription" />
					</p>
				</div>
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
		<div id="search" style="display: none;">
			${search}
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
	</div>
	<div class="footer">
		<div class="container">
			<div class="col-xs-5 pull-left">
				<g:link controller="index" action="viewHome" params="[lang:'en']">
					<asset:image src="ingles.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewHome" params="[lang:'es']">
					<asset:image src="espanol.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
			</div>
			<div class="col-xs-7">
				<div style="float: right">
					<a href="https://www.facebook.com/UNFleaPlus" class=""> <asset:image
							src="facebook.png" alt="UNFlea+" height="40px" width="40px" />
					</a> <a href="https://twitter.com/unfleaplus" class=""> <asset:image
							src="twitter.png" alt="UNFlea+" height="40px" width="40px" />
					</a> <a href="https://github.com/virttuall/UNFlea-" class=""> <asset:image
							src="github.png" alt="UNFlea+" height="40px" width="40px" />
					</a>
				</div>
			</div>
			<span class="glyphicon glyphicon-copyright-mark"></span> 2014 UN
			Flea+. <a href="#">Privacy </a> &amp;<a href="#"> Terms</a>
		</div>
	</div>
</body>
</html>
