<html>

<head>
<!-- para que sirvan los botones desplegables y otras funcinalidades-->
<g:javascript src="jquery-1.11.1.min.js" />
<g:javascript src="bootstrap.min.js" />
<g:javascript src="bootstrap.file-input.js" />



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
<asset:stylesheet src="init.css" />
<asset:javascript src="modal.js" />
<asset:javascript src="bootstrap-typeahead.js" />
<asset:stylesheet src="style.css"/>




<!-- Para que sirva el el autocompletar -->
<resource:include components="autoComplete"
	autoComplete="[skin: 'custom']" />

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
				<g:if test="${user?.avatar}">
					<img class="avatar"
						src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" />
				</g:if>
				<a class="font-menu" href="#"> ${user.username}
				</a>

			</div>
			<div class="collapse navbar-collapse">
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

		<div class="row-fluid">
			<div class="span8">
				<div class="page-header">
					<h4>Información de Perfil</h4>
				</div>
			</div>
		</div>


		<div class="row-fluid">
			<g:form id="form1" enctype="multipart/form-data">
				<div class="span2">
					<ul class="thumbnails">
						<li class="span12">
							<!--  <img width="100%" height="100%" alt="img" src="http://localhost:8080/CausalityAppProject/home/showImage/">-->
							<g:if test="${user?.avatar}">
								<img class = "avatar"
							src="${createLink(controller:'user', action:'avatar_image', id:user.ident())}" height = '500px' width = '500px' />
						</g:if>
						<g:else>
						<asset:image class="img-square" src="fotoVacia.png"
					alt="Generic placeholder imag" height="500px" width="500px" />
							</g:else>
						</li>
					</ul>
					
					<input type="file" id="screenshot" name="screenshot"
						style="display: none"> <a class="btn btn-primary"
						onclick="$('input[id=screenshot]').click();">Cargar imagen</a>
					<hr>
					<input type="submit" class="btn btn-primary" id="save" name="save"
						value="Guardar Imagen"
						onclick="this.form.action = 'updateProfile'" />
				</div>
				

				<div class="span6">
					<div class="well">
						<label for="">Nombre de usuario</label>
						<p class="">
							${user.username}
						</p>
						<br>

						
						<label for="">Nombre</label>
						<input type="text" name="name" value='${user.firstName}'>
						<label for="">Apellidos</label>
						<input type="text" name="lastName" value='${user.lastName}'>
						<label for="">Email</label>
						<input type="text" name="email" value='${user.email}'>
						<label for="">Ciudad</label>
						<input type="text" name="city" value='${user.userCity}'>
						<label for="">País</label>
						<input type="text" name="country" value='${user.userCountry}'>
						
						
						<div class="row-fluid">
							<div class="span9"></div>
							<div class="span3">
								<input type="submit" class="btn btn-primary" id="save"
									name="save" value="Guardar"
									onclick="this.form.action = 'updateProfile'" />
								<!--  <a href="#"  class="btn btn-primary" onclick = "this.form.action = 'updateProfile'">Guardar Cambios</a> -->
							</div>

						</div>

					</div>

				</div>
				</g:form>
				
		</div>



	<div id="footer">
		<div class="container">
			<ol>
				<g:if test="${flash.message}">
						<div class="info">
							${flash.message}
						</div>
				</g:if>
				<p>
					<g:link  controller="index" action="viewHome" params="[lang:'en']">
						<asset:image src="ingles.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
					<g:link controller="index" action="viewHome" params="[lang:'es']">
						<asset:image src="espanol.png" alt="UNFlea+" height="40px"
							width="40px" />
					</g:link>
				</p>
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
				<p>
					
					&copy; 2014 UN Flea+. <a href="#">Privacy </a> &amp;<a href="#">
						Terms 
						</a>
							
				</p>
				
				
			</ol>
		</div>
	</div>
	
		</body>
</html>


