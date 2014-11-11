<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="default.home.label" /> - ${user.username}</title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="home.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="home.js" />
<asset:javascript src="dropzone.js" />
<asset:stylesheet src="main.css" />
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

				<div class="row">
					<g:link controller="product" action="viewAddProduct">
						<h3>
							<g:message code="addProduct" />
						</h3>
						<div
							class="margin-gallery  col-lg-10 col-md-10 col-sm-10 col-xs-10">
							<asset:image class="avatarProduct" src="addProduct.png" />
						</div>
					</g:link>
				</div>

				<p>
					<g:link controller="product" action="viewDeleteProduct">
						<h3>
							<g:message code="deleteProduct" />
						</h3>
						<div
							class="margin-gallery  col-lg-10 col-md-10 col-sm-10 col-xs-10">
							<asset:image class="avatarProduct" src="Delete_Icon.png" />
						</div>
					</g:link>
				</p>

			</div>

			<div class="col-xs-offset-1 col-xs-9">
				<g:each var="product" in="${products}">
					<div class="headerProduct">
						<g:link controller="product" action="viewUpdateProduct"
							params="[id:product.getId()]" class="linkEditProduct">
							<h3 style="display: inline">
								${product.name}
							</h3>

						</g:link>
						<g:link controller="product" action="deleteProduct"
							params="[id:product.getId()]">
							<button type="button" class="btn btn-default btn-sm pull-right">
								<span class='glyphicon glyphicon-trash'> </span>
							</button>
						</g:link>
						<button type="button" class="btn btn-default btn-sm pull-right"
							data-toggle="modal" data-target="#modalUpdateImages"
							id="updateImages">
							<span class='glyphicon glyphicon-plus-sign'> </span>
						</button>
						<button type="button" class="btn btn-default btn-sm pull-right"
							data-toggle="modal" data-target="#modalUpdateInformation"
							id="updateInformation">
							<span class='glyphicon glyphicon-pencil'> </span>
						</button>
					</div>
					<div class="row">
						<g:each var="images" in="${product.image}">
							<g:each var="image" in="${images}">

								<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
									<li class="thumbnail"><g:link
											params="[idProduct:product.getId(),idImage:image.getId()]"
											controller="product" action="theDeleteImage">
											<span
												class='remove-product glyphicon glyphicon-remove pull-right'></span>
										</g:link><img class="img-responsive"
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

	<!-- Modal Update Information -->
	<div class="modal fade" id="modalUpdateInformation" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">
						<g:message code="addImage" />
					</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" name="genDesc" controller="product"
						action="addProduct">
						<g:set var="name_input" value="${g.message(code: 'nameVar')}"
							scope="page" />
						<g:set var="description_input"
							value="${g.message(code: 'descriptionVar')}" scope="page" />
						<g:set var="state_input" value="${g.message(code: 'stateVar')}"
							scope="page" />
						<input type="hidden" id="infoIdProduct">
						<fieldset>
							<!-- Name input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="name"><g:message
										code="nameVar" /></label>
								<div class="col-md-9">
									<input id="myName" name="myName" type="text"
										onkeyup="onChangeName()" placeholder="${name_input }"
										class="form-control" required>
								</div>
							</div>

							<!-- Description body -->
							<div class="form-group">
								<label class="col-md-3 control-label" for="message"><g:message
										code="descriptionVar" /></label>
								<div class="col-md-9">
									<textarea class="form-control" id="myDescription"
										onkeyup="onChangeDescription()" name="myDescription"
										placeholder="${description_input }" rows="5" maxlength="200"
										required></textarea>
								</div>
							</div>
							<!-- State selection -->

							<div class="form-group">
								<label class="col-md-3 control-label" for="state"><g:message
										code="stateVar" /></label>
								<div class="col-md-9 disabled" id="myTypeState">
									<label class="radio-inline"> <input type="radio"
										name="myState" id="myNormalState" onchange="onChangeState()"
										checked disabled> <g:message code="normalVar" />
									</label> <label class="radio-inline"> <input type="radio"
										name="myState" id="myAuctionState" onchange="onChangeState()"
										disabled> <g:message code="auctionVar" />
									</label> <label class="radio-inline"> <input type="radio"
										name="myState" id="myDonateState" onchange="onChangeState()"
										disabled> <g:message code="donateVar" />
									</label>
								</div>
							</div>
							<div class="myAditionalOptions" id="myAditionalOptions">
								<g:set var="date_now" value="${dateNow = new Date()}" />
								<div class="form-group" id="myOptionMinimumCost">
									<label class="col-md-3 control-label" for="state"><g:message
											code="minimumCostVar" /></label>
									<div class="col-md-9">
										<div class="input-group">
											<span class="input-group-addon">$</span> <input type="number"
												class="form-control" id="myMinimumCost" name="myMinimumCost"
												min="0.01" max="1000000" step="0.01"
												onkeyup="onChangeMinimumCost()">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label" for="state"><g:message
											code="dateStartVar" /></label>
									<div class="col-md-9">
										<g:datePicker name="myDateStart" id="myDateStart"
											value="${dateNow}" precision="minute"
											years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label" for="state"><g:message
											code="dateEndVar" /></label>
									<div class="col-md-9">
										<g:datePicker name="myDateEnd" id="myDateEnd"
											value="${dateNow}" precision="minute"
											years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
									</div>
								</div>
							</div>


							<!-- Form actions -->


						</fieldset>

					</form>

				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary btn-lg"
						style="float: right;">
						<g:message code="updateSend" />
					</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal Update Images -->
	<div class="modal fade" id="modalUpdateImages" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">
						<g:message code="addImage" />
					</h4>
				</div>
				<div class="modal-body">
					<fieldset>
						<div id="dropzone">
							<form action="http://localhost:8080/UNFleaPlus/product/addImage"
								method="post" class="dropzone dz-clickable"
								enctype="multipart/form-data" id="updateImage" name="files">
								<%--
								<input id="product" name="product" type="hidden"
									value="${product.getId()}" />
								--%>
							</form>
						</div>
					</fieldset>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary btn-lg"
						id="submit-all" onclick="submitForms">
						<g:message code="updateSend" />
					</button>
				</div>
			</div>
		</div>
	</div>




</body>
</html>
