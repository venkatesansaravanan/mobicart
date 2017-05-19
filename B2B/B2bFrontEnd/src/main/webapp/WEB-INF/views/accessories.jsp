<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
 

<body>
<%@include file="navigation.jsp" %>
<div class="container">
  <h2>BrandBasket</h2>
  <p>welcome!! here are some of the laptop accessories.</p>
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="" target="_blank">
          <img src="pictures/pics/Sony-HD-B1-1TB-External-SDL583791071-2-2623c.jpg" alt="Lights" style="width:100%">
          <div class="caption">
            <p>brand new sony 1TB ultra slim HDD.</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="/w3images/nature.jpg" target="_blank">
          <img src="pictures/pics/HP64GBx710w1435903058.jpg" alt="Nature" style="width:100%">
          <div class="caption">
            <p>brand new HP 64gb usb3.0 pendrive.</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="/w3images/fjords.jpg" target="_blank">
          <img src="pictures/pics/New-EU-Silicon-font-b-Keyboard-b-font-Cover-font-b-Laptop-b-font-font-b.jpg" alt="Fjords" style="width:100%">
          <div class="caption">
            <p>laptop keyboard skin.</p>
          </div>
        </a>
      </div>
    </div>
</div>
</body>
</html>