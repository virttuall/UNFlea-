<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="updateProduct" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="search.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:stylesheet src="main.css" />
<asset:javascript src="toogleMenu.js" />
<asset:javascript src="CountryState.js" />
<asset:javascript src="search.js" />
<asset:javascript src="bootstrap-slider.js" />
<asset:javascript src="slider.js" />
<asset:stylesheet src="slider.css" />
<asset:javascript src="modal.js" />


</head>
<body>

	<div class="navbar-wrapper">
		<div class="container size-menu">
			<div class="margin-menu navbar-inverse navbar-fixed-top navbar-color"
				role="navigation">
				<div class="container">
					<div class="navbar-header navbar-color">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
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
								<g:set var="search1" value="${g.message(code:'myProducts')}"
									scope="page" />
								<input class="typeahead form-control" type="search"
									placeholder="${search1}" name="search" autocomplete="off">

								<button type="submit" class="btn btn-default" type="button">
									<g:message code="searchText" />
								</button>
							</div>

						</g:form>
						<ul class="nav navbar-nav navbar-right">

							<li><g:link controller="user" action="viewRegister">
									<g:message code="signUP" />
								</g:link></li>
							<li><a href="#" data-toggle="modal" data-target="#myModal"><g:message
										code="howUse" /></a></li>
							<!--Un video como el que dijo el profesor-->
							<li class="dropdown"><a class="dropdown-toggle" href="#"
								data-toggle="dropdown" id="navLogin"><g:message code="login" /></a>
								<ul class="dropdown-menu drowmenu-size" role="menu">
									<g:set var="foo" value="${g.message(code: 'email')}"
										scope="page" />
									<g:set var="foo1" value="${g.message(code: 'password')}"
										scope="page" />

									<g:form role="form" controller="user" action="login"
										method="post">
										<div class="form-group form-margin">

											<input type="email" class="form-control" name="email"
												id="ejemplo_email_1" placeholder="${foo}" required>


										</div>
										<div class="form-group form-margin">

											<input type="password" class="form-control" name="password"
												id="ejemplo_password_1" placeholder="${foo1}" required>

										</div>

										<div class="form-margin">
											<label> <input type="checkbox" name="rememberMe">
												<g:message code="rememberMe" />
											</label>
										</div>
										<button type="submit" class="form-margin btn btn-default">
											<g:message code="login" />
										</button>

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

	<div class="container form-margin1">
		<div class="country" style="display: none;">
			${country}
		</div>
		<div class="state" style="display: none;">
			${state}
		</div>
		<div class="row row-offcanvas row-offcanvas-left">
			<div class="col-xs-12 col-sm-12">
				<p class="pull-left visible-xs">
					<button type="button" class="btn btn-primary btn-xs"
						data-toggle="offcanvas">
						<g:message code="filterMenu" />
					</button>
				</p>

				<div class="col-xs-5 col-sm-4  sidebar-offcanvas" id="sidebar"
					role="navigation">
					<div class="sidebar-module well well-sm">
						<h4>
							<g:message code="filter" />
						</h4>
						<p>
							<g:message code="aboutFilter" />
						</p>
					</div>
					<g:form controller="product" action="searchProduct" name="filtros"
						method="get">
						<div class="col-xs-12 col-sm-12">

							<div class="sidebar-module">
								<h4>
									<g:message code="order" />
								</h4>
								<g:if test="${nameOrder}">
									<input type="radio" name="nameOrder" value="name"
										onclick="submitForm(this);this.form.submit();" checked>
									<g:message code="nameVar" />
									<br>
								</g:if>
								<g:else>
									<input type="radio" name="nameOrder" value="name"
										onclick="this.form.submit();">
									<g:message code="nameVar" />
									<br>
								</g:else>
								<g:if test="${usernameOrder}">
									<input type="radio" name="usernameOrder" value="username"
										onclick="submitForm(this);this.form.submit();" checked>
									<g:message code="usernameVar" />
									<br>
								</g:if>
								<g:else>
									<input type="radio" name="usernameOrder" value="username"
										onclick="this.form.submit();">
									<g:message code="usernameVar" />
									<br>
								</g:else>
								<g:if test="${countryOrder}">
									<input type="radio" name="countryOrder" value="country"
										onclick="submitForm(this);this.form.submit();" checked>
									<g:message code="country" />
									<br>
								</g:if>
								<g:else>
									<input type="radio" name="countryOrder" value="country"
										onclick="this.form.submit();">
									<g:message code="country" />
									<br>
								</g:else>
								<g:if test="${cityOrder}">
									<input type="radio" name="cityOrder" value="city"
										onclick="submitForm(this);this.form.submit();" checked>
									<g:message code="state" />
									<br>
								</g:if>
								<g:else>
									<input type="radio" name="cityOrder" value="city"
										onclick="this.form.submit();">
									<g:message code="state" />
									<br>
								</g:else>
								<g:if test="${priceOrder}">
									<input type="radio" name="priceOrder" value="price"
										onclick="submitForm(this);this.form.submit();" checked>
									<g:message code="price" />
								</g:if>
								<g:else>
									<input type="radio" name="priceOrder" value="price"
										onclick="this.form.submit();">
									<g:message code="price" />

								</g:else>

							</div>
							<div class="sidebar-module">
								<h4>
									<g:message code="type" />
								</h4>
								<div class="form-group">
									<g:if test="${normal}">
										<input type="radio" name="normal" value="1"
											onclick="submitForm(this);this.form.submit();" checked>
										<g:message code="sale" />
										<br>
									</g:if>
									<g:else>
										<input type="radio" name="normal" value="1"
											onclick="this.form.submit();">
										<g:message code="sale" />
										<br>
									</g:else>
									<g:if test="${subasta}">
										<input type="radio" name="subasta" value="2"
											onclick="submitForm(this);this.form.submit();" checked>
										<g:message code="auctionVar" />
										<br>
									</g:if>
									<g:else>
										<input type="radio" name="subasta" value="2"
											onclick="this.form.submit();">
										<g:message code="auctionVar" />
										<br>
									</g:else>
									<g:if test="${donacion}">
										<input type="radio" name="donacion" value="3"
											onclick="submitForm(this);this.form.submit();" checked>
										<g:message code="donateVar" />
									</g:if>
									<g:else>
										<input type="radio" name="donacion" value="3"
											onclick="this.form.submit();">
										<g:message code="donateVar" />
									</g:else>

								</div>
							</div>
							<div class="sidebar-module">
								<h4>
									<g:message code="price" />
								</h4>
								<div class="form-group">
									<g:if test="${priceMin}">
										<g:if test="${priceMax}">
											<g:message code="interval" />:<br>
											<b>€ 10</b>
											<br>
											<input id="ex2" type="text" size="10" name="price"
												class="span2" data-slider-min="10" data-slider-max="1000"
												data-slider-step="20"
												data-slider-value="[${priceMin},${priceMax}]" />
											<br>
											<b>€ 1000</b>
										</g:if>
									</g:if>
									<g:else>
										<g:message code="interval" />:<br>
										<b>€ 10</b>
										<br>
										<input id="ex2" type="text" size="10" name="price"
											class="span2" data-slider-min="10" data-slider-max="1000"
											data-slider-step="20" data-slider-value="[10,1000]" />
										<br>
										<b>€ 1000</b>
									</g:else>
								</div>
							</div>
							<div class="sidebar-module">
								<h4>
									<g:message code="country" />
								</h4>
								<div class="form-group">
									<select class="country" id="country" name="country"
										onchange="this.form.submit();"></select>
								</div>

							</div>
							<div class="sidebar-module">
								<h4>
									<g:message code="state" />
								</h4>
								<div id="selected-state">
									<div class="form-group">
										<select class="state" id="state" name="state"
											onchange="this.form.submit();"></select>
									</div>

								</div>

							</div>


						</div>

					</g:form>
					<div id="footer">
						
							<ul>
								<p>
									<g:link controller="product" action="searchProduct"
										params="[lang:'en']">
										<asset:image src="USA.png" alt="UNFlea+" height="40px"
											width="40px" />
									</g:link>
									<p>
				<asset:image src="facebook.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="twitter.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="googleplus.png" alt="UNFlea+" height="40px"
							width="40px" />
				    <asset:image src="youtube.png" alt="UNFlea+" height="40px"
							width="40px" />
				    <asset:image src="in.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="github.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="instagram.png" alt="UNFlea+" height="40px"
							width="40px" />
				    <asset:image src="pinterest.png" alt="UNFlea+" height="40px"
							width="40px" />
					<asset:image src="vimeo.png" alt="UNFlea+" height="40px"
							width="40px" />
				</p>
									<g:link controller="product" action="searchProduct"
										params="[lang:'es']">
										<asset:image src="espana.png" alt="UNFlea+" height="40px"
											width="40px" />
									</g:link>
								</p>
								<p>
									&copy; 2014 UN Flea+. <a href="#">Privacy </a> &amp;<a href="#">
										Terms</a>
								</p>
							</ul>
						
					</div>
				</div>
				<div class="col-xs-offset-1 col-xs-6  col-sm-7 col-sm-offset-1 ">
					<div class="row">
						<g:each var="product" in="${products}">
							<div class="col-xs-12 col-sm-6 col-md-4 ">
								<div class="thumbnail">
									<g:if test="${product.image}">
										<img class="product" style="width: 10em; height: 10em;"
											src="${createLink(controller:'user', action:'product_image', id:product.image[0].getId())}">

									</g:if>
									<p>

										${product.user.username}
									</p>
									<p>
										${product.user.userCountry}
									</p>
									<p>
										${product.user.userCity}
									</p>
									<p>
										${product.name}
									</p>
									<p>${product.type}</p>

									<g:form controller="product" action="request">
										<button class="openDetails btn btn-default" name="product"
											value="${product.getId()}">
											<g:message code="details" />
											&raquo;
										</button>
									</g:form>
								</div>
								<br> <br>
							</div>



						</g:each>
					</div>
					<g:if test="${totalProduct<10}">
						<div class="row" style="display: none">
							<div class="pagination">
								<g:paginate controller="product" action="searchProduct" max="10"
									total="${totalProduct?:0}" />

							</div>

						</div>
					</g:if>
					<g:else>
						<div class="row">
							<div class="pagination">
								<g:paginate controller="product" action="searchProduct" max="10"
									total="${totalProduct?:0}" />

							</div>

						</div>
					</g:else>

				</div>
			</div>
		</div>
	</div>
	<div id="search" style="display: none;">
		${search}
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


</body>
</html>