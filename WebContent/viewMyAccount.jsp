<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.hibernate.service.CustomerServiceImpl"
		import="com.hibernate.pojo.Customer"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
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
    <link href="css/carousel.css" rel="stylesheet">
    
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
  </head>
<body>

	<% 
		String email=(String)request.getSession().getAttribute("email"); 
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer customer = cmp.viewCustomerByEmail(email);
		String userName = customer.getUserName();	
		String phoneNum = customer.getPhoneNum();
		String address = customer.getAddress();
		int customerId = customer.getCustomerId();
	%>
	<div class="se-pre-con"></div>
	<div class="container ">
		<div class="jumbotron "> 
			<div class="col-md-12">
				<div class="row">
      				<form action="UpdateCustomerServlet" method="post" id="form" data-toggle="validator" role="form">
        				<h2 class="" style="text-align: center;">Account Details</h2>
        				<div class="form-group row">
        					<input type="hidden" class="form-control" id="customerId" name="customerId" value="<%=customerId%>">
							<label for="" class="col-sm-3 col-form-label">Full Name</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="fullName" name="fullName" value="<%=userName%>" required>
							</div>
						</div>
        				<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Email</label>
							<div class="col-sm-9">
								<input type="email" class="form-control" id="email" name="email" value="<%=email%>" data-error="That email address is invalid" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Phone Number</label>
							<div class="col-sm-9">
								<input type="number" class="form-control" id="phoneNumb" name="phoneNum" max="9999999999" min="0" data-error="Please provide 10 digit phonenum" value="<%=phoneNum%>" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Address</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="address" name="address" maxlength="100" value="<%=address%>" required>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label"> Password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="password1" name="password1" value="" minlength="3" maxlength="20" required>
							</div>
						</div>
 						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Confirm Password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="password2" name="password2" data-match="#password1" data-match-error="Whoops, these don't match" minlength="3" maxlength="20" value="" required>
								<div class="help-block with-errors"></div>
							</div>
						</div> 
        				<div class="form-group row">
							<div class="offset-sm-3 col-sm-9 text-center">
								<button type="submit" class="btn btn-default">Update</button>
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
    
	<script type="text/javascript">
$(function(){
	$("#form").submit(function(e){
		 e.preventDefault();
		
		$.post("UpdateCustomerServlet", $( this ).serialize(),
			    function(data, status){
				   $("#message").html(data);
			//alert("Data: " + data + "\nStatus: " + status);
			    });
	});
})

</script>
	<script>
	$(window).load(function() {
		// Animate loader off screen
		$(".se-pre-con").fadeOut("slow");;
	});
	</script>
</body>
</html>