<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.hibernate.service.CustomerServiceImpl"
		import="com.hibernate.pojo.Customer"
%>
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

    <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
  
  	<% 	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    	response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    	response.setDateHeader("Expires", 0); // Proxies.
    
   		String email=(String)request.getSession().getAttribute("email");
    
    	if(email==null || email == "null"){
    		response.sendRedirect("index.jsp");
    		return;
    	}
  	
		/* String email=(String)request.getSession().getAttribute("email"); */ 
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer customer = cmp.viewCustomerByEmail(email);
		String userName = customer.getUserName();
    	/* String userName = DBUtil.getUserName(email); */	
	%>
    <div class="navbar-wrapper">
      <div class="container">

        <!-- <nav class="navbar navbar-inverse navbar-static-top">  -->
        <nav class="navbar navbar-light navbar-static-top" style="background-color:rgba(192,192,192,0.8);" > 
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Fig & Olive</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse" >
              <ul class="nav navbar-nav " >
                <li class="active"><a href="adminHome.jsp">Home</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Menu <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                  	<c:forEach items= "${requestScope.cList}" var="category">
                  	<li><a href="ViewProductByAdminServlet?categoryId=${category.categoryId}" target="iframe_a">${category.categoryName}</a></li>
                    </c:forEach>
                    <!-- <li><a href="ViewBurgerByAdminServlet" target="iframe_a">Burger</a></li>
                    <li><a href="ViewBeverageByAdminServlet" target="iframe_a">Beverage</a></li>
                    <li><a href="ViewSidesByAdminServlet" target="iframe_a">Sides</a></li> -->
                  </ul>
                </li>
                <li><a href="aboutUs.jsp" target="iframe_a">AboutUs</a></li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
              	<li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">My Account <% out.print(userName); %> 
                  <span class="caret"></span>
                  </a>
                  <ul class="dropdown-menu">
                    <li><a href="ViewAllOrderServlet" target="iframe_a">View All Order</a></li>
                    <li><a href="searchCustomer.jsp" target="iframe_a">View Order By Customer</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="ViewAllCategoryServlet" target="iframe_a">View Category</a></li>
                    <li><a href="newCategory.jsp" target="iframe_a">Add Category</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="GetAllCategoryServlet" target="iframe_a">New Product</a></li>
                    <li><a href="searchProduct.jsp" target="iframe_a">Modify Product</a></li>
                  </ul>
                </li>
               <li>
                 <a  href="LogoutServlet" >LogOut</a>
               </li>
              </ul>
            </div>
          </div>
        </nav>

      </div>
    </div>


    <section class="section2">
      <div class="container-fluid ">
        <div class="col-sm-12 col-md-12 main">
          <iframe height="800px" width="100%" src="" name="iframe_a" style="border:none;">Welcome to Adminhome</iframe>
        </div>
      </div>
   </section>



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>