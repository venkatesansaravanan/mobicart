 <!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
  <%@include file="navigation.jsp" %> 
<body>
<div class="jumbotron" style="background:yellow;">
  <div class="container text-center">
    <h1>BRANDBASKET</h1>      
    <p>branded products for the best price!!!</p>
  </div>
  <div class="container">
	<div class="row">
	<div class="alert alert-danger alert-dismissible" role="alert">
  <button type="button" onclick="this.parentNode.parentNode.removeChild(this.parentNode);" class="close" data-dismiss="alert"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
  <strong><i class="fa fa-warning"></i> flash sale!!</strong> <marquee><p style="font-family: Impact; font-size: 12pt">Hurry up!! Weekend sale is on!!BrandBasket provides many exciting offers on every product only at the weekends.**so, its time for us to celebrate the weekend sale!!**</p></marquee>
</div>
</div>
   <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="resources/pictures/pics/81c5vmac+KKe1L._SL1500_.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
          <h3>Laptops</h3>
          <p>get home a brand new MacBook Pro with retina display</p>
        </div>
      </div>

      <div class="item">
        <img src="resources/pictures/pics/71vH5X3QVpLasus._SL1500_.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
          <h3>Laptops</h3>
          <p>get home a brand new asus laptop.</p>
        </div>
      </div>
    
      <div class="item">
        <img src="resources/pictures/pics/717lStlqS7Lhp._SL1500_.jpg" alt="Flower" width="460" height="345">
        <div class="carousel-caption">
          <h3>Laptops</h3>
          <p>the brand new HP laptops</p>
        </div>
      </div>

      <div class="item">
        <img src="resources/pictures/pics/71Pdstkbgsony-L._SL1500_.jpg" alt="Flower" width="460" height="345">
        <div class="carousel-caption">
          <h3>Laptops</h3>
          <p>sony viao</p>
        </div>
      </div>
  

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
 <%@include file="photos.jsp" %>


</body>
 
 <%@include file="footer.jsp" %>

</html>
   