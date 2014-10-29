<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="updateProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="updateProduct.css" />
<asset:javascript src="updateProduct.js" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="dropzone.js" />
<asset:javascript src="update.js" />
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
				<a class="font-menu" href="#"> 
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

	<div class="margin-top">
		<div class="container">
			<div class="row"> 
				<div class="col-xs-offset-5 col-xs-6 col-lg-6 col-sm-6">
					<a href="#" data-toggle="modal" data-target="#myModal">
						<asset:image class="avatarProduct" src="update.png" />
					</a>
					
				</div>
				
			</div>
			<div class="row">
				<div class="col-xs-offset-3 col-xs-3 col-lg-3 col-sm-3">
					<a href="#" data-toggle="modal" data-target="#myModal1">
						<asset:image class="avatarProduct" src="addImage.png" />
					</a>
				</div>
				<div class="col-xs-offset-1 col-xs-3 col-lg-3 col-sm-3">
					<a href="#" data-toggle="modal" data-target="#myModal2">
						<asset:image class="avatarProduct" src="deleteImage.png" />
					</a>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<div class="centering">
						<h3>
							<g:message  code="update"/>
						</h3>
					</div>

				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="update">
						<g:set var="name_input" value="${g.message(code: 'nameVar')}"
							scope="page" />
						<g:set var="description_input"
							value="${g.message(code: 'descriptionVar')}" scope="page" />
						<g:set var="state_input" value="${g.message(code: 'stateVar')}"
							scope="page" />
						<fieldset>
							<div class="form-group">
								<label class="col-md-3 control-label" for="name"><g:message
										code="nameVar" /></label>
								<div class="col-md-9">
									<input id="myName" name="myName" type="text"
										onchange="onChangeName()" placeholder="${name_input }"
										class="form-control" required>
								</div>
							</div>

							<!-- Description body -->
							<div class="form-group">
								<label class="col-md-3 control-label" for="message"><g:message
										code="descriptionVar" /></label>
								<div class="col-md-9">
									<textarea class="form-control" id="myDescription"
										onchange="onChangeDescription()" name="myDescription"
										placeholder="${description_input }" rows="5" maxlength="200"
										required></textarea>
								</div>
							</div>
							<!-- State selection -->

							<div class="form-group">
								<label class="col-md-3 control-label" for="state"><g:message
										code="stateVar" /></label>
								<div class="col-md-9">
									<select class="form-control" id="myState"
										onchange="onChangeState()">
										<option><g:message code="normalVar" /></option>
										<option><g:message code="auctionVar" /></option>
										<option><g:message code="donateVar" /></option>
									</select>
								</div>
							</div>
							<button type="submit" class="btn btn-primary btn-lg" style="float:right;">
											<g:message code="updateSend"/>
							</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<div class="centering">
						<h3>
							<g:message  code="addImage"/>
						</h3>
					</div>

				</div>
				<div class="modal-body">
					<fieldset>
						<div id="dropzone">
							<form controller="product" action="addProduct"
								class="dropzone dz-clickable" method="post"
								enctype="multipart/form-data" id="updateImage" name="files">
							</form>
							<div class="form-group" style="margin-top: 10px">
								<div class="col-md-12 text-right">
									<button type="submit" class="btn btn-primary btn-lg"
										id="submit-all" onclick="submitForms">
										<g:message code="updateSend" />
									</button>
								</div>
							</div>
						</div>
					</fieldset>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<div class="centering">
						<h3>
							<g:message  code="deleteImage"/>
						</h3>
					</div>

				</div>
				<div class="modal-body">
				
					<form id="deleteImage">
					<fieldset>
						<g:each var="images" in="${product.image}">
							<g:each var="image" in="${images}">
								<input type ="radio">
								<img class="deleteImage"
										src="${createLink(controller:'user', action:'product_image', id:image.getId())}"><br><br>
							</g:each>
						</g:each>
						<button type="submit" class="btn btn-primary btn-lg" style="float:right;">
											<g:message code="updateSend"/>
						</button>
					</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>