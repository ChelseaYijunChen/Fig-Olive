<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd ">
<html lang="en">
  <head>
    <!-- <meta charset="utf-8"> -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->	
	<script src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
    <link rel="icon" href="../../favicon.ico">
    <script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>

    <link href="css/bootstrap.min.css" rel="stylesheet">
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
	background: url(images/loader-icons/128/Preloader_6.gif) center no-repeat #fff;
}
</style>
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
	<link href="css/carousel.css" rel="stylesheet">
  </head>

  <body>
    <div class="se-pre-con"></div>

    <div class="container marketing">
      <div class="jumbotron ">
	<div class="row">
      <form action="UpdateCategoryServlet" method="post" id="form">
      <c:set value= "${requestScope.category}" var="category"/>
        <h2 class="" style="text-align: center;">Update Category</h2>
        <div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Category Id</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="categoryId" value="${category.categoryId }" readonly>
							</div>
						</div>
        <div class="form-group row">
			<label for="" class="col-sm-3 col-form-label">Category Name</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" id="categoryName" name="categoryName" maxlength="20" placeholder="${category.categoryName }" required>
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
  </body>
  			<script>
	$(window).load(function() {
		// Animate loader off screen
		$(".se-pre-con").fadeOut("slow");;
	});
	</script>
	<script type="text/javascript">
$(function(){
	$("#form").submit(function(e){
		  e.preventDefault(); 
		
		$.post("UpdateCategoryServlet", $( this ).serialize(),
			    function(data, status){

				   		$("#message").html(data);

			    });
	});
})
</script>
</html>