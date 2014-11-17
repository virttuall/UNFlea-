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
<asset:javascript src="toggleMenu1.js" />

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
					<img class="avatar"
						src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
				</g:if>
				<a class="font-menu" href="#"> ${user.username}
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






	<!-- ------------------------------------------------------------------------------------------- -->


	<div class="container margin-menu">
		<div class="row row-offcanvas row-offcanvas-left">

			<div class="row">
				<div class="col-xs-9 col-xs-offset-3 ">
					<h1 class="page-header">
						<g:message code="myProducts" />
					</h1>
				</div>
			</div>
			<div class="col-xs-12">
				<p class="pull-left visible-xs">
					<button type="button" class="btn btn-primary btn-xs"
						data-toggle="offcanvas">
						<g:message code="homeMenu" />
					</button>
				</p>
				<div class="col-xs-3 sidebar-offcanvas" id="sidebar"
					role="navigation">
					<g:link controller="user" action="viewHome">
						<h3>
							<i class="glyphicon glyphicon-user"></i>
							<g:message code="profile" />
						</h3>
					</g:link>
					<div class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<h3>
								<i class="glyphicon glyphicon-th-large"></i>
								<g:message code="products" />
								<b class="caret"></b>
							</h3>
						</a>
						<ul class="dropdown-menu" role="menu">
							<li><g:link controller="product" action="viewAddProduct">
									<h4>
										<i class="glyphicon glyphicon-plus-sign"></i>
										<g:message code="addProduct" />
									</h4>
								</g:link></li>
							<li><g:link controller="product" action="viewDeleteProduct">
									<h4>
										<i class="glyphicon glyphicon-trash"></i>
										<g:message code="deleteProduct" />
									</h4>
								</g:link></li>
						</ul>
					</div>

				</div>
				<div class="col-xs-offset-2 col-xs-7 col-lg-offset-1 col-lg-8 ">
					<g:each var="product" in="${products}">
						<g:link controller="product" action="viewUpdateProduct"
							params="[id:product.getId()]">
							<h3>
								name:${product.name}
							</h3>
						</g:link>
						<div class="row">
							<g:each var="images" in="${product.image}">
								<g:each var="image" in="${images}">


								<div class="margin-gallery  col-lg-3 col-md-4 col-sm-6 col-xs-12">
									
									<li class="img-thumbnail"><img class="img-responsive " style="width: 10em; height: 10em;"
										src="${createLink(controller:'user', action:'product_image', id:image.getId())}">
									</li>
								</div>



								</g:each>

							</g:each>

						</div>
					</g:each>
					<g:if test="${totalProduct<10}">
						<div class="pagination" style="display: none">
							<g:paginate controller="user" action="list" max="10"
								total="${totalProduct?:0}" />
						</div>
					</g:if>
					<g:else>
						<div class="pagination">
							<g:paginate controller="user" action="list" max="10"
								total="${totalProduct?:0}" />
						</div>
					</g:else>

				</div>
			</div>
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

	</div>
</body>
</html>





