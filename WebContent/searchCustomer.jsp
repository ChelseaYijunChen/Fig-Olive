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

	<!-- Custom styles for this template -->
	<link href="css/style.css" rel="stylesheet">
	<link href="css/carousel.css" rel="stylesheet">
	
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
</head>
<body>
		<div class="container marketing">
			<!-- Example row of columns -->
			<div class="jumbotron">
			<div class="row">
				<!-- <div class="login-session-1"> -->
				<div class="col-md-10">
					<form action="SearchCustomerServlet" method="post" id="form" data-toggle="validator" role="form">
						<h2 class="" style="text-align: center;">Search Customer</h2>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Customer Email</label>
							<div class="col-sm-9">
								<input type="email" class="form-control" id="email" name="email"  placeholder="Joey@gmail.com" required>
							</div>
						</div>
						<div class="form-group row">
							<div class="offset-sm-3 col-sm-9 text-center">
								<button type="submit" class="btn btn-default">Search</button>
							</div>
						</div>
						<div class="form-group row">
           	<div class="offset-sm-3 col-sm-9">
             	<span id="message"></span>
          	</div>
         </div>
					</form>
				</div>
	 		</div>
	 	</div>
	 </div>
	 
	 
	<!-- Bootstrap core JavaScript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
<!--  	<script type="text/javascript">
$(function(){
	$("#form").submit(function(e){
		  e.preventDefault(); 
		$.post("SearchCustomerServlet", $( this ).serialize(),
			    function(data, status){
				   	$("#message").html(data);
			    });
	});
})
</script> -->  

</body>
</html>