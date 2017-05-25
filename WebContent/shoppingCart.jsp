<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.hibernate.bean.*" 
	 	 import="com.hibernate.pojo.Product"
	 	 import=" java.util.ArrayList" 
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

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>



    <div class="container marketing">

    <h1 style="text-align: center;">Your cart</h1>

    <a class="btn btn-default col-sm-3" href="mainPage.jsp" >Continue Shopping</a>
    <div id="paypal-button"></div>
    <a class="btn btn-default col-sm-3 black-background white pull-right" href="CheckOutServlet" >Check Out</a>
    <table class="table">
	  	<thead class="thead-default">	
	  	<tr>
	  	<!-- <th>Item No</th> -->
	  	<th>Product Image</th>
	  	<th>Description</th>
	    <th>Quantity</th>
	    <th>Unit Price</th>
	    <th>Total</th>
	 	</tr>
	 	</thead>

<% 
   Cart cart = (Cart) session.getAttribute("cart"); 
	if (cart == null) {
	cart = new Cart();
	session.setAttribute("cart", cart);
   } 
   ArrayList<CartItem> items = cart.getItems();

   double total = 0;
   for (CartItem item : items)
   {
       Product product = item.getProduct();
       total += item.getTotal();
%>


  <tr valign="top">
    <td><img src=<%=product.getProductImage()%>></td>
    <td>
      <%=product.getProductDescription()%>
    </td>
    <td>
      <form action="CartServlet" method="post">
        <input type="hidden" name="productId" 
               value="<%=product.getProductId()%>">
        <%-- <p><%=product.getProductId()%></p> --%>
        <input type="number" size=2 name="quantity" min="0" max="10" value="<%=item.getQuantity()%>" >
        <input type="submit" class="btn btn-default" value="Update">
      </form>
      <a href="CartServlet?productId=<%=product.getProductId()%>&quantity=0" class="btn btn-default">Remove Item</a>
    </td>
    <td>
      <%=product.getProductPrice()%>
    </td>
    <td>
      <%=item.getTotalCurrencyFormat()%>
    </td>
<!--     <td>
      <form action="CartServlet" method="post">
        <input type="hidden" name="productId" 
               value="<%=product.getProductId()%>">
        <input type="hidden" name="quantity" 
               value="0">
        <input type="submit" value="Remove Item">
      </form>
    </td> -->
  </tr>

<% } %>

  <tr>
    <td colspan="3">
      <p><b>To change the quantity</b>, enter the new quantity 
            and click on the Update button.</p>
    </td>
    <td>
      Total: $<%=total%>
    </td>
  </tr>
  
  
</table>

<br>



<!-- <form action="<%= response.encodeURL("index.jsp")%>" method="post">
  <input type="submit" name="continue" value="Continue Shopping">
</form>

<form action="<%= response.encodeURL("checkOut.jsp")%>" method="post">
  <input type="submit" name="checkout" value="Checkout">
</form> -->

     




      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2016 Fig & Olive, Inc. &middot; </p>
      </footer>

    </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <script src="https://www.paypalobjects.com/api/checkout.js"></script>
<script>
    paypal.Button.render({
    
        env: 'production', // Optional: specify 'sandbox' environment

        commit: true,
        payment: function() {
            // Set up the payment here, when the buyer clicks on the button
        },

        onAuthorize: function(data, actions) {
            // Execute the payment here, when the buyer approves the transaction
       }
            
    }, '#paypal-button');
</script> 
<!-- <script>
    paypal.Button.render({
    
        env: 'production', // Optional: specify 'sandbox' environment
    
        client: {
            sandbox:    'xxxxxxxxx',
            production: 'xxxxxxxxx'
        },

        payment: function() {
        
            var env    = this.props.env;
            var client = this.props.client;
        
            return paypal.rest.payment.create(env, client, {
                transactions: [
                    {
                        amount: { total: '1.00', currency: 'USD' }
                    }
                ]
            });
        },

        commit: true, // Optional: show a 'Pay Now' button in the checkout flow

        onAuthorize: function(data, actions) {
        
            // Optional: display a confirmation page here
        
            return actions.payment.execute().then(function() {
                // Show a success page to the buyer
            });
        }

    }, '#paypal-button');
</script> -->
  </body>
</html>