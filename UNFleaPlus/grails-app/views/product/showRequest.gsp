<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="updateProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="navbar.css" />
<asset:stylesheet src="sticky-footer.css" />
<asset:javascript src="search.js" />
<asset:javascript src="modal.js" />
<asset:stylesheet src="search.css" />
<asset:javascript src="jquery.elevatezoom.js" />
<asset:javascript src="request.js" />
<asset:javascript src="lightbox.js" />
<asset:stylesheet src="lightbox.css" />
<asset:stylesheet src="thumbelina.css" />
<asset:javascript src="thumbelina.js" />
<asset:stylesheet src="showRequest.css" />
<asset:javascript src="home.js" />


</head>

<body>
	<div id="wrap">
		<div id="theNavbar">
			<g:if test="${session.user}">
				<nav class="navbar navbar-inverse navbar-fixed-top"
					role="navigation">
					<div class="container">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>


						</button>
						<g:if test="${user.avatar}">
						<g:link controller="user" action="viewHome" class="font-menu">
							<img style="height: 4.5em; width: 4.0em"
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
									<g:set var="search1"
										value="${g.message(code:'searchProducts')}" scope="page" />
									<input class="typeahead form-control input-search"
										type="search" placeholder="${search1}" name="search"
										autocomplete="off">
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
			</g:if>
			<g:else>
				<div class="navbar-wrapper">
					<div class="container size-menu">
						<div
							class="margin-menu navbar-inverse navbar-fixed-top navbar-color"
							role="navigation">
							<div class="container">
								<div class="navbar-header navbar-color">
									<button type="button" class="navbar-toggle"
										data-toggle="collapse" data-target=".navbar-collapse">
										<span class="sr-only">Toggle navigation</span> <span
											class="icon-bar"></span> <span class="icon-bar"></span> <span
											class="icon-bar"></span>
									</button>
									<a href="/UNFleaPlus/index/viewHome" class="navbar-brand">UN
										Flea+ <g:link controller="index" action="viewHome"></g:link>
									</a>
								</div>
								<div class="navbar-collapse collapse navbar-color">
									<g:form class="navbar-form navbar-left" role="search"
										controller="product" action="searchProduct">
										<div class="form-group">
											<g:set var="search1"
												value="${g.message(code:'searchProducts')}" scope="page" />
											<input class="typeahead form-control input-search"
												type="search" placeholder="${search1}" name="search"
												autocomplete="off">

											<button type="submit" class="btn btn-link" type="button">
												<span class="glyphicon glyphicon-search"></span>
											</button>
										</div>

									</g:form>
									<ul class="nav navbar-nav navbar-right">

										<li><g:link controller="user" action="viewRegister">
												<g:message code="signUP" />
											</g:link></li>
										<li><a href="#" data-toggle="modal"
											data-target="#myModal"><g:message code="howUse" /></a></li>
										<!--Un video como el que dijo el profesor-->
										<li class="dropdown"><a class="dropdown-toggle" href="#"
											data-toggle="dropdown" id="navLogin"><g:message
													code="login" /></a>
											<ul class="dropdown-menu drowmenu-size" role="menu">
												<g:set var="foo" value="${g.message(code: 'email')}"
													scope="page" />
												<g:set var="foo1" value="${g.message(code: 'password')}"
													scope="page" />

												<g:form role="form" controller="user" action="login"
													method="post">
													<div class="form-margin">

														<input type="email" class="form-control" name="email"
															id="ejemplo_email_1" placeholder="${foo}" required>



														<input type="password" class="form-control"
															name="password" id="ejemplo_password_1"
															placeholder="${foo1}" required>


														<div class="checkbox">
															<label> <input type="checkbox"
																value="remember-me"> <g:message
																	code="rememberMe" />
															</label>
														</div>

														<button type="submit"
															class="btn btn-lg btn-primary btn-block">
															<g:message code="login" />
														</button>
													</div>
												</g:form>
											</ul></li>
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
						</div>
					</div>
				</div>
			</g:else>
		</div>
		
		<div class="container form-margin1">
			<div class="row">

				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<h1>
						${product.name}
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
						</g:else>
					</h1>
				</div>
				<div class="row">
					<div class="col-lg-3 col-sm-4 col-md-4 col-xs-7">

						<g:if test="${product.image}">
							<a
								href="${createLink(controller:'product', action:'large_image', id:product.image[0].getId())}"
								data-lightbox="example-set"> <img id="img_01"
								class="thumbnail"
								src="${createLink(controller:'product', action:'normal_image', id:product.image[0].getId())}"
								data-zoom-image="${createLink(controller:'product', action:'large_image', id:product.image[0].getId())}" />
							</a>
						</g:if>

						<div class="col-lg-12 col-sm-12 col-md-12 col-xs-12">

							<div id="slider3">
								<div id="gallery_01">
									<div class="thumbelina-but horiz left">&#706;</div>
									<ul>
										<g:each var="images" in="${product.image}">
											<g:each var="image" in="${images}">

									
									
										style="margin-bottom: 10px;">
										<g:if test="${product.image[0].getId()==images.getId()}">
													<li><a
														href="${createLink(controller:'product', action:'large_image', id:image.getId())}"
														data-image="${createLink(controller:'product', action:'normal_image', id:image.getId())}"
														data-zoom-image="${createLink(controller:'product', action:'large_image', id:image.getId())}">
															<img id="img_01"
															src="${createLink(controller:'product', action:'small_image', id:image.getId())}" />
													</a></li>
												</g:if>
												<g:else>
													<li><a
														href="${createLink(controller:'product', action:'large_image', id:image.getId())}"
														data-lightbox="example-set"
														data-image="${createLink(controller:'product', action:'normal_image', id:image.getId())}"
														data-zoom-image="${createLink(controller:'product', action:'large_image', id:image.getId())}">
															<img id="img_01"
															src="${createLink(controller:'product', action:'small_image', id:image.getId())}" />
													</a></li>
												</g:else>



											</g:each>

										</g:each>
									</ul>
									<div class="thumbelina-but horiz right">&#707;</div>

								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-9 col-sm-8 col-md-8  col-xs-5">
						<h3>
							<g:message code="descriptionVar" />
						</h3>
						${product.description}
						<g:if test="${product.type == 'AUCTION'}">
							<h4>
								<g:message code="dateStartVar" />
							</h4>
							${product.openingDate}
							<h4>
								<g:message code="dateEndVar" />
							</h4>
							${product.closingDate}
							<h4>
								<g:message code="curPriceVar" />
							</h4>
							${product.currentPrice}

						</g:if>
						<g:elseif test="${product.type == 'DONATE'}">
							<h4>
								<g:message code="dateStartVar" />
							</h4>
							${product.openingDate}
							<h4>
								<g:message code="dateEndVar" />
							</h4>
							${product.closingDate}
						</g:elseif>
					</div>



				</div>


				<br>
				<g:if
					test="${(session.user && !myProducts.find {it.getId() == product.getId()})}">
					<div class="row">
						<div class="col-xs-12">

							<g:if test="${product.type == 'NORMAL' }">
								<a class="openNormalSendRequest btn btn-primary"
									data-toggle="modal" data-target="#modalNormalSendRequest">
									<g:message code="request" />
								</a>
							</g:if>
							<g:elseif test="${product.type == 'AUCTION' }">
								<a class="openAuctionSendRequest btn btn-primary"
									data-toggle="modal" data-target="#modalAuctionSendRequest">
									<g:message code="request" />
								</a>
							</g:elseif>
							<g:else>
								<a class="openDonateSendRequest btn btn-primary"
									data-toggle="modal" data-target="#modalDonateSendRequest">
									<g:message code="request" />
								</a>
							</g:else>

						</div>
					</div>
				</g:if>
				<g:elseif
					test="${session.user && myProducts.find {it.getId() == product.getId()}}">
					<a class="openSameUserRequest btn btn-primary" data-toggle="modal"
						data-target="#modalSameUserRequest"> <g:message code="request" />
					</a>
				</g:elseif>
				<g:elseif test="${session.user==null}">

					<a class="openLoginSendRequest btn btn-primary" data-toggle="modal"
						data-target="#modalLoginSendRequest"> <g:message
							code="request" />
					</a>
				</g:elseif>
				<!-- Modal Send Normal Request-->
				<div class="modal fade" id="modalNormalSendRequest" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">
									<g:message code="sendRequestVar" />
								</h4>
							</div>
							<div class="modal-body">
								<p>
									<g:message code="sendRequestMessagevar" />
								</p>
								<g:form id="formNormalSendRequest"
									url="[action:'sendNormalRequest',controller:'product']"
									method="post">

									<input type="hidden" value="${product.getId() }"
										name="idTheProduct">
									<input type="hidden" value="${product.user.username}"
										name="userReceiving">

									<div class="form-group">
										<label class="col-md-8 control-label" for="state"><g:message
												code="sendRequestMoneyVar" /></label>

										<div class="input-group">
											<span class="input-group-addon">$</span> <input type="number"
												class="form-control" id="price" name="price" min="0.0"
												value="0" max="1000000" step="0.1" onkeyup="onChangePrice()"
												required>
										</div>

									</div>

									<div class="form-group">
										<label class="col-md-12 control-label" for="state"><g:message
												code="sendRequestProductsVar" /></label>
										<p>
										<div class="input-group">

											<g:each var="product" in="${myProducts}">
												<g:if test="${product.type == 'NORMAL' }">
													<div class="checkbox">
														<label> <input type="checkbox"
															name="${product.getId()}"> <img class="product"
															style="width: 5em; height: 5em;"
															src="${createLink(controller:'user', action:'product_image', id:product.image[0].getId())}">
														</label>
													</div>
												</g:if>
											</g:each>


										</div>
									</div>

								</g:form>



							</div>
							<div class="modal-footer">
								<div class="pull-right">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">
										<g:message code="cancelVar" />
									</button>
									<button type="submit" class="btn btn-primary"
										onclick="sendNormalSendRequest()">
										<g:message code="send" />
									</button>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Modal Send Auction Request-->
				<div class="modal fade" id="modalAuctionSendRequest" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">
									<g:message code="sendRequestVar" />
								</h4>
							</div>
							<div class="modal-body">
								<p>
									<g:message code="sendRequestMessagevar" />
								</p>
								<g:form id="formAuctionSendRequest"
									url="[action:'sendAuctionRequest',controller:'product']"
									method="post">

									<input type="hidden" value="${product.getId() }"
										name="idTheProduct">
									<input type="hidden" value="${product.user.username}"
										name="userReceiving">


									<div class="input-group">
										<span class="input-group-addon">$</span> <input type="number"
											class="form-control" id="price" name="price"
											value="${product.currentPrice + 0.1 }"
											min="${product.currentPrice + 0.1 }" max="1000000"
											step="0.01" onkeyup="onChangePrice()">
									</div>


								</g:form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">
									<g:message code="cancelVar" />
								</button>
								<button type="submit" class="btn btn-primary"
									onclick="sendAuctionSendRequest()">
									<g:message code="send" />
								</button>
							</div>
						</div>
					</div>
				</div>
				<!--  Modal Login Send Request -->
				<div class="modal fade" id="modalLoginSendRequest" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">
									<g:message code="login" />
								</h4>
							</div>
							<div class="modal-body">
								<div class="container">
									<g:form url="[action:'loginSearch',controller:'user']"
										id="formLogin" class="form-signin" role="form">
										<h2 class="form-signin-heading">
											<g:message code="loginVar" />
										</h2>
										<input type="email" class="form-control-sing" name="email"
											placeholder="${foo}" required>
										<input type="password" class="form-control-sing"
											name="password" placeholder="${foo1}" required>
										<p>
											<input type="checkbox" value="remember-me">
											<g:message code="rememberMe" />
											<g:link controller="user" action="viewRegister">
												<span class="pull-right"><g:message code="register"></g:message></span>
											</g:link>
										<p>
									</g:form>
								</div>
							</div>
							<div class="modal-footer">
								<button class="btn btn-lg btn-primary btn-block pull-right"
									type="button" onclick="sendLoginForm()">
									<g:message code="login" />
								</button>
							</div>
						</div>
					</div>
				</div>
				<!--  Confirmation Modal same user  -->
				<div class="modal fade" id="modalSameUserRequest" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">
									<g:message code="sameRequestVar" />
								</h4>
							</div>
							<div class="modal-body">
								<g:message code="sameRequestMessageVar" />
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-danger pull-right"
									data-dismiss="modal">Ok</button>

							</div>
						</div>
					</div>
				</div>

				<!-- Modal Send Donate Request-->
				<div class="modal fade" id="modalDonateSendRequest" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">
									<g:message code="sendRequestVar" />
								</h4>
							</div>
							<div class="modal-body">
								<g:form id="formDonateSendRequest"
									url="[action:'sendDonateRequest',controller:'product']"
									method="post">

									<input type="hidden" value="${product.getId() }"
										name="idTheProduct"></input>
									<input type="hidden" value="${product.user.username}"
										name="userReceiving">
								</g:form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">
									<g:message code="cancelVar" />
								</button>
								<button type="submit" class="btn btn-primary"
									onclick="sendDonateSendRequest()">
									<g:message code="send" />
								</button>
							</div>
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
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<div class="centering">
							<h3>
								<g:message code="tutorial" />
							</h3>
						</div>

					</div>
					<div class="modal-body"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		<div class="container">
			<div class="col-xs-5 pull-left">
				<g:link controller="index" action="viewShowRequest" params="[lang:'en']">
					<asset:image src="USA_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewShowRequest" params="[lang:'es']">
					<asset:image src="SPAIN_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewShowRequest" params="[lang:'fr']">
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
