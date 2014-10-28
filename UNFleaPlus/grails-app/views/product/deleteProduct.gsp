<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:stylesheet src="main.css" />
<asset:javascript src="deleteProduct.js" />

</head>
<body>
	
	<form class="form-horizontal" controller="product" action="deleteProduct" method="post" name="myForm">
		<g:each var="product" in="${products}">
			<input type="radio" name="${product.name}" id="${product.getId()}" value="${product.getId()}" class="radio" /><label for="${product.name}">${product.name}</label><br />
		</g:each>
		<button type="submit" class="form-margin btn btn-default">
			<g:message code="delete" />
		</button>
	</form>
	<div class=pagination>
		<g:paginate controller="user" action="listDelete" max="20"
			total="${totalProduct?:0}" />
	</div>
</body>
</html>