<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="default.home.label" /> - ${user.username}</title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="dropzone.css" />
<asset:stylesheet src="init.css" />
<asset:stylesheet src="home.css" />
<asset:stylesheet src="main.css" />
<asset:stylesheet src="navbar.css" />
<asset:stylesheet src="search.css" />
<asset:stylesheet src="sticky-footer.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:javascript src="home.js" />
<asset:javascript src="img-modal.js" />
<asset:javascript src="dropzoneUpdateProduct.js" />
<asset:javascript src="search.js" />
<asset:javascript src="toogleMenu.js" />

<asset:stylesheet src="style.css"/>
<asset:javascript src="modal.js" />
<g:javascript src="jquery-1.11.1.min.js" />
<g:javascript src="bootstrap.min.js" />
<g:javascript src="bootstrap.file-input.js" />

<script>setTimeout(&#39;document.location.reload()&#39;,60000); </script>
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
							<li>
							<div class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									<h4>
										<span class="glyphicon glyphicon-comment white"></span> <span
										class="badge" id="chat" ></span>
									</h4>
									
										<ul class="dropdown-menu" role="menu">
											<g:if test="${messages}">
												<g:each var="message" in="${messages}">
													<li><a href="#" class="open-AddBookDialog" data-toggle="modal" data-target="#myModalChat" data-id="${message}">
													${message}
													
													</a></li>
												</g:each>
											</g:if>
										</ul>
										
									
								</a>
							</div>
						</li>
							
								<li><div class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									<h4>
										<span class="glyphicon glyphicon-globe white"></span> <span
											class="badge" > ${totalRequest}
										</span>
									</h4>
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







		<!-- ------------------------------------------------------------------------------------------- -->


		<div id="profile">
  <header>
  
    <div class="avatar">
    <g:if test="${user.avatar}">
    <asset:image src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" width = "100" />
	</g:if>
	<g:else>	
	<asset:image src="notUser.png" width="100" />
	</g:else>
    </div>
      
      <a class="addfriend" href="#"><span class="glyphicon glyphicon-envelope"></span></a>
  </header>
  <div class="about">
    <h2>Notes</h2>
    Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam volu.
  </div>
  <div class="birthday">
    <h2>Birthday</h2>
    <span class="day">01</span>
    <span class="month">DEC</span>
    <span class="year">1978</span>
  </div>
  <div class="address">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d193572.0037917105!2d-73.97800349999999!3d40.7056308!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c24fa5d33f083b%3A0xc80b8f06e177fe62!2sNew+York+City%2C+New+York!5e0!3m2!1sde!2sde!4v1403005957250" width="500" height="200" frameborder="0" style="border:0"></iframe>
  </div>
  <div class="contact">
    My Street 15 / 12345 New York / USA
    <p> </p>
    <a href="tel:0123456789">Mobile</a>
    <a href="tel:0123456789">Work</a>
    <a href="mailto:your@mail.de">E-Mail</a>
  </div>
  <div class="social">
    <a href="#">Facebook</a><a href="#">Twitter</a><a href="#">Pinterest</a><a href="#">Wordpress</a><a href="#">CodePen</a>
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
												placeholder="${description_input }" rows="5" maxlength="200"
												required></textarea>
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
							url="[action:'deleteProduct',controller:'product']" method="post">
							<input type="hidden" id="deleteProductId" name="id" value="0">
						</g:form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
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
						<button type="button" class="btn btn-default" data-dismiss="modal">
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

		<div id="search" style="display: none;">
			${search}
		</div>

	</div>
	<div class="footer">
		<div class="container">
			<g:if test="${flash.message}">
				<div class="info">
					${flash.message}
				</div>
			</g:if>
			<div class="col-xs-5 pull-left">
				<g:link controller="index" action="viewHome" params="[lang:'en']">
					<asset:image src="USA_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewHome" params="[lang:'es']">
					<asset:image src="SPAIN_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="index" action="viewHome" params="[lang:'fr']">
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
	<div class="modal fade" id="myModalChat" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h3 class="user"></h3>
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body">
						<div id="chatMessages" style="overflow: scroll; height: 400px;">
						</div>
						<div class="row">
							<div class="col-xs-12">
								<textarea cols="90" rows="3" id="messageBox" name="message" onkeypress="messageKeyPress(this,event);" style="resize:none;"></textarea>
								
							</div>
							
						</div>
						
						
						<div id="temp"></div>
					</div>
				</div>
			</div>	
		</div>
		<div id="search" style="display: none;">
			${search}
		</div>
<script>
	var myUser=""
    function messageKeyPress(field,event) {
        var theCode = event.keyCode ? event.keyCode : event.which ? event.which : event.charCode;
        var message = $('#messageBox').val();
        if (theCode == 13){
        	
        	//alert(myUser)
            <g:remoteFunction action="submitMessage" controller="chat" params="\'message=\'+message+'///////////////'+myUser" update="temp"/>
             
             $("textarea[name='message']").val('');
            return false;
        } else {
            return true;
        }
    }
    user();
    function user(){
		$('.open-AddBookDialog').on('click',function(){
			myUser = $(this).data('id');
			$('.user').text(myUser);
			var message=" ";
			$('#myModalChat .modal-body #chatMessages').text('');
			<g:remoteFunction action="submitMessage" controller="chat" params="\'message=\'+message+'///////////////'+myUser" update="temp"/>
		 
			
			$('#myModalChat').on('hidden.bs.modal', function(){
		    	$('#myModalChat .modal-body #chatMessages').text('');
		    });
		});
    }
    <g:remoteFunction action="chatMessages" controller="user" update="chat"/>
    <g:remoteFunction action="chatMessagesList" controller="user" upadate="algo"/>
    function retrieveLatestMessages() {
        <g:remoteFunction action="retrieveLatestMessages" controller="chat" update="chatMessages"/>
    }
    function pollMessages() {
        retrieveLatestMessages();
        setTimeout('pollMessages()', 5000);
    }
    pollMessages();
</script>
</body>
</html>



