<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="deleteProduct.css" />
<asset:javascript src="deleteProduct.js" />

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
	<div class="margin-menu container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="well well-sm">
					<form class="form-horizontal" controller="product" action="deleteProduct" method="post" name="myForm">
						<fieldset>
							<g:each var="product" in="${products}">
								<input type="radio" name="${product.name}" id="${product.getId()}" value="${product.getId()}" class="radio1" /><label class="text" for="${product.name}">${product.name}</label><br />
							</g:each>
							<button type="submit" class="form-margin btn btn-default">
								<g:message code="delete" />
							</button>
						</fieldset>
						
					</form>
					
				</div>
				<div class=pagination>
					<g:paginate controller="product" action="viewDeleteProduct" max="10"
						total="${totalProduct?:0}" />
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>