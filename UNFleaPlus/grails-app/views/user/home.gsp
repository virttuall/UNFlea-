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
<asset:javascript src="dropzoneUpdateProduct.js" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="dropzone.css" />
<asset:javascript src="toogleMenu.js" />
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
				<div class="col-xs-offset-2 col-xs-7 col-lg-offset-1 col-lg-8">
					<div id="filterMyProducts">
						<g:message code="type" />
						<div class="checkbox-inline">
							<label><input type="checkbox" id="filterNormal" checked>
							<g:message code="normalVar" /></label>
						</div>
						<div class="checkbox-inline">
							<label><input type="checkbox" id="filterAuction" checked>
							<g:message code="auctionVar" /></label>
						</div>
						<div class="checkbox-inline">
							<label><input type="checkbox" id="filterDonate" checked>
							<g:message code="donateVar" /></label>
						</div>
						<g:each var="product" in="${products}">
							<div class="${product.type+'_TYPE' }">
								<div class="headerProduct">
									<h3 style="display: inline">
										${product.name}
									</h3>
									<h4 style="display: inline;">
										<g:if test="${product.type == 'NORMAL' }">
											<span class="label label-primary center-vertical"><g:message
													code="normalVar" /></span>
										</g:if>
										<g:else>
											<g:if test="${product.type == 'AUCTION'}">
												<span class="label label-success center-vertical"><g:message
														code="auctionVar" /></span>
											</g:if>
											<g:else>
												<span class="label label-warning center-vertical"><g:message
														code="donateVar" /></span>
											</g:else>
											<a class="openAdditionalInfo" data-toggle="modal"
												data-target="#modalAdditionalInformation"
												data-type="${product.type }"
												data-cur-price="${product.currentPrice }"
												data-open-date="${product.openingDate.format('M-d-yyyy h:mm a')}"
												data-close-date="${product.closingDate.format('M-d-yyyy h:mm a')}"
												id="additionalInfo"> <span
												class="glyphicon glyphicon-time"></span>
											</a>
										</g:else>
									</h4>
									<a class="openDeleteProduct btn btn-default btn-sm pull-right"
										data-toggle="modal" data-target="#modalConfirmDeleteProduct"
										data-id="${product.getId()}"> <span
										class='glyphicon glyphicon-trash'> </span>
									</a> <a class="openUpdateImages btn btn-default btn-sm pull-right"
										data-toggle="modal" data-target="#modalUpdateImages"
										data-id="${product.getId()}"
										data-nimages="${product.image.size()}" id="updateImages">
										<span class='glyphicon glyphicon-plus-sign'> </span>
									</a> <a class="openUpdateInfo btn btn-default btn-sm pull-right"
										data-toggle="modal" data-target="#modalUpdateInformation"
										data-id="${product.getId()}" data-name="${product.getName()}"
										data-desc="${product.getDescription() }"
										id="updateInformation"> <span
										class='glyphicon glyphicon-pencil'> </span>
									</a>
								</div>
								<div class="row">
									<g:each var="images" in="${product.image}">
										<g:each var="image" in="${images}">

											<div
												class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
												<li class="img-thumbnail"><a class="openDeleteImage"
													data-toggle="modal" data-target="#modalConfirmDeleteImage"
													data-id="${product.getId()}"
													data-idimage="${image.getId()}"> <span
														class='remove-product glyphicon glyphicon-remove pull-right'></span>
												</a><img class="img-responsive"
													style="width: 10em; height: 10em;"
													src="${createLink(controller:'user', action:'product_image', id:image.getId())}">
												</li>
											</div>

										</g:each>
									</g:each>
								</div>
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
			</div>
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
							<div class="modal-body">
								<g:form class="form-horizontal" id="update"
									url="[action:'updateData',controller:'product']" method="post">
									<g:set var="name_input" value="${g.message(code: 'nameVar')}"
										scope="page" />
									<g:set var="description_input"
										value="${g.message(code: 'descriptionVar')}" scope="page" />
									<g:set var="state_input" value="${g.message(code: 'stateVar')}"
										scope="page" />
									<fieldset>
										<input type="hidden" id="infoIdProduct" name="infoIdProduct">
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
													placeholder="${description_input }" rows="5"
													maxlength="200" required></textarea>
											</div>
										</div>
										<button type="submit" class="btn btn-primary btn-lg"
											style="float: right;">
											<g:message code="updateSend" />
										</button>
									</fieldset>
								</g:form>
							</div>

						</div>
						<%--<div class="modal-footer">
				</div>
			--%>
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
							<input type="hidden" id="imagesNImages" value="0">
							<fieldset>
								<div id="dropzone">
									<g:form url="[action:'addImage',controller:'product']"
										method="post" class="dropzone dz-clickable"
										enctype="multipart/form-data" id="updateImage" name="files">
										<input type="hidden" id="imagesIdProduct"
											name="imagesIdProduct">
									</g:form>
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

			<!-- Modal Aditional Information-->
			<div class="modal fade" id="modalAdditionalInformation" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">
								<g:message code="additionalInfoVar" />
							</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal">
								<div class="form-group sectionCurPrice">
									<label class="col-md-3 control-label" for="name"><g:message
											code="curPriceVar" /></label>
									<div class="col-md-9">
										<label id="lblCurPrice"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label" for="name"><g:message
											code="dateStartVar" /></label>
									<div class="col-md-9">
										<label id="lblOpenDate"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label" for="name"><g:message
											code="dateEndVar" /></label>
									<div class="col-md-9">
										<label id="lblEndDate"></label>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

			<!-- Modal Confirm Delete Product-->
			<div class="modal fade" id="modalConfirmDeleteProduct" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">
								<g:message code="confirmDeleteVar" />
							</h4>
						</div>
						<div class="modal-body">
							<p>
								<g:message code="deleteProductMessageVar" />
							</p>
							<g:form id="formDeleteProduct"
								url="[action:'deleteProduct',controller:'product']"
								method="post">
								<input type="hidden" id="deleteProductId" name="id" value="0">
							</g:form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">
								<g:message code="cancelVar" />
							</button>
							<button type="submit" class="btn btn-danger pull-right"
								onclick="sendDeleteProductForm()">
								<g:message code="delete" />
							</button>
						</div>
					</div>
				</div>
			</div>

			<!-- Modal Confirm Delete Image-->
			<div class="modal fade" id="modalConfirmDeleteImage" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">
								<g:message code="confirmDeleteVar" />
							</h4>
						</div>
						<div class="modal-body">
							<p>
								<g:message code="deleteImageMessageVar" />
							</p>
							<g:form id="formDeleteImage"
								url="[action:'deleteImage',controller:'product']" method="post">
								<input type="hidden" id="deleteProductId" name="idProduct"
									value="0">
								<input type="hidden" id="deleteImageId" name="idImage" value="0">
							</g:form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">
								<g:message code="cancelVar" />
							</button>
							<button type="submit" class="btn btn-danger pull-right"
								onclick="sendDeleteImageForm()">
								<g:message code="delete" />
							</button>
						</div>
					</div>
				</div>
			</div>

	<div id ="search" style="display: none;">${search}</div>

	<div class="footer">
		<div class="container">
			<ol>
				<g:if test="${flash.message}">
						<div class="info">
							${flash.message}
						</div>
				</g:if>
				<div class="col-xs-6 pull-left">
					<g:link  controller="index" action="viewHome" params="[lang:'en']">
						<asset:image src="ingles.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
					<g:link controller="index" action="viewHome" params="[lang:'es']">
						<asset:image src="espanol.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
				</div>
				<p>
				<div class="col-xs-6 pull-right">
					<a href="https://www.facebook.com/UNFleaPlus" class="pull-right">
						<asset:image src="facebook.png" alt="UNFlea+" height="40px" width="40px"/>
					</a>
					<a href="https://twitter.com/unfleaplus"  class="pull-right">
						<asset:image src="twitter.png" alt="UNFlea+" height="40px" width="40px" />
					</a>
				    <a href="https://github.com/virttuall/UNFlea-"  class="pull-right">
						<asset:image src="github.png" alt="UNFlea+" height="40px" width="40px" />
					</a>
				</div>
				<p>
					<span class="glyphicon glyphicon-copyright-mark"></span> 2014 UN Flea+. <a href="#">Privacy </a> &amp;<a href="#">
						Terms</a>
				</p>
			</ol>
		</div>
	</div>

</body>
</html>



