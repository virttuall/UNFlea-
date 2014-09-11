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
		
			<form class="form-horizontal" >
  				<fieldset>
    				<div id="legend">
      					<legend class=""><g:message code="signUP" /></legend>
    				</div>
    					<div class=wrapper>
    					<div class="container-fluid">
    					<div class="group">
    					
    						<div class="row">
    							<div class="form">
    								<label class="col-xs-5"  for="username"><g:message code="usernameVar"/></label>
    								<g:set var="foo" value="${g.message(code: 'username')}" scope="page"/>
        							<input type="text"  id="username" name="username" placeholder="${foo}" class="col-xs-7 circle">		
    							</div>
    						</div>
    						
    					
    						<div class="row">
    							<div class=form>
    								<label class="col-xs-5" for="email"><g:message code="emailVar"/></label>
    								<g:set var="foo1" value="${g.message(code: 'emailRegister')}" scope="page"/>
    								<input type="text"  id="email" name="email" placeholder="${foo1}" class="col-xs-7 circle">
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<label class="col-xs-5" for="email"><g:message code="firstname" /></label>
    								<g:set var="foo2" value="${g.message(code: 'firstnameVar')}" scope="page"/>
    								<input type="text"  id="firstname" name="firstname" placeholder="${foo2}" class="col-xs-7 circle">
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<label class="col-xs-5" for="email"><g:message code="lastname" /></label>
    								<g:set var="foo3" value="${g.message(code: 'lastnameVar')}" scope="page"/>
    								<input type="text" id="lastname" name="lastname" placeholder="${foo3}"  class="col-xs-7 circle">
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<label class="col-xs-5" for="email"><g:message code="password" /></label>
    								<g:set var="foo4" value="${g.message(code: 'passwordVar')}" scope="page"/>
    								<input type="password"  id="password" name="password" placeholder="${foo4}"  class="col-xs-7 circle">
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<label class="col-xs-5" for="email"><g:message code="passwordConfirm" /></label>
    								<g:set var="foo5" value="${g.message(code: 'passwordConfirmVar')}" scope="page"/>
    								<input type="password"  id="password1" name="password1" placeholder="${foo5}"  class="col-xs-7 circle">
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<label class="col-xs-5" for="uploadingimage"><g:message code="uploadImage" /></label>
    								<input type="file" id="uploadingimage" name="uploadingimage"  class="col-xs-7 circle">
    								<p class="help-block"><g:message code="format" /></p>
    							</div>
    							
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<div class="col-xs-5"></div>
    								<div class="">
    									<input type="checkbox" class="col-xs-1" ><label class="col-xs-6"><a href="#"><g:message code="terms" /></a></label>
    								</div>
    								
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class=form>
    								<div class="col-xs-5"></div>
    								<button type="submit" class="btn btn-success col-xs-7">
          								<g:message code="signUP" />
        							</button>
    								
    							</div>
    						</div>
    					
    						<div class="row">
    							<div class="form"></div>
    						</div>
    						
    					</div>
    					</div>
    					</div>	
    				
    			</fieldset>
    		</form>

		
		
	</body>
</html>