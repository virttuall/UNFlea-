<html>
	<head>
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title><g:message code="signUP" /></title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="register.css"/>
		<asset:javascript src="bootstrap.js"/>
		<asset:javascript src="register.js"/>
		

	</head>
	<body>
			<div class="register-masthead">
	  			<div class="row">
      				<div class="container">
        				<nav class="register-nav"> 
        					<div class="col-xs-1"></div>  		
          						<g:link controller="index" ><div class="register-nav-item col-xs-2" ><asset:image src="home.png" alt="UNFlea+" height="25px" width="50px"/></div></g:link>
          						<g:link controller="user" action="viewLogin"><button class="register-nav-item col-xs-8 right btn btn-primary button " ><g:message code="login"/></button></g:link> 
          					<div class="col-xs-1"></div>  	
        				</nav>
       				</div>
      			</div>
    		</div>
    		<div class="container-fluid">			
    			<form class="form-horizontal" id="msform" role="form">
    				<ul id="progressbar">
						<li class="active"><g:message code="create" /></li>
						<li><g:message code="personal" /></li>
					</ul>
					<fieldset>
						<h2 class="fs-title"><g:message code="create" /></h2>
						
    					<g:set var="foo" value="${g.message(code: 'emailVar')}" scope="page"/>
  						<div class="form-group ">
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<input type="email" class="form-control" id="email"placeholder="${foo}">
    						</div>
  						</div>
  						<div class="form-group ">
  							<g:set var="foo1" value="${g.message(code: 'usernameVar')}" scope="page"/>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<input type="text" class="form-control" id="username"placeholder="${foo1}">
    						</div>
  						</div>
  						<div class="form-group">
  							<g:set var="foo4" value="${g.message(code: 'password')}" scope="page"/>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<input type="password" class="form-control" id="password" placeholder="${foo4}">
    						</div>
  						</div>
  						<div class="form-group">
  							<g:set var="foo5" value="${g.message(code: 'passwordConfirm')}" scope="page"/>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<input type="password" class="form-control" id="password1" placeholder="${foo5}">
    						</div>
  						</div>
  						
      					<button type="button" class="next btn btn-success button1"><g:message code="next" /></button>
    					
					</fieldset>
    				
    				<fieldset>
    					<h2 class="fs-title"><g:message code="personal" /></h2>
    					<div class="form-group ">
  							<g:set var="foo2" value="${g.message(code: 'firstname')}" scope="page"/>
    						
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<input type="text" class="form-control" id="firstName" placeholder="${foo2}">
      							
    						</div>
  						</div>
  					
  						<div class="form-group ">
  							<g:set var="foo3" value="${g.message(code: 'lastname')}" scope="page"/>
    						
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<input type="text" class="form-control" id="lastName" placeholder="${foo3}">
      							
    						</div>
  						</div>
  					
  						<div class="form-group">
  							
  							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
  								<input type="file" id="image">
  								<span class="help-block"><g:message code="format" /></span>
  							</div>
  					
  						</div>
  					
  						
  						
  							
  						<div class="form-group">
  							<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
  								<input type="radio" value="None" class="pointer"  id="male" name="gender" checked/>
  								<label for="male" ><g:message code="male" /></label>
  							</div>
  								
  							<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
  								<input type="radio" value="None" class="pointer" id="famale" name="gender" />
  								<label for="female" ><g:message code="female" /></label>	
  							</div>
  								
  						</div>
  						<div class="form-group">
  							
  							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin-left:-60px;">
  								<a href="#" ><g:message code="terms" /></a>
  							</div>
  						</div>	
      					<button type="button" class="previous btn btn-success button1"><g:message code="previous" /></button>
      					<button type="submit" class="btn btn-success button1"><g:message code="signUP" /></button>	
    				</fieldset>
	
				</form>
    		</div>
			
			<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>		
		
	</body>
</html>