<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../favicon.ico">

	<title>Fig & Olive</title>
	
<style>
.no-js #loader { display: none;  }
.js #loader { display: block; position: absolute; left: 100px; top: 0; }
.se-pre-con {
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url(images/loader-128x/Preloader_2.gif) center no-repeat #fff;
}
</style>

	<!-- Bootstrap core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet">

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="css/style.css" rel="stylesheet">
	
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>
		
	<!-- Bootstrap core JavaScript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js"></script>
	
</head>
<body>
<div class="se-pre-con"></div>
		<div class="container marketing">
			<!-- <div class="jumbotron searching"> -->
				<div class="col-md-12">
					<table class="table">
				  <thead class="thead-default">
				    <tr>
				      <th>Order Id</th> 
				      <th>Order Date</th>
				      <th>Product</th>
				      <!-- <th>Product Price</th> -->
				      <!-- <th>Product Quantity</th> -->
				      <th>Total Price</th>
				    </tr>
				  </thead>			  
				  <c:forEach items= "${requestScope.oList}" var="order">
				  <tbody>
				    <tr>
				      <!-- <th scope="row">1</th> -->
				      <td><c:out value='${order.getOrderId()}'/></td> 
				      <td><c:out value='${order.getOrderDate()}'/></td>
				      <td><c:out value='${order.getProduct().toString()}'/></td>
				      <%-- <td><c:out value='${order.getProduct().getProductPrice()}'/></td> --%>
				      <%-- <td><c:out value=''/></td> --%>
				      <th><c:out value='${order.getTotalPrice()}'/></th>	      
				      <%-- <td><c:out value='${driver.vehicle.getVehicleId()}'></c:out></td> --%>
				      <%-- <td><a href="EditDriverServlet?licenseNum=${driver.licenseNum}" class="btn btn-danger">Edit</a></td>
					  <td><a href="DeleteDriverServlet?licenseNum=${driver.licenseNum}" class="btn btn-danger">Delete</a></td> --%>
				    </tr>
				  </tbody>
				  </c:forEach>
				</table>
		 	</div>
		<!-- </div> -->
	</div>
	
	<script>
	$(window).load(function() {
		// Animate loader off screen
		$(".se-pre-con").fadeOut("slow");;
	});
	</script>
</body>
</html>