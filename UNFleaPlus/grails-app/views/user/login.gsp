<html>
	<head>
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title><g:message code="login" /></title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="login.css"/>
		<asset:javascript src="bootstrap.js"/>
	</head>
	<body>
	<div class="login-masthead">
	  <div class="row">
      	<div class="container">
        	<nav class="login-nav"> 
        		<div class="col-xs-1"></div>  		
          		<g:link controller="index" ><div class="login-nav-item col-xs-2" ><asset:image src="home.png" alt="UNFlea+" height="25px" width="50px"/></div></g:link>
          		<g:link controller="user" action="viewRegister"><button class="login-nav-item col-xs-8 right btn btn-success " ><g:message code="signUP"/></button></g:link> 
          		<div class="col-xs-1"></div>  	
        	</nav>
       	</div>
      </div>
    </div>
    <div class="container-fluid container-color">	
		<div class="wrapper">
    		<form class="form-signin"> 
    			<center>
    				<asset:image src="user.png" alt="UNFlea+" class="user"/>
    			</center>      
                
        		<g:set var="foo" value="${g.message(code: 'email')}" scope="page"/>
        		<g:set var="foo1" value="${g.message(code: 'password')}" scope="page"/>
        		<div class="row">
        			<div class="col-xs-2"></div>
        			<input type="text"  class="col-xs-9" class="box " name="username" placeholder="${foo}" required="" autofocus="" />
      				
      				<div class="col-xs-2"></div>
      				<input type="password" class="col-xs-9" class="box" name="password" placeholder="${foo1}" required=""/>      
      				
      				<div class="col-xs-2"></div>
      				<label class="checkbox col-xs-9 " >
        			<input type="checkbox"  class="checkbox " value="remember-me" id="rememberMe" name="rememberMe"> <g:message code="rememberMe"/>
      				</label>
      				<div class="col-xs-2"></div>
        		</div>
      			
      			<div class="row">
      				<div class="col-xs-2"></div>
      				<div class="col-xs-4">
      					<button class="btn btn-lg btn-primary btn-block button" type="submit"><g:message code="login"/></button> 
      				</div>
      				<div class="col-xs-4">
      					<button class="btn btn-lg btn-primary btn-block button" type="reset"><g:message code="reset"/></button> 
      				</div>
      				<div class="col-xs-2"></div>
      			</div>
      			
      			
      			<div class="row">
      				<div class="col-xs-2"></div>
      				<div class="col-xs-8 checkbox">
      					<g:message code="register"/> <g:link controller="user" action="viewRegister"><g:message code="registered"/></g:link>
      				</div>
      				<div class="col-xs-2"></div>
      				
      				
      				
      				
            	</div>  
    		</form>
  		</div>
  	</div>
  	<div class="site-footer">
  		<div class="container-fluid">
  			<div class="row">
  				<center>
  				  <ul class="menu col-xs-12">
  					<li >Andres Gutierrez</li>
  					<li >Yeisson Garcia</li>
  					<li >Fabian</li>
  					<li >
  						<a href="#" class="logo-icon" >
      					<asset:image src="REARU.png"  alt="UNFlea+" height="40px" width="40px" border-radius="100%" />
      					</a>	
      				</li>
      				<li>Conejo</li>
      				<li>Samuel Cabezas</li>
  					<li>Mateo Nieto</li>
  				  </ul>
  				</center>
  			</div>
  		</div>
  			
  		
  		
  	</div>
  	
	</body>
</html>