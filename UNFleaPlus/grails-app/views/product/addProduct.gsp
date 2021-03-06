<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="addProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="addProduct.css" />
<asset:stylesheet src="dropzone.css" />
<asset:stylesheet src="home.css" />
<asset:stylesheet src="navbar.css" />
<asset:stylesheet src="search.css" />
<asset:stylesheet src="sticky-footer.css" />
<asset:javascript src="addProduct.js" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:javascript src="dropzoneAddProduct.js" />
<asset:javascript src="home.js" />
<asset:javascript src="search.js" />
<asset:javascript src="toogleMenu.js" />

</head>
<body>
	<div id="wrap">
		<div id="theNavbar">
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
							<g:link controller="user" action="viewHome" class="font-menu">
								<img class="avatar"
									src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
							</g:link>
						</g:if>
						<g:link controller="user" action="viewHome"
							class="navbar-brand font-menu">
							${user.username}
						</g:link>


					</div>
					<div class="collapse navbar-collapse">
						<g:form class="navbar-form navbar-left" role="search"
							controller="product" action="searchProduct">
							<div class="form-group">
								<g:set var="search1" value="${g.message(code:'searchProducts')}"
									scope="page" />
								<input class="typeahead form-control input-search" type="search"
									placeholder="${search1}" name="search" autocomplete="off">
								<button type="submit" class="btn btn-link" type="button">
									<span class="glyphicon glyphicon-search"></span>
								</button>
							</div>

						</g:form>
						<ul class="nav navbar-nav navbar-right">

							<li><g:link controller="index" action="viewHome">
									<g:message code="default.home.label" />
								</g:link></li>
							<li><g:link controller="user" action="viewHome">
									<g:message code="myProducts" />
								</g:link></li>
							<li><div class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">
										<g:if test="${requests}">
											<h4>
												<span class="badge"> ${requests.size()}</span>
											</h4>
										</g:if>
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
							<li><g:link controller="user" action="logout">
									<g:message code="logout" />
								</g:link></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><g:message code="more" /> <b
									class="caret"></b></a>
								<ul class="dropdown-menu" role="menu">
									<li><g:link controller="index" action="viewContactUs">
											<g:message code="contactUs" />
										</g:link></li>
									<li><g:link controller="index" action="viewAboutUs">
											<g:message code="aboutUs" />
										</g:link></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>


		<div class="container margin-menu">
			<div class="row row-offcanvas row-offcanvas-left">

				<div class="row">
					<div class="col-xs-9 col-xs-offset-3 ">
						<h1 class="page-header">
							<g:message code="addProduct" />
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
						<div class="row">
							<div class="col-md-9">
								<div class="well well-sm">

									<form class="form-horizontal" name="genDesc">
										<g:set var="name_input" value="${g.message(code: 'nameVar')}"
											scope="page" />
										<g:set var="description_input"
											value="${g.message(code: 'descriptionVar')}" scope="page" />
										<g:set var="state_input"
											value="${g.message(code: 'stateVar')}" scope="page" />

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
													maxlength="200" disabled required></textarea>
											</div>
										</div>
										<!-- State selection -->

										<div class="form-group">
											<label class="col-md-3 control-label" for="state"><g:message
													code="stateVar" /></label>
											<div class="col-md-9 disabled" id="myTypeState">
												<label class="radio-inline"> <input type="radio"
													name="myState" id="myNormalState"
													onchange="onChangeState()" checked disabled> <g:message
														code="normalVar" />
												</label> <label class="radio-inline"> <input type="radio"
													name="myState" id="myAuctionState"
													onchange="onChangeState()" disabled> <g:message
														code="auctionVar" />
												</label> <label class="radio-inline"> <input type="radio"
													name="myState" id="myDonateState"
													onchange="onChangeState()" disabled> <g:message
														code="donateVar" />
												</label>
											</div>
										</div>
										<g:set var="date_now" value="${dateNow = new Date()}" />
										<div class="myAditionalOptions" id="myAditionalOptions">

											<div class="form-group" id="myOptionMinimumCost">
												<label class="col-md-3 control-label" for="state"><g:message
														code="minimumCostVar" /></label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon">$</span> <input
															type="number" class="form-control" id="myMinimumCost"
															name="myMinimumCost" min="0.01" max="1000000" step="0.01"
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


									</form>
									<fieldset>
										<div id="dropzone">
											<form controller="product" action="addProduct"
												class="dropzone dz-clickable" method="post"
												enctype="multipart/form-data" name="files" id="files">
												<input id="name" name="name" type="hidden" /> <input
													id="description" name="description" type="hidden" /> <input
													id="state" name="state" type="hidden" value="0" /> <input
													id="minimumCost" name="minimumCost" type="hidden" value="0" />
												<div id="datesAuction">
													<g:datePicker name="dateStart" id="dateStart"
														value="${dateNow}" precision="minute"
														years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
													<p>
														<g:datePicker name="dateEnd" id="dateEnd"
															value="${dateNow}" precision="minute"
															years="${date_now.getAt(Calendar.YEAR)..date_now.getAt(Calendar.YEAR)+2}" />
												</div>
											</form>
											<div class="form-group" style="margin-top: 10px">
												<div class="col-md-12 text-right">
													<button class="btn btn-primary btn-lg disabled"
														id="submit-all" onclick="submitForms()">
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



				</div>
			</div>
		</div>
		<div id="search" style="display: none;">
			${search}
		</div>
	</div>
	<div class="footer">
		<div class="container">
			<div class="col-xs-5 pull-left">
				<g:link controller="index" action="viewAddProduct" params="[lang:'en']">
					<asset:image src="USA_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewAddProduct" params="[lang:'es']">
					<asset:image src="SPAIN_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewAddProduct" params="[lang:'fr']">
					<asset:image src="FRANCE_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
			</div>
			<div class="col-xs-7">
				<div style="float: right">
					<a href="https://www.facebook.com/UNFleaPlus" class=""> <asset:image
							src="facebook.png" alt="UNFlea+" height="40px" width="40px" />
					</a> <a href="https://twitter.com/unfleaplus" class=""> <asset:image
							src="twitter.png" alt="UNFlea+" height="40px" width="40px" />
					</a> <a href="https://github.com/virttuall/UNFlea-" class=""> <asset:image
							src="github.png" alt="UNFlea+" height="40px" width="40px" />
					</a>
				</div>
			</div>
			<span class="glyphicon glyphicon-copyright-mark"></span> 2014 UN
			Flea+. <a href="#">Privacy </a> &amp;<a href="#"> Terms</a>
		</div>
	</div>
</body>
</html>
