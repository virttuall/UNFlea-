<html>
	<head>
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title><g:message code="login" /></title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="home.css"/>
		<asset:javascript src="bootstrap.js"/>
		<asset:javascript src="home.js"/>
		
	</head>
	<body>
		
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						
					</button>
					<a class="font-menu" href="#">${params.name}</a>
				</div>
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#">Home</a>
						</li>
						<li>
							<a href="#">Profile</a>
						</li>
						<li>
							<g:link controller="user" action="logout">Logout</g:link>
						</li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="container margin-menu"> 
			<div class="row">
				<div class="col-xs-12 ">
					<h1 class="page-header"><g:message code="myProducts" /></h1>
				</div>
			</div>
			
			<ul class="row">
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				<div class="margin-gallery col-lg-3 col-md-3 col-sm-4 col-xs-6">
					<li class="thumbnail"><img class="img-responsive" src="http://placehold.it/400x300" alt=""></li>
				</div>
				
			</ul>
		</div>
		
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      		<div class="modal-dialog">
        		<div class="modal-content">         
          			<div class="modal-body">                
          			</div>
        		</div><!-- /.modal-content -->
      		</div><!-- /.modal-dialog -->
    	</div><!-- /.modal -->
    	
	</body>
</html>