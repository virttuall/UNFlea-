<!DOCTYPE html>
<html lang="es">
	<head>
		<link rel="alternate" hreflang="en" href="http://en.localhost:8080/UNFleaPlus//" />
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<title><g:message code="welcome" /></title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="init.css"/>
		<asset:javascript src="bootstrap.js"/>
		<asset:javascript src="init.js"/>
		
	</head>
	<body>
    <div class="header">
      <div class="container">
      	<a href="#" class="logo-icon">
      		<asset:image src="REARU.png" alt="UNFlea+" height="50px" width="150px"/>
      	</a>
        

        <ul class="menu">
          <li><a href="#"><g:message code="signUP" /></a></li>
          <li><a href="#"><g:message code="howUse" /></a></li><!--Un video como el que dijo el profesor-->
          <li><a href="#"><g:message code="login" /></a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle"><g:message code="more" /> <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="#"><g:message code="contactUs" /></a></li>
              <li><a href="#"><g:message code="aboutUs" /></a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>

    <div class="slider">

      <div class="slide active-slide">
        <div class="container">
          <div class="row">
            <div class="slide-copy col-xs-5">
              <h1>UNFlea+</h1>
              <p><g:message lang="es" code="message"/></p>
              
            </div>
            <div class="slide-img col-xs-7">
              <img src="http://3.bp.blogspot.com/-Y_40ll19G5Y/UpZqkXf5QZI/AAAAAAAAD4o/rAJyx88pXxg/s1600/pulga.png" height="400px" width="540px">
            </div>
          </div>
        </div>      
      </div>

      <div class="slide slide-feature">
        <div class="container">
          <div class="row">
          	 <div class="slide-copy col-xs-5">
              <h1><g:message code="develomentTeam" /></h1>
              <p>Andres Gutierrez</p>
              <p>Yeisson Garcia</p>
              <p>Fabian Conejo</p>
              <p>Samuel Cabezas</p>
              <p>Mateo Nieto</p>
              
            </div>
            <div class="col-xs-7">
              <a href="#"><img src="https://observatoriodefamilia.dnp.gov.co/portals/0/Images/Logos/logo_unal.png"  style="position:absolute; right:20px; top:-150px;" height="500px" width="540px"></a>
              
            </div>
            
          </div>
        </div>      
      </div> 

    </div>

    <div class="slider-nav">
      <a href="#" class="arrow-prev"><img src="http://s3.amazonaws.com/codecademy-content/courses/ltp2/img/flipboard/arrow-prev.png"></a>
      <ul class="slider-dots">
        <li class="dot active-dot">&bull;</li>
        <li class="dot">&bull;</li>
        
      </ul>
      <a href="#" class="arrow-next"><img src="http://s3.amazonaws.com/codecademy-content/courses/ltp2/img/flipboard/arrow-next.png"></a>
    </div> 
    <center> 
		<g:link  params="[lang:'en']"> 
			<asset:image src="USA.png" alt="UNFlea+" height="90px" width="90px"/>
		</g:link> 
		<g:link  params="[lang:'es']"> 
			<asset:image src="Colombia.png" alt="UNFlea+" height="100px" width="100px"/>
		</g:link> 
	</center>

  </body>
</html>
