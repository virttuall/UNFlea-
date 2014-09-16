<html>
	<head>
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title><g:message code="signUP" /></title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="register.css"/>
		<asset:javascript src="bootstrap.js"/>
		

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
    			<form class="form-horizontal form" role="form">
    				<div class="margin-form-top"></div>
    				<g:set var="foo" value="${g.message(code: 'emailVar')}" scope="page"/>
  					<div class="form-group ">
    					<label for="email" class="margin-form text col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="emailVar" /></label>
    					<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
      						<input type="email" class="form-control" id="email"placeholder="${foo}">
      						<span class="help-block text"><g:message code="emailRegister" /></span>
    					</div>
    					
  					</div>
  					
  					<div class="form-group ">
  						<g:set var="foo1" value="${g.message(code: 'usernameVar')}" scope="page"/>
    					<label for="username" class="margin-form text col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="usernameVar" /></label>
    					<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
      						<input type="text" class="form-control" id="username"placeholder="${foo1}">
      						<span class="help-block text"> <g:message code="username" /></span>
    					</div>
  					</div>
  					
  					<div class="form-group ">
  						<g:set var="foo2" value="${g.message(code: 'firstname')}" scope="page"/>
    					<label for="firstName" class="margin-form text col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="firstname" /></label>
    					<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
      						<input type="text" class="form-control" id="firstName" placeholder="${foo2}">
      						<span class="help-block text"><g:message code="firstnameVar" /></span>
    					</div>
  					</div>
  					
  					<div class="form-group ">
  						<g:set var="foo3" value="${g.message(code: 'lastname')}" scope="page"/>
    					<label for="lastName" class="margin-form text col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="lastname" /></label>
    					<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
      						<input type="text" class="form-control" id="lastName" placeholder="${foo3}">
      						<span class="help-block text"><g:message code="lastnameVar" /></span>
    					</div>
  					</div>
  					
  					<div class="form-group">
  						<g:set var="foo4" value="${g.message(code: 'password')}" scope="page"/>
    					<label for="password" class="margin-form text  col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="password" /></label>
    					<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
      						<input type="password" class="form-control" id="password" placeholder="${foo4}">
      						<span class="help-block text"><g:message code="passwordVar" /></span>
    					</div>
  					</div>
  					
  					<div class="form-group">
  						<g:set var="foo5" value="${g.message(code: 'passwordConfirm')}" scope="page"/>
    					<label for="password1" class="margin-form text  col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="passwordConfirm" /></label>
    					<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
      						<input type="password" class="form-control" id="password1" placeholder="${foo5}">
      						<span class="help-block text"><g:message code="passwordConfirmVar" /></span>
    					</div>
  					</div>
  					
  					<div class="form-group">
  						<label for="image" class="margin-form text  col-lg-3 col-md-3 col-sm-4 col-xs-4 control-label"><g:message code="uploadImage" /></label>
  							<div class="col-lg-8 col-md-8 col-sm-7 col-xs-7">
  							<input type="file" id="image">
  							<span class="help-block text"><g:message code="format" /></span>
  						</div>
  					
  					</div>
  					<div class="form-group">
  						<div class="margin-form col-lg-3 col-md-3 col-sm-4 col-xs-4"></div> 
  							<div class="text col-lg-8 col-md-8 col-sm-7 col-xs-7">
  								<a href="#"><g:message code="terms" /></a>
  							</div>
  					</div>
  					
  					
  					<div class="form-group">
  						<div class="margin-form col-lg-3 col-md-3 col-sm-4 col-xs-4"></div>
    					<div class="col-lg-8  col-md-8  col-sm-7  col-xs-7">
      						<button type="submit" class="btn btn-success button1"><g:message code="login" /></button>
    					</div>
  					</div>
				</form>
    		</div>
			
			
		
	</body>
</html>