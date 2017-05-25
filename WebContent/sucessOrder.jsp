<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  </head>
<!-- NAVBAR
================================================== -->
  <body>

	<div class="container marketing">
		<c:set value= "${requestScope.order}" var="order"/>
			<h2 class="" style="text-align: center;" >Order Information</h2>   
			<ul class="list-group col-sm-12">
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Order No</label><p><c:out value='${order.getOrderId()}'/></p>
			  </li>
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Order Date</label><p><c:out value='${order.getOrderDate()}'/></p>
			  </li>
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Total Price</label><p><c:out value='${order.getTotalPrice()}'/></p>
			  </li>
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Product</label><p><c:out value='${order.getProduct().toString()}'/></p>
			  </li>
			</ul>
			
		<c:set value= "${requestScope.customer}" var="customer"/>	
			<h2 class="" style="text-align: center;" >User Information</h2> 
			<ul class="list-group col-sm-12">
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">User Name</label><p><c:out value='${customer.getUserName()}'/></p>
			  </li>
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Phone Number</label><p><c:out value='${customer.getPhoneNum()}'/></p>
			  </li>
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Address</label><p><c:out value='${customer.getAddress()}'/></p>
			  </li>
			  <li class="list-group-item" style="border: none">
			  	<label for="" class="col-sm-3 col-form-label">Email</label><p><c:out value='${customer.getEmail()}'/></p>
			  </li>
			</ul>
			
			
			<hr class="featurette-divider">
	
      <!-- FOOTER -->
		<footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2016 Fig & Olive, Inc. &middot; </p>
      </footer>

   </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>