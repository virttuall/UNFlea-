<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="requestsVar" /> - ${user.username}</title>
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="home.css" />
<asset:javascript src="home.js" />




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

					<li><a href="#"> Home</a></li>
					<li><div class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<h4>
									<span class="glyphicon glyphicon-globe white"></span> <span
										class="badge"> ${totalRequest}
									</span>
								</h4>
							</a>
							<ul class="dropdown-menu" role="menu">
								<g:if test="${requests}">
									<g:each var="request" in="${requests}">
										<li><g:link controller="user" action="userRequest"
												params="[name:request]">
												${request}
											</g:link></li>
									</g:each>

								</g:if>


							</ul>
						</div></li>

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
						<g:message code="requestsVar" />
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
				<div class="col-xs-9">
					<g:each var="request" in="${requests1}">
						
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h3 class="panel-title">
									<g:message code="theUserVar" />
								</h3>
							</div>
							<div class="panel-body">
								<!-- User To Do -->
								<g:if test="${user.avatar}">
									<img class="avatar"
										src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
								</g:if>
								<h3 class="inline">
									${request.user}
								</h3>
								<a> <span
									class=" btn btn-default btn-sm glyphicon glyphicon-comment"></span>
								</a>
							</div>
						</div>
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h3 class="panel-title">
									<g:message code="offerVar" />
								</h3>
							</div>
							<div class="panel-body">
								<g:if test="${request.money>0}">
									<div class="panel panel-success">
										<div class="panel-heading">
											<h3 class="panel-title"><g:message code="moneyVar"/></h3>
										</div>
										<div class="panel-body">
											${request.money}
										</div>
									</div>
								</g:if>
								<g:if test="${products}">
									<div class="panel panel-info">
										<div class="panel-heading">
											<h3 class="panel-title"><g:message code="products"/></h3>
										</div>
										<div class="panel-body">
											
											<g:each var="product" in="${products}">
												<g:if test="${request.user == product.user}">
												<h3>
													${product.name}
												</h3>

												<div class="row">
													<g:each var="images" in="${product.image.take(4)}">
														<g:each var="image" in="${images}">
															<div
																class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
																<li class="img-thumbnail"><img
																	class="img-responsive"
																	style="width: 10em; height: 10em;"
																	src="${createLink(controller:'user', action:'product_image', id:image.getId())}">
																</li>
															</div>

														</g:each>
													</g:each>
												</div>
												</g:if>
											</g:each>
										
										</div>
									</div>
								</g:if>
							</div>
						</div>
					</g:each>

				</div>
			</div>
		</div>
	</div>

	<!-- Modal for show images -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
				</div>
				<div class="modal-body"></div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
</body>
</html>