<html>
	<head>
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<title><g:message code="login" /></title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="login.css"/>
		<asset:javascript src="bootstrap.js"/>
		
	</head>
	<body>
	<div class="header">
      
      	<a href="#" class="logo-icon">
      		<asset:image src="REARU.png" alt="UNFlea+" height="50px" width="150px"/>
      	</a>
    </div>
    <div class="container">	
		<div class="wrapper">
    		<form class="form-signin">       
      			<div class="panel-heading text">
      				<strong><g:message code="login" /></strong>
                </div>
        		<g:set var="foo" value="${g.message(code: 'email')}" scope="page"/>
        		<g:set var="foo1" value="${g.message(code: 'password')}" scope="page"/>
      			<input type="text"  size="45" class="box " name="username" placeholder="${foo}" required="" autofocus="" />
      			<input type="password" size="45" class="box" name="password" placeholder="${foo1}" required=""/>      
      			<label class="checkbox">
        			<input type="checkbox"  class="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> <g:message code="rememberMe"/>
      			</label>
      			<div class="row">
      				<div class="col-xs-6">
      					<button class="btn btn-lg btn-primary btn-block" type="submit"><g:message code="login"/></button> 
      				</div>
      				<div class="col-xs-6">
      					<button class="btn btn-lg btn-primary btn-block" type="reset"><g:message code="reset"/></button> 
      				</div>
      			</div>
      			
      			<div class="panel-footer">
      				
      				<g:message code="register"/> <g:link controller="user" action="viewRegister"><g:message code="registered"/></g:link>
            	</div>  
    		</form>
  		</div>
  	</div>
  	<div class="site-footer">
  		<center>
  			<ul class=menu>
  				<li>Andres Gutierrez</li>
  				<li>Yeisson Garcia</li>
  				<li>Fabian</li>
  				<li>
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
  	
	</body>
</html>