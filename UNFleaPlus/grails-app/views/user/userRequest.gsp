<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="default.home.label" /> - ${user.username}</title>
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="home.css" />
<asset:stylesheet src="chat.js" />
<asset:javascript src="chat.js" />

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
								<span class="glyphicon glyphicon-globe white"></span>
								<span class="badge">${totalRequest}</span>
							</h4>
						</a>
						<ul class="dropdown-menu" role="menu">
							<g:if  test ="${requests}">
								<g:each var="request" in="${requests}">
									<li>
										<g:link controller="user" action="userRequest" params="[name:request]"> ${request} </g:link>
									</li>
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
		
		
		<g:each var="request" in ="${requests1}">
			<a href="javascript:void(0)" onclick="javascript:chatWith('${request.user}')">${request.user}</a>
			<p>${request.money}</p>
		</g:each>
		<g:each var="product" in="${products}">
			<h3>${product.name}]</h3>
			<div class="row">
				<g:each var="images" in="${product.image}">
					<g:each var="image" in="${images}">
						<div class="col-xs-4 col-lg-3">
							<img class="img-responsive" style="width: 10em; height: 10em;"
						src="${createLink(controller:'user', action:'product_image', id:image.getId())}">
						</div>
						
					</g:each>
				</g:each>
			</div>
			
		</g:each>
	</div>
</body>
</html>