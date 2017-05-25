<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../favicon.ico">

	<title>Fig & Olive</title>

	<!-- Bootstrap core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet">

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="css/style.css" rel="stylesheet">
 
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js//jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>

	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>                       

	<script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>
</head>
<body>

	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    response.setDateHeader("Expires", 0); // Proxies.
	%>

		<div class="container loginSession">
			<!-- Example row of columns -->
			<div class="jumbotron">
			<div class="row">
				<!-- <div class="login-session-1"> -->
				<div class="col-md-5">
					<form action="LoginServlet" method="post" id="loginform" data-toggle="validator" role="form">
						<h2 class="" style="text-align: center;">Log In</h2>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Email Address</label>
							<div class="col-sm-9">
								<input type="email" class="form-control" name="userEmail" placeholder="Joey@gamil.com" required>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" name="password" placeholder="Password" minlength="3"  maxlength="20" required>
							</div>
						</div>
						<div class="form-group row">
							<div class="offset-sm-3 col-sm-9 text-center">
								<button type="submit" class="btn btn-default" >Login</button>
							</div>
						</div>
						<div class="form-group row">
           					<div class="offset-sm-3 col-sm-9">
             					<span id="message"></span>
          					</div>
         				</div>
					</form>
				</div>
<!-- 		</div>
			<div class="login-session-2">  -->
		 <div class="col-md-1" ></div>
			<div class="col-md-5">
       <form action="RegisterServlet" method="post" id="registerform" data-toggle="validator" role="form">
         <h2 class="" style="text-align: center;">New Customer</h2>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Full Name</label>
           <div class="col-sm-9">
             <input type="text" class="form-control" id="fullName" name="fullName" placeholder="Joey" required>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Email</label>
           <div class="col-sm-9">
             <input type="email" class="form-control" id="email1" name="email1" placeholder="Joey@gmail.com" required>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Phone Number</label>
           <div class="col-sm-9">
             <input type="number" class="form-control" id="phoneNum1" name="phoneNum1" max="9999999999" placeholder="8641231234" required>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Password</label>
           <div class="col-sm-9">
             <input type="password" class="form-control" id="password1" name="password1" minlength="3"  maxlength="20" placeholder="Password" required>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Confirm Password</label>
           <div class="col-sm-9">
             <input type="password" class="form-control" id="password2" name="password2" data-match="#password1" placeholder="Confirm Password" required>
           </div>
         </div>
         <div class="form-group row">
           <div class="offset-sm-3 col-sm-9 text-center">
             <button type="submit" class="btn btn-default">Register</button>
           </div>
         </div>
         <div class="form-group row">
           	<div class="offset-sm-3 col-sm-9">
             	<span id="message2"></span>
          	</div>
         </div>

       </form>
		 </div>
	 </div> 
	 </div>
	 </div>

</body>

<script type="text/javascript">
$(function(){
	$("#loginform").submit(function(e){
		 e.preventDefault();
		
		$.post("LoginServlet", $( this ).serialize(),
			    function(data, status){
				   $("#message").html(data);
			//alert("Data: " + data + "\nStatus: " + status);
			    });
	});
})
</script>
<script type="text/javascript">
$(function(){	
	$("#registerform").submit(function(e){
		 e.preventDefault(); 
		
		$.post("RegisterServlet", $( this ).serialize(),
			    function(data, status){
				   $("#message2").html(data);
			//alert("Data: " + data + "\nStatus: " + status);
			    });
	});
})
</script>
</html>