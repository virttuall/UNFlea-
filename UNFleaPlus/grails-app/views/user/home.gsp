<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="login" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="home.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="home.js" />
<asset:stylesheet src="main.css" />

</head>
<body>

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
  					<img class="avatar" src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
				</g:if>
				<a class="font-menu" href="#">
					${user.username}
				</a>
				
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li><a href="#">Profile</a></li>
					<li><g:link controller="user" action="logout">Logout</g:link>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	
	
	
	<div class="container margin-menu">
		<div class="row">
			<div class="col-xs-9 col-xs-offset-3 ">
				<h1 class="page-header">
					<g:message code="myProducts" />
				</h1>
			</div>
		</div>

		<ul class="row">
			<div class="col-xs-2">
					<g:link controller="product" action="viewAddProduct">
						<g:message code="addProduct" />
					</g:link>
					<p>Hacer una barra como la de facebook</p>	
			</div>

			<div class="col-xs-offset-1 col-xs-9">
							
						<g:each var="product" in="${products}">
							<p>name:${product.name}</p>
							<div class="row">
							<g:each var="images" in="${product.image}">
								<g:each var="image" in="${images}">
								<div class="margin-gallery  col-lg-3 col-md-3 col-sm-4 col-xs-6">
									<li class="thumbnail">	
										<img class="img-responsive"
											src="${createLink(controller:'user', action:'product_image', id:image.getId())}">
									</li>
								</div>
								</g:each>
							</g:each>
							</div>
						</g:each>
					<div class="pagination">
							<g:paginate controller="user" action="list" max="10"
								total="${totalProduct?:0}" />
					</div>	
					
				</div>
				
								
		</ul>
	</div>

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body"></div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	
	

</body>
</html>
