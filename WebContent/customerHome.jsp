<%@page import="com.hibernate.service.CustomerServiceImpl"
		import="com.hibernate.pojo.Customer"
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Fig & Olive</title>
	<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
	<link href="css/style.css" type="text/css" rel="stylesheet" />
</head>
<body>

	<% 
		String email=(String)request.getSession().getAttribute("email"); 
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer customer = cmp.viewCustomerByEmail(email);
		String userName = customer.getUserName();
    	/* String userName = DBUtil.getUserName(email); */	
	%>
	<!-- header for website name
	================================================== -->


	<!-- NAVBAR
	================================================== -->
	<section class="section1">
		<nav class="navbar navbar-default navbar-fixed-top ">

			<div class="container ">
				<div class="row">
			        <div class="col-xs-4 col-md-4">

			        </div>
			        <div class="col-xs-4 col-md-4 title">
			        	<h1 >Happy Lunch Time</h1>
			        </div>
			        <div class="col-xs-4 col-md-4">
			        	<ul class="list-inline logos">
									<li>
										<a  href="myAccount.jsp" target="iframe_a" style="color: black" >
											<span class="glyphicon glyphicon-user" ></span>
										</a>
									</li>
									<li>
										<p><% out.print(userName); %></p>
										<!-- <a  href="#" style="color: black">
											<span class="glyphicon glyphicon-star"></span>
										</a> -->
									</li> 
									<li>
										<a  href="shoppingCart2.jsp" style="color: black">
											<span class="glyphicon glyphicon-shopping-cart"></span>
										</a>
									</li>
								</ul>
							</div>
     			 </div>
     		</div>

				<!-- <header class="header_html  "> -->
<!--
						<div class="col-4" >
							<h1 >BUY BUY BUY</h1>
						</div>
						<a href="#"><span >fdsfs</span></a>
						<a href="#"><span >fdsfs</span></a>
						<a href="#"><span >fdsfs</span></a>
						 <div class="col-4">
							<ul class="list-inline">
								<li>
										<a  href="#" style="color: black" >
												<span class="glyphicon glyphicon-user" ></span>
										</a>
								</li>
								<li>
										<a  href="#" style="color: black">
												<span class="glyphicon glyphicon-star"></span>
										</a>
								</li>
								<li>
										<a  href="#" style="color: black">
												<span class="glyphicon glyphicon-shopping-cart"></span>
										</a>
								</li>
							</ul>
						</div> -->
				<!-- </header> -->
			<!-- </div> -->

				<div class="navbar-header ">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Project name</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse navbar-inverse bg-inverse ">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Home</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Menu <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="ViewBurgerServlet" target="iframe_a">Burger</a></li>
								<li><a href="ViewBeverageServlet" target="iframe_a">Beverage</a></li>
								<li><a href="ViewSidesServlet" target="iframe_a">Sides</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">My Account <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Sandwich</a></li>
								<li><a href="#">Soup</a></li>
								<li><a href="#">Dessert</a></li>
							</ul>
						</li>
						<li><a href="#about">eClub</a></li>
						<li><a href="#">AboutUs</a></li>
						<li><a href="#contact">Contact</a></li>
					</ul>
					<form class="navbar-form navbar-left">
    					<input class="form-control mr-sm-2" type="text" placeholder="Search">
    <!-- <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> -->
  					</form>
					<!-- <ul class="nav navbar-nav navbar-right">
						<li><a href="../navbar/">Default</a></li>
						<li><a href="../navbar-static-top/">Static top</a></li>
						<li class="active"><a href="./">Fixed top <span class="sr-only">(current)</span></a></li>
					</ul> -->
				</div><!--/.nav-collapse -->
			<!-- </div> -->
		</nav>
	</section>
	<!--
	================================================== -->
	<section class="section2">
	<div class="container-fluid ">
  		<div class="col-sm-12 col-md-12 main">
			<iframe height="800px" width="100%" src="homeContainer.jsp" name="iframe_a" style="border:none;">Welcome to Adminhome</iframe>
		</div>
	</div>
	</section>

	<!-- Bootstrap core JavaScript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>