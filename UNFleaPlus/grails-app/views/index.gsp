<!DOCTYPE html>
<html>
	<head>
		<g:javascript library="jquery" plugin="jquery"/>
		<meta name="layout" content="main"/>
		<title>Welcome to UNFLE+</title>
		<asset:stylesheet src="bootstrap.css"/>
		<asset:stylesheet src="init.css"/>
		<asset:javascript src="bootstrap.js"/>
		<asset:javascript src="init.js"/>
		
	</head>
	<body>
    <div class="header">
      <div class="container">
        <a href="#" class="logo-icon"> 
          <img src="http://s3.amazonaws.com/codecademy-content/courses/ltp2/img/flipboard/logo.png"><!--Cambiar por nuestro logo-->
        </a>

        <ul class="menu">
          <li><a href="#">Register</a></li>
          <li><a href="#">How to use</a></li><!--Un video como el que dijo el profesor-->
          <li><a href="#">Login</a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle">More <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="#">Contact Us</a></li>
              <li><a href="#">About Us</a></li>
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
              <p>platform to sell, buy, trade and auction items</p>
              
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
              <h1>Development Team</h1>
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
    
  </body>
</html>
