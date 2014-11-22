<!DOCTYPE html>
<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="welcome" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="init.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="modal.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:javascript src="search.js" />
<asset:javascript src="carousel.js" />

</head>
<body>

	<div class="navbar-wrapper">
		<div class="container size-menu">
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

											<input type="email" class="form-control" name="email"
												id="ejemplo_email_1" placeholder="${foo}" required>


										</div>
										<div class="form-group form-margin">

											<input type="password" class="form-control" name="password"
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

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<img src="https://lh4.googleusercontent.com/-Jeotk5sB7ko/VCsdHYUwpzI/AAAAAAAAUMo/l-fN4hmYqXs/w1591-h895-no/IMG_20140930_130155695_HDR.jpg" alt>
				<div class="carousel-caption">
					<h3>UNFlea+</h3>
					<p>
						<g:message code="message" />
					</p>
				</div>
			</div>
			
			<div class="item">
				<img src="https://lh3.googleusercontent.com/-erEm0c_PvZk/U-Ff6DgHmuI/AAAAAAAATzc/hDS0-XezvUs/w1187-h668-no/IMG_20140805_175021360_HDR.jpg" alt>
				<div class="carousel-caption">
					<h3><g:message code="develomentTeam" /></h3>
					<p>Andres Rene Gutierrez</p>
					<p>Yeison David García</p>
					<p>Fabian David Conejo</p>
					<p>Samuel Antonio Cabezas</p>
					<p>Mateo Nieto Díaz</p>
				</div>
			</div>

		</div>
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
		<a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
	</div>
	<!-- /.carousel -->
	<div id="footer">
		<div class="container">
			<ol>
				<g:if test="${flash.message}">
						<div class="info">
							${flash.message}
						</div>
				</g:if>
				<p>
					<g:link  controller="index" action="viewHome" params="[lang:'en']">
						<asset:image src="ingles.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
					<g:link controller="index" action="viewHome" params="[lang:'es']">
						<asset:image src="espanol.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
				</p>
				<p>
				<asset:image src="facebook.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="twitter.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="googleplus.png" alt="UNFlea+" height="40px"
							width="40px" />
				    <asset:image src="youtube.png" alt="UNFlea+" height="40px"
							width="40px" />
				    <asset:image src="in.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="github.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="instagram.png" alt="UNFlea+" height="40px"
							width="40px" />
				    <asset:image src="pinterest.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="vimeo.png" alt="UNFlea+" height="40px"
							width="40px" />
				</p>
				<p>
					
					&copy; 2014 UN Flea+. <a href="#">Privacy </a> &amp;<a href="#">
					
							
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
