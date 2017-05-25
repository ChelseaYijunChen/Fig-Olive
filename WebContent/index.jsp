<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<!-- <script src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js"></script>  -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
    
    <style>
/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    padding-top: 100px; /* Location of the box */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
    position: relative;
    background-color: #fefefe;
    margin: auto;
    padding: 0;
    border: 1px solid #888;
    width: 85%;
    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
    -webkit-animation-name: animatetop;
    -webkit-animation-duration: 0.4s;
    animation-name: animatetop;
    animation-duration: 0.4s
}

/* Add Animation */
@-webkit-keyframes animatetop {
    from {top:-300px; opacity:0} 
    to {top:0; opacity:1}
}

@keyframes animatetop {
    from {top:-300px; opacity:0}
    to {top:0; opacity:1}
}

/* The Close Button */
.close {
    color: white;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: #000;
    text-decoration: none;
    cursor: pointer;
}

.modal-header {
    padding: 2px 16px;
    background-color: #ada9a9;
    color: white;
}

.modal-body {padding: 2px 16px;}

</style>

    
  </head>
<!-- NAVBAR
================================================== -->
  <body>
  
   <%
   response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
   
	%>
	
    <div class="navbar-wrapper">
      <div class="container">
        <!-- <nav class="navbar navbar-inverse navbar-static-top"> -->
        <nav class="navbar navbar-light navbar-static-top" style="background-color:;">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav navbar-right">
                <li>
                 <a  style="color: white" id="login" >
                 	<div class="row">
                 	 <h3>Log In</h3> <h3>Sign Up</h3>
                 	</div> 
                 </a>
           		</li>
          	</ul>
            </div>
          </div>
        </nav>
      </div>
    </div>

    <div class="jumbotron hero-nature">
      <h1>Welcome to Fig & Olive</h1>
      <p>Order your food today!</p>
    </div>
    
   	<!-- The Modal -->
	<div id="loginModal" class="modal">
	  <!-- Modal content -->
	  <div class="modal-content">
	    <div class="modal-header">
	      <span class="close">&times;</span>
	      <!-- <h2 style="text-align: center;">Log In</h2> -->
	    </div>
	    
	    <div class="modal-body">
	  		<div class="container ">
				<div class="col-md-5">
					<form action="LoginServlet" method="post" id="loginform1" role="form" data-toggle="validator" >
					<h2 class="" style="text-align: center;">Login</h2>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Email Address</label>
							<div class="col-sm-9">
								<input type="email" class="form-control" name="userEmail" placeholder="Joey@gamil.com" data-error="That email address is invalid" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						<div class="form-group row">
							<label for="" class="col-sm-3 col-form-label">Password</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" name="password" placeholder="Password" minlength="3"  maxlength="20" data-error="The length of password must be more than 3 and less than 20" required>
								<div class="help-block with-errors"></div>
							</div>
						</div>
						<div class="form-group row">
							<div class="offset-sm-3 col-sm-9 text-center">
								<button type="submit" class="btn btn-default" >Login</button>
							</div>
						</div>
						<div class="form-group row">
           					<div class="offset-sm-3 col-sm-9">
             					<span id="message1"></span>
          					</div>
         				</div>
					</form>		
				</div>	
		
	<div class="col-md-5">
       <form action="RegisterServlet" method="post" id="registerform"  role="form" data-toggle="validator">
         <h2 class="" style="text-align: center;">New Customer</h2>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Full Name</label>
           <div class="col-sm-9">
             <input type="text" class="form-control"  name="fullName" placeholder="Joey" required>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Email</label>
           <div class="col-sm-9">
             <input type="email" class="form-control"  name="email1" placeholder="Joey@gmail.com" data-error="That email address is invalid" required>
           	<div class="help-block with-errors"></div>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Phone Number</label>
           <div class="col-sm-9">
             <input type="number" class="form-control" name="phoneNum1" max="9999999999" placeholder="8641231234" data-error="Please provide 10 digit phonenum" required>
           <div class="help-block with-errors"></div>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Address</label>
           <div class="col-sm-9">
             <input type="text" class="form-control" name="address" maxlength="100" placeholder="3809 Midssion Ave" required>
           </div>
         </div>
         <div class="form-group row">
           <label for="" class="col-sm-3 col-form-label">Password</label>
           <div class="col-sm-9">
             <input type="password" class="form-control" id="password1" name="password1" minlength="3"  maxlength="50" placeholder="Password" required>
           </div>
        </div>
         <div class="form-group row"> 
           <label for="" class="col-sm-3 col-form-label">Confirm Password</label>
           <div class="col-sm-9">
             <input type="password" class="form-control" id="password2" name="password2" data-match="#password1" data-match-error="Whoops, these don't match" placeholder="Confirm Password" required>
           	<div class="help-block with-errors"></div>
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
	$("#loginform1").submit(function(e){
		 e.preventDefault();
		 $.post("LoginServlet", $( this ).serialize(), 
				 function(data, status){
			 		if($.trim(data)=="1"){
						//window.location.href="adminHome.jsp";
			 			window.location.href="GetMenuByAdminServlet";
					}else if ($.trim(data)=="2"){
						//window.location.href="mainPage.jsp";
						window.location.href="GetMenuServlet";
					} else{
						 $("#message1").html(data);
					}
					  
				//alert("Data: " + data + "\nStatus: " + status);
				    });
		
	});
</script>
<script type="text/javascript">
$(function(){
	$("#registerform").submit(function(e){
		  e.preventDefault(); 
		
		$.post("RegisterServlet", $( this ).serialize(),
			    function(data, status){
					if($.trim(data)=="1"){
						//window.location.href="mainPage.jsp";
						window.location.href="GetMenuServlet";
					} else{
				   		$("#message2").html(data);
					}
			//alert("Data: " + data + "\nStatus: " + status);*
			    });
	});
})
</script>
<script>
// Get the modal
var modal = document.getElementById('loginModal');

// Get the button that opens the modal
var btn = document.getElementById("login");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script> 
  </body>
</html>