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
	<c:forEach items= "${requestScope.burgerList}" var="burger">
      <div class="col-xs-6 col-sm-4 food-item" tabindex="0" data-product-id="43861" data-ga="send,event,product,click,detailsOpen">
		<div class="inner">
			<div class="imgWrap">
				<img src="<c:out value='${burger.productImage}'/>">
			</div>
			<div class="title row">
				<h5><c:out value='${burger.productName}'/></h5>
				<p>$<c:out value='${burger.productPrice}'/></p>
			</div>
			<!-- <form action="CartServlet" method="post"> -->
				<div class="form-group row">
					<%-- <input type="hidden" name="productId" value="${burger.getProductId()}">
					<label for="" class="col-sm-3 col-form-label">Quantity</label>
					<div class="col-sm-3">
						<input type="number" class="form-control" name="quantity" id="quantity" min="0" max="10">
					</div>  --%>
					<!-- <input type="submit" class="btn btn-default col-sm-3" value="Add To Cart"> -->
					<a href="EditProductServlet?productId=${burger.getProductId()}" class="btn btn-danger">Edit</a>
					<a href="TakeDownProductServlet?productId=${burger.getProductId()}" class="btn btn-danger">Take Down</a> 
					<%-- <a href="DeleteProductServlet?productId=${burger.getProductId()}" class="btn btn-danger">Delete</a> --%>
				</div>
				
			<!-- </form> -->
		</div>
	</div>
	</c:forEach>
	
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