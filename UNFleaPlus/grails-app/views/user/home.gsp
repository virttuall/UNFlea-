<html>
<head>
<g:javascript library="jquery" plugin="jquery" />
<meta name="layout" content="main" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><g:message code="login" /></title>
<asset:stylesheet src="bootstrap.css" />
<asset:stylesheet src="home.css" />
<asset:javascript src="bootstrap.js" />
<asset:javascript src="home.js" />
<asset:stylesheet src="main.css" />

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

		<!-- ------------------------------------------------------------------------------------------- -->




<ul class="row">
	<div class="col-xs-2">
		 <div class="column col-sm-2 col-xs-1 sidebar-offcanvas" id="sidebar">
              <div class="container form-margin1">
               <div class= "rightSideBar">
               
                <ul class="nav hidden-xs" id="lg-menu">
                    <li>
                  <g:link controller="product" action="viewAddProduct">
                    	<h3><i class="glyphicon glyphicon-user"></i>
						<g:message code="profile" />
						</h3>
                	</g:link>  	
					</li>
				

				
					<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">
								<h3>
								<i class= "glyphicon glyphicon-th-large"></i>
								<g:message code="products" />
								<b class="caret"></b>
								</h3> 
								</a>
								<ul class="dropdown-menu" role="menu">
								<li>
								<g:link controller="product" action="viewAddProduct">
                    				<h4><i class="glyphicon glyphicon-plus-sign"></i>
									<g:message code="addProduct" />
                					</h4>
                				</g:link>
                				</li>  	
								<li>
								<g:link controller="product" action="viewDeleteProduct">
									<h4><i class="glyphicon glyphicon-trash"></i>
									<g:message code="deleteProduct" />
									</h4>
								</g:link>
								</li>
							</ul>
						</li>
                </ul>
              
              	<!-- tiny only nav-->
              <ul class="nav visible-xs" id="xs-menu">
                  	<li>
                  <g:link controller="product" action="viewAddProduct">
                    	<h3><i class="glyphicon glyphicon-user"></i>
						</h3>
                	</g:link>  	
					</li>
                  	<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">
								<h3>
								<i class= "glyphicon glyphicon-th-large"><b class="caret"></b></i>
								</h3> 
								</a>
								<ul class="dropdown-menu" role="menu">
								<li>
								<g:link controller="product" action="viewAddProduct">
                    				<h5><i class="glyphicon glyphicon-plus-sign"></i>
									<g:message code="addProduct" />
                					</h5>
                				</g:link>
                				</li>  	
								<li>
								<g:link controller="product" action="viewDeleteProduct">
									<h5><i class="glyphicon glyphicon-trash"></i>
									<g:message code="deleteProduct" />
									</h5>
								</g:link>
								</li>
							</ul>
						</li>
                  
                </ul>
              </div>
             </div>
            </div>
            <!-- /sidebar -->
          
		
		
		
		<!-- 
		<div class="container form-margin1">
			<div class="row row-offcanvas row-offcanvas-left">
				<div class="col-xs-12 col-sm-12">
					<p class="pull-left visible-xs">
						<button type="button" class="btn btn-primary btn-xs"
							data-toggle="offcanvas">Toggle nav</button>
					</p>

					<div class=" col-xs-5 col-sm-4  sidebar-offcanvas" id="sidebar"
						role="navigation">

						<div class="sidebar-module">
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

			<div class="sidebar-module">
				<g:link controller="product" action="viewDeleteProduct">
					<h3>
						<g:message code="deleteProduct" />
					</h3>
					<div
						class="margin-gallery  col-lg-10 col-md-10 col-sm-10 col-xs-10">
						<asset:image class="avatarProduct" src="Delete_Icon.png" />
					</div>
				</g:link>
			</div>

			<div class="sidebar-module">
				<h4>Ciudades</h4>
				<div id="selected-state">
					<select class="state" id="state" name="state"></select>
				</div>

			</div>

			<div class="sidebar-module">
				<h4>Precio</h4>
				<div class="form-group">
					<input type="text" class="form-control1"> <input
						type="text" class="form-control1">
				</div>
			</div>
	</div>
	</div>
	</div>
	</div>
	<!--  -->
	</div>

			<div class="col-xs-offset-1 col-xs-9">


				<g:each var="product" in="${products}">
					<g:link controller="product" action="viewUpdateProduct"
						params="[id:product.getId()]">
						<h3>
							name:${product.name}
						</h3>
					</g:link>
					<div class="row">
						<g:each var="images" in="${product.image}">
							<g:each var="image" in="${images}">



								<div
									class="margin-gallery  col-lg-3 col-md-3 col-sm-4 col-xs-6">
									<li class="thumbnail"><img class="img-responsive"
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
				<div class="modal-body"></div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	</div>
</body>
</html>





<!-- ------------------------------------------------------------------------------------------- --
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
 <!--  -->

