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

<asset:javascript src="CountryState.js" />
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
  
  	<g:form id="form1" enctype="multipart/form-data">

			<div class="span6">
				<div class="well">
					<h4><label for=""><g:message code ='uservar'></g:message></label></h4>
					<h5><p class="">
						${user.username}
					</p></h5>
					<br>
					
					<h4><label for=""><g:message code = 'nameVar'></g:message></label></h4>
					<h5><input type="text" name="name" value='${user.firstName}'></h5>
					<h4><label for=""><g:message code = 'lastname'></g:message></label></h4>
					<h5><input type="text" name="lastName" value='${user.lastName}'></h5>
					<h4><label for=""><g:message code = 'emailVar'></g:message></label></h4>
					<h5><input type="text" name="email" value='${user.email}' size="35"></h5>
					<h4><label for=""><g:message code = 'country'></g:message></label></h4>
					<h5><input type="text" name="country" value='${user.userCountry}'></h5>
					<h4><label for=""><g:message code ='city'></g:message></label></h4>
					<h5><input type="text" name="city" value='${user.userCity}'></h5>
					<br>
					<div class="row-fluid">
						<div class="span9"></div>
						<div class="span3">
							<input type="submit" class="btn btn-primary" id="save"
								name="save" value=<g:message code = 'saveVar'></g:message>
								onclick="this.form.action = 'updateProfile'" />
							<!--  <a href="#"  class="btn btn-primary" onclick = "this.form.action = 'updateProfile'">Guardar Cambios</a> -->
						</div>
					</div>
				</div>
			</div>
		</g:form>
 </div>
 
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
				<g:link controller="user" action="profileView" params="[lang:'en']">
					<asset:image src="USA_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="user" action="profileView" params="[lang:'es']">
					<asset:image src="SPAIN_ROUND.png" alt="UNFlea+" height="40px"
						width="40px" />
				</g:link>
				<g:link controller="user" action="profileView" params="[lang:'fr']">
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



