<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="addProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="addProduct.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="dropzone.js" />
<asset:stylesheet src="dropzone.css" />
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
					
					<form class="form-horizontal" action="" method="post">
						<g:set var="name_input" value="${g.message(code: 'nameVar')}"
							scope="page" />
						<g:set var="description_input"
							value="${g.message(code: 'descriptionVar')}" scope="page" />
						<g:set var="state_input" value="${g.message(code: 'stateVar')}"
							scope="page" />
						<fieldset>
							<legend class="text-center">
								<g:message code="addProduct" />
							</legend>

							<!-- Name input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="name"><g:message
										code="nameVar" /></label>
								<div class="col-md-9">
									<input id="name" name="name" type="text"
										placeholder="${name_input }" class="form-control" required>
								</div>
							</div>

							<!-- Description body -->
							<div class="form-group">
								<label class="col-md-3 control-label" for="message"><g:message
										code="descriptionVar" /></label>
								<div class="col-md-9">
									<textarea class="form-control" id="description"
										name="description" placeholder="${description_input }"
										rows="5" maxlength="200" required></textarea>
								</div>
							</div>
							<!-- State selection -->

							<div class="form-group">
								<label class="col-md-3 control-label" for="state"><g:message
										code="stateVar" /></label>
								<div class="col-md-9">
									<select class="form-control" required>
										<option><g:message code="normalVar" /></option>
										<option><g:message code="auctionVar" /></option>
										<option><g:message code="donateVar" /></option>
									</select>
								</div>
							</div>
							
							<!-- Form actions -->
							

						</fieldset>
						
					</form>
					<fieldset>
					<div id="dropzone">
						<form controller="product" action="addProduct" class="dropzone dz-clickable"  method="post" enctype="multipart/form-data" >	
								
						</form>
						<div class="form-group" style="margin-top: 10px">
							<div class="col-md-12 text-right">
								<button type="submit" class="btn btn-primary btn-lg"
										id="submit-all">
									<g:message code="send" />
								</button>
							</div>
						</div>
					</div>
					</fieldset>
					
				</div>

			</div>
		</div>
	</div>


</body>
</html>