<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="updateProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:stylesheet src="main.css" />
<asset:javascript src="search.js" />
<asset:javascript src="modal.js" />
<asset:stylesheet src="search.css" />
<asset:stylesheet src="jquery.fancybox.css" />
<asset:javascript src="jquery.elevatezoom.js" />
<asset:javascript src="jquery.fancybox.js" />
<asset:javascript src="request.js" />

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
		<div class="row">
			
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<h2>${product.name}</h2>
			</div>
			<div class="row">
				<div class="col-xs-6">
					<g:if test="${product.image}">
					<img id="img_01"  class="fancybox"
					src="${createLink(controller:'product', action:'normal_image', id:product.image[0].getId())}" data-zoom-image="${createLink(controller:'product', action:'large_image', id:product.image[0].getId())}" />
									
					</g:if>
				</div>
				
			</div>
			
			<div id="gallery_01">
				<div class="row">
					<g:each var="images" in="${product.image}">
					<g:each var="image" in="${images}">


						<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12" style="margin-bottom: 20px;">
							<a href="#" data-image="${createLink(controller:'product', action:'normal_image', id:image.getId())}"  data-zoom-image="${createLink(controller:'product', action:'large_image', id:image.getId())}" > 
								<img id="img_01" class="fancybox"  src="${createLink(controller:'product', action:'small_image', id:image.getId())}"  /> 
							</a> 
							
						</div>
					



					</g:each>

				</g:each>
				</div>
				
			</div>
			
			<div class="row">
				<div class="col-xs-12"> 
					<g:form>
						<button class="btn btn-primary btn-lg" style="margin-bottom: 15px;">Request </button>
					</g:form>
				</div>
			</div>
			

		</div>
		
	</div>
	<div id="search" style="display: none;">
		${search}
	</div>
	<script>

</script>
</body>

</html>