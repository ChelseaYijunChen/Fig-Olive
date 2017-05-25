<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css" />
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>                       
	<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
</head>
<body>
		<div class="container marketing">
			<!-- Example row of columns -->
			<div class="jumbotron">
			<div class="row">
				<!-- <div class="login-session-1"> -->
				<div class="col-md-10">
					<form action="UpdateProductServlet" method="post" id="form" data-toggle="validator" role="form">
						<c:set value= "${requestScope.product}" var="product"/>
						<h2 class="" style="text-align: center;" >Update Product</h2>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Product Id</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="productId" value="${product.productId }" readonly>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Product Name</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="productName" value="${product.productName }" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Description</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="description" value="${product.productDescription }" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Image</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="image" value="${product.productImage }" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>	
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Price</label>
							<div class="col-sm-9">
								<input type="number" class="form-control" name="price" value="${product.productPrice }" max="99999999999" min="0" step="0.01" data-error="Please provide a valid price, less than 99999999999" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						 <div class="form-group row">
							 <label class="col-sm-3" for="inlineFormCustomSelect">Category</label>
							 	<div class="col-sm-9">
								 <select class="form-control " id="inlineFormCustomSelect" name="categoryId">
									 <!-- <option selected></option> -->
									 <c:forEach items= "${requestScope.cList}" var="category">
									 <option value="${category.categoryId}" ${product.category.getCategoryName().equals(category.categoryName) ? 'selected' : ''}>${category.categoryName}</option>
									 </c:forEach>
								 </select>
							 </div>
	 				 	</div>
	 				 	<div class="form-group row">
							 <label class="col-sm-3" for="inlineFormCustomSelect">Available</label>
							 	<div class="col-sm-9">
								 <select class="form-control " id="isAvailableSelect" name="isAvailable" required>
									 <!-- <option selected></option> -->
									 <option value="true" >true</option>
									 <option value="false" >false</option>
								 </select>
							 </div>
	 				 	</div>																		
						<div class="form-group row">
							<div class="offset-sm-3 col-sm-9 text-center">
								<button type="submit" class="btn btn-danger">Update</button>
							</div>
						</div>
					</form>
				</div>
	 		</div>
	 	</div>
	 </div>
</body>
</html>