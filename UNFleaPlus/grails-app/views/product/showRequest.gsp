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
<asset:javascript src="search.js" />
<asset:javascript src="modal.js" />
<asset:stylesheet src="search.css" />
<asset:javascript src="jquery.elevatezoom.js" />
<asset:javascript src="request.js" />
<asset:javascript src="lightbox.js" />
<asset:stylesheet src="lightbox.css" />
<asset:stylesheet src="thumbelina.css"/>
<asset:javascript src="thumbelina.js"/> 
<asset:stylesheet src="showRequest.css"/>


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
		<div class="row">

			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<h1>
					${product.name}  <g:if test="${product.type == 'NORMAL' }">
								        <span class="label label-primary center-vertical"><g:message code="normalVar"/></span>
									</g:if>
									<g:else>
										<g:if test="${product.type == 'AUCTION'}">
		    								<span class="label label-success center-vertical"><g:message code="auctionVar"/></span>
										</g:if>
										<g:else>
		     								<span class="label label-warning center-vertical"><g:message code="donateVar"/></span>
		     							</g:else>
		     						</g:else>
				</h1>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-4 col-md-4 col-xs-7">
					
					<g:if test="${product.image}">
						<a href="${createLink(controller:'product', action:'large_image', id:product.image[0].getId())}"
							data-lightbox="example-set"> <img id="img_01" class="thumbnail"
							src="${createLink(controller:'product', action:'normal_image', id:product.image[0].getId())}"
							data-zoom-image="${createLink(controller:'product', action:'large_image', id:product.image[0].getId())}" />
						</a>
					</g:if>
					
					<div class="col-lg-12 col-sm-12 col-md-12 col-xs-12">
					
					<div  id="slider3">
					<div id="gallery_01" >
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
											</a>
											</li>
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
					<h3><g:message code="descriptionVar"/></h3>
				 	${product.description}
				 	<g:if test="${product.type == 'AUCTION'}">
				 		<h4><g:message code="dateStartVar"/>  </h4> ${product.openingDate}
				 		<h4><g:message code="dateEndVar"/> </h4> ${product.closingDate}
				 		<h4><g:message code="curPriceVar"/>  </h4> ${product.currentPrice}
				 	
				 	</g:if>
				 	<g:elseif test="${product.type == 'DONATE'}">
				 		<h4><g:message code="dateStartVar"/>  </h4> ${product.openingDate}
				 		<h4><g:message code="dateEndVar"/> </h4> ${product.closingDate}
				 	</g:elseif>
				</div>
				
				
				
			</div>


			<br>
			<div class="row">
				<div class="col-xs-12">
					<g:form>
						<button class="btn btn-primary btn-lg"
							style="margin-bottom: 15px;"><g:message code="request"/></button>
					</g:form>
				</div>
			</div>


		</div>

	</div>
	<div id="search" style="display: none;">
		${search}
	</div>
	<div id="footer">
		<div class="container">
			<ul>
				<p>
					<g:link controller="product" action="request" params="[lang:'en']">
						<asset:image src="ingles.png" alt="UNFlea+" height="40px"
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
					<g:link  controller="product" action="request" params="[lang:'es']">
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
</body>

</html>