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
          		<g:link controller="user" action="viewRegister"><button class="login-nav-item col-xs-8 right btn btn-success button1 " ><g:message code="signUP"/></button></g:link> 
          		<div class="col-xs-1"></div>  	
        	</nav>
       	</div>
      </div>
    </div>
    <div class="container-fluid container-color">	
		<div class="wrapper">
    		<form class="form-horizontal form-signin" role="form"> 
    			<center>
    				<asset:image src="user.png" alt="UNFlea+" class="user"/>
    			</center>      
                
        		<g:set var="foo" value="${g.message(code: 'email')}" scope="page"/>
        		<g:set var="foo1" value="${g.message(code: 'password')}" scope="page"/>
        		<div class="form-group ">
    					
      					<input type="text"   class="box col-lg-12 col-md-12 col-sm-12 col-xs-12" name="username" placeholder="${foo}" required="" autofocus="" />
    		
    					
  				</div>
  				<div class="form-group ">
      					<input type="password"  class="box col-lg-12 col-md-12 col-sm-12 col-xs-12" name="password" placeholder="${foo1}" required=""/>      
    					
  	
  				</div>
  				
  				<div class="form-group ">
  					<div class="col-lg-offset-2 col-lg-10 col-md-offset-2 col-md-10 col-sm-offset-2 col-sm-10 col-xs-offset-2 col-xs-10 checkbox">
   						 <label>
      						<input type="checkbox"> <g:message code="rememberMe"/>
    						
    					</label>
  					</div>
    					
    					
  				</div>
        		
        		<div class="form-group">
    				<div class="col-lg-6  col-md-6  col-sm-6  col-xs-6">
    					<button class="btn btn-lg btn-primary btn-block button" type="submit"><g:message code="login"/></button> 
    					
      					
    				</div>
    				<div class="col-lg-6  col-md-6  col-sm-6  col-xs-6">
    					<button class="btn btn-lg btn-primary btn-block button" type="reset"><g:message code="reset"/></button> 
      					
    				</div>
  				</div>
  				
      			<div class="form-group ">
    					<center>
    						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
      							<g:message code="register"/> <g:link controller="user" action="viewRegister"><g:message code="registered"/></g:link>   
    						</div>
    					</center>
    					
    					
  				</div>
      			
      			
      			
      			
    		</form>
  		</div>
  	</div>
  	<div class="site-footer">
  		<div class="container-fluid">
  			<div class="row">
  				<center>
  				  <ul class="menu">
  					<li class="col-md-2 col-xs-6 col-sm-2" >Andres Gutierrez</li>
  					<li class="col-md-2 col-xs-6 col-sm-2"  >Yeisson Garcia</li>
  					<li class="col-md-1 col-xs-4 col-sm-1">Fabian</li>
  					<li class="col-md-2 col-xs-4 col-sm-2">
  						<a href="#" class="logo-icon" >
      					<asset:image src="REARU.png"  alt="UNFlea+" height="40px" width="40px" border-radius="100%" />
      					</a>	
      				</li>
      				<li class="col-md-1 col-xs-4 col-sm-1">Conejo</li>
  					<li class="col-md-2 col-xs-6 col-sm-2">Mateo Nieto</li>
  					<li class="col-md-2 col-xs-6 col-sm-2">Samuel Cabezas</li>
  				  </ul>
  				</center>
  			</div>
  		</div>
  			
  		
  		
  	</div>
  	
	</body>
</html>