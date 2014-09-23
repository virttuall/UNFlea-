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
			<div class="navbar-wrapper">
			<div class="size-menu">
				<div class="margin-menu navbar-inverse navbar-fixed-top navbar-color" role="navigation" >
					<div class="container">
						<div class="navbar-header navbar-color">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
               					<span class="sr-only">Toggle navigation</span>
                				<span class="icon-bar"></span>
                				<span class="icon-bar"></span>
                				<span class="icon-bar"></span>
              				</button>
              				<a href="#" class="logo-icon navbar-color">
              					<g:link controller="index" action="viewHome">
      							<asset:image src="REARU.png" alt="UNFlea+" height="50px" width="150px"/>
      							</g:link>
      						</a>
      					</div>
      					<div class="navbar-collapse collapse navbar-color">
      						<ul class="nav navbar-nav navbar-right">
      							
          						<li><g:link controller="user" action="viewRegister"><g:message code="signUP" /></g:link></li>
          						<li><a href="#" data-toggle="modal" data-target="#myModal"><g:message code="howUse"  /></a></li><!--Un video como el que dijo el profesor-->
          						<li class="dropdown" >
					            <a class="dropdown-toggle" href="#" data-toggle="dropdown" id="navLogin"><g:message code="login"/></a>
					            <ul class="dropdown-menu drowmenu-size" role="menu" >
					              <g:set var="foo" value="${g.message(code: 'email')}" scope="page"/>
        						  <g:set var="foo1" value="${g.message(code: 'password')}" scope="page"/>
					              	
					              	<g:form role="form" controller="user" action="login" method="post">	              	
									  		<div class="form-group form-margin">

									   				<input type="email" name="email" class="form-control" id="ejemplo_email_1"
									          		placeholder="${foo}" required>
									   			
									  		
								  	  		</div>
											<div class="form-group form-margin">
											    
											    	<input type="password"  name="password" class="form-control"  id="ejemplo_password_1" 
											          placeholder="${foo1}" required>
											   
											</div>
											  
											<div class="form-margin">
											    <label>
											      <input type="checkbox" name="rememberMe"> <g:message code="rememberMe" />	
											    </label>
											</div>
											<button type="submit" class="form-margin btn btn-default"><g:message code="login"/></button>
											
									</g:form>
					              	

					              
					              	  
					            </ul>
					          </li>
					          <li class="dropdown">
            					<a href="#" class="dropdown-toggle" data-toggle="dropdown"><g:message code="more" /> <b class="caret"></b></a>
            						<ul class="dropdown-menu" role="menu">
              							<li><g:link controller="index" action="viewContactUs"><g:message code="contactUs" /></g:link></li>
              							<li><g:link controller="index" action="viewAboutUs"><g:message code="aboutUs" /></g:link></li>
            						</ul>
          						</li>  						
        					</ul>
        					
        					
						</div>
				
					</div>
				</div>
			</div>
		</div>
		
    		<div class="container-fluid ">			
    			<form class="form-horizontal" id="msform" role="form" controller="user" action="register" method="post" >
    				<ul id="progressbar">
						<li class="active"><g:message code="create" /></li>
						<li><g:message code="personal" /></li>
					</ul>
						
					<fieldset class="well">
						<h2 class="fs-title"><g:message code="create" /></h2>
						
    					<g:set var="foo" value="${g.message(code: 'emailVar')}" scope="page"/>
    					
  						<div class="form-group">
  							
    						<div  class="col-lg-12 col-md-12 col-sm-12 col-xs-12">	
    							<div class="input-group input-group-lg">
    							 <g:set var="temp" value="${g.message(code: 'emailRegister')}" scope="page"/>
                					<span class="input-group-addon" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="${temp}"><span class="glyphicon glyphicon-envelope"></span></span>
                					<input type="email" class="form-control" name="email" id="email"placeholder="${foo}" required />
                				</div>
    						</div>
  						</div>
  						<div class="form-group ">
  							<g:set var="foo1" value="${g.message(code: 'usernameVar')}" scope="page"/>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
    							<div class="input-group input-group-lg">
    							<g:set var="temp1" value="${g.message(code: 'username')}" scope="page"/>
                					<span class="input-group-addon" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="${temp1}"><span class="glyphicon glyphicon-user"></span></span>
      								<input type="text" class="form-control" name="username" id="username"placeholder="${foo1}" required />
      							</div>
    						</div>
  						</div>
  						<div class="form-group">
  							<g:set var="foo4" value="${g.message(code: 'password')}" scope="page"/>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
    							<div class="input-group input-group-lg">
    							<g:set var="temp2" value="${g.message(code: 'passwordVar')}" scope="page"/>
                					<span class="input-group-addon"  data-toggle="popover" data-trigger="hover" data-placement="top" data-content="${temp2}"><span class="glyphicon glyphicon-lock"></span></span>
      								<input type="password" class="form-control" name="password" id="password" placeholder="${foo4}" required />
      							</div>
    						</div>
  						</div>
  						<div class="form-group">
  							<g:set var="foo5" value="${g.message(code: 'passwordConfirm')}" scope="page"/>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
    							<div class="input-group input-group-lg">
    							<g:set var="temp3" value="${g.message(code: 'passwordConfirmVar')}" scope="page"/>
                					<span class="input-group-addon" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="${temp3}"><span class="glyphicon glyphicon-lock"></span></span>
      								<input type="password" class="form-control" name="password1" id="password1" placeholder="${foo5}" required />
      							</div>
    						</div>
  						</div>
  						
      					<button type="submit" class="next btn btn-success button1"><g:message code="next" /></button>
    					
					</fieldset >
    				
    				<fieldset class="well">
    					<h2 class="fs-title"><g:message code="personal" /></h2>
    					<div class="form-group ">
  							<g:set var="foo2" value="${g.message(code: 'firstname')}" scope="page"/>
    						
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
    							<div class="input-group input-group-lg">
    							<g:set var="temp4" value="${g.message(code: 'firstnameVar')}" scope="page"/>
                					<span class="input-group-addon " data-toggle="popover" data-trigger="hover" data-placement="top" data-content="${temp4}"><span class="glyphicon glyphicon-share-alt"></span></span>
      								<input type="text" class="form-control" id="firstName" name="firstname" placeholder="${foo2}" required />
      							</div>
      							
    						</div>
  						</div>
  					
  						<div class="form-group ">
  							<g:set var="foo3" value="${g.message(code: 'lastname')}" scope="page"/>
    						
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
    							<div class="input-group input-group-lg">
    							<g:set var="temp5" value="${g.message(code: 'lastnameVar')}" scope="page"/>
                					<span class="input-group-addon " data-toggle="popover" data-trigger="hover" data-placement="top" data-content="${temp5}"><span class="glyphicon glyphicon-share-alt"></span></span>
      								<input type="text" class="form-control" id="lastName" name="lastname" placeholder="${foo3}" required />
      							</div>
      							
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
  								<input type="radio" value="male" class="pointer" id="male" name="gender" checked/>
  								<label for="male" ><g:message code="male" /></label>
  							</div>
  								
  							<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
  								<input type="radio" value="female" class="pointer" id="female" name="gender" />
  								<label for="female" ><g:message code="female" /></label>	
  							</div>
  								
  						</div>
  						<div class="form-group">
  							
  							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin-left:-60px;">
  								<input type="checkbox" name="terminos" required>
  								<a href="#" ><g:message code="terms" /></a>
  							</div>
  						</div>	
      					<button type="button" class="previous btn btn-success button1"><g:message code="previous" /></button>
      					<button type="submit" class="btn btn-success button1"><g:message code="signUP" /></button>	
    				</fieldset>
	
				</form>
				
    		</div>
    	
			<g:if test="${flash.message}">
  					<div class="info">${flash.message}</div>	
			</g:if>
	
			<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>		
		
	</body>
</html>