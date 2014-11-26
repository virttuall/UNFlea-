<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:stylesheet src="home.css" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="deleteProduct.css" />
<asset:javascript src="deleteProduct.js" />
<asset:javascript src="search.js" />
<asset:stylesheet src="search.css" />

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
				<a class="font-menu" href="#"> ${params.name}
				</a>
				<g:if test="${user.avatar}">
					<img class="avatar"
						src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
				</g:if>
				<a class="font-menu" href="#"> ${user.username}
				</a>
			</div>
			<div class="collapse navbar-collapse">
				<g:form class="navbar-form navbar-left" role="search" controller="product" action="searchProduct">
						<div class="form-group">
							<g:set var="search1" value="${g.message(code:'myProducts')}" scope="page"/>
							<input class="typeahead form-control" type="search" placeholder="${search1}" name="search" autocomplete="off">
									
        					<button type="submit" class="btn btn-default" type="button"><g:message code="searchText" /></button>
						</div>					
							
				</g:form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li><a href="#">Profile</a></li>
					<li><g:link controller="user" action="logout">Logout</g:link>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="margin-menu container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="well well-sm">
					<g:form class="form-horizontal" controller="product" action="deleteProduct1" method="post" name="myForm">
						<fieldset>
							<g:each var="product" in="${products}">
								<input type="radio" name="${product.name}" id="${product.getId()}" value="${product.getId()}" class="radio1" /><label class="text" for="${product.name}">${product.name}</label><br />
							</g:each>
							<button type="submit" class="form-margin btn btn-default">
								<g:message code="delete" />
							</button>
						</fieldset>
						
					</g:form>
					
				</div>
				
				<g:if test="${totalProduct<10}">
					<div class=pagination style="display: none;">
						<g:paginate controller="product" action="viewDeleteProduct" max="10"
						total="${totalProduct?:0}" />
					</div>
				</g:if>
				<g:else>
					<div class=pagination>
						<g:paginate controller="product" action="viewDeleteProduct" max="10"
						total="${totalProduct?:0}" />
					</div>
				</g:else>
				
			</div>
		</div>
	</div>
	<div id ="search" style="display: none;">${search}</div>
</body>
</html>
