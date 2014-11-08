<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="updateProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="search.css" />
<asset:javascript src="updateProduct.js" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="dropzone.js" />
<asset:javascript src="update.js" />
<asset:stylesheet src="dropzone.css" />
<asset:stylesheet src="main.css" />

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
									<input class="typeahead form-control" type="text" placeholder="States of USA">
									
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
	<div class="container form-margin1">
		<div class=col-xs-12>
			<div class="col-xs-2">se hacen los filtros avanzados de
				busqueda
			</div>
			<div class="col-xs-offset-2 col-xs-8">
				<div class="row">
				<g:each var="product" in="${products}">
						<div class="col-xs-12 col-sm-6 col-md-4 ">
							<g:if test="${product.image}">
								<img class="product"
										src="${createLink(controller:'user', action:'product_image', id:product.image[0].getId())}">
							</g:if>
							<p>${product.user.username}</p>
							<p>${product.description}</p>
							<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
						</div>
					
				</g:each>
				</div>
				<div class="row">
					<div class="pagination">
						<g:paginate controller="product" action="searchProduct" max="10"
							total="${totalProduct?:0}" />

					</div>
				</div>
			</div>
		</div>







	</div>

</body>
</html>