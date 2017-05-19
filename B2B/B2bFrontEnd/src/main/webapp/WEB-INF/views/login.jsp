<!DOCTYPE html>
<html lang="en">
 <%@include file="navigation.jsp" %>

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
 <h2 class="navbar-brand brand-name">
   <a href="index.html"><img class="img-responsive2"       
   src="resources/pictures/pics/laptop-wallpapersalien-2.jpg">DigitalPond</a>
  </h2>
 <div class="container">
 <div class="row">
<div class="col-md-4 col-md-offset-7">
<div class="panel panel-default">
 <div class="panel-heading">
 <span class="glyphicon glyphicon-lock"></span> Login</div>
<div class="panel-body">
<form class="form-horizontal" role="form">
<div class="form-group">
<label for="inputEmail3" class="col-sm-3 control-label">
Email</label>
<div class="col-sm-9">
<input type="email" class="form-control" id="inputEmail3" placeholder="enter your Email" required>
</div>
</div>
 <div class="form-group">
 <label for="inputPassword3" class="col-sm-3 control-label">
 Password</label>
 <div class="col-sm-9">
<input type="password" class="form-control" id="inputPassword3" placeholder="enter your Password" required>
</div>
</div>
<div class="form-group">
<div class="col-sm-offset-3 col-sm-9">
<div class="checkbox">
<label>
<input type="checkbox"/>
Remember me
</label>
</div>
</div>
  </div>
 <div class="form-group last">
 <div class="col-sm-offset-3 col-sm-9">
<button type="submit" class="btn btn-success btn-sm">
 Sign in</button>
<button type="reset" class="btn btn-default btn-sm">
Reset</button>
</div>
</div>
</form>
</div>
<div class="panel-footer">
Not Registred? <a href="signup.jsp">Register here</a></div>
   </div>
   </div>
 </div>
</div>
 