package com.rjt.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.bean.Cart;
import com.hibernate.bean.CartItem;
import com.hibernate.pojo.Product;
import com.hibernate.service.ProductServiceImpl;


@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("productId"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		HttpSession session = request.getSession();
		
		synchronized (session) {
			Cart cart = (Cart) session.getAttribute("cart");
			if (cart == null) {
				cart = new Cart();
				session.setAttribute("cart", cart);
			}

			// if the user enters a negative or invalid quantity,
			// the quantity is automatically reset to 1.
//			int quantity = 1;
//			try {
//				quantity = Integer.parseInt(quantityAsString);
//				if (quantity < 0)
//					quantity = 1;
//			} catch (NumberFormatException nfe) {
//				quantity = 1;
//			}

//			ServletContext sc = getServletContext();
//			String path = sc.getRealPath("WEB-INF/products.txt");
//			Product product = Product.getProduct(productId, path);
			
			ProductServiceImpl pmp = new ProductServiceImpl();
			Product product = pmp.viewProductById(productId);
			
			
//			Product p1 = new Product();
//			p1.setProductId(1);
//			p1.setProductDescription("This is a book");
//			p1.setProductPrice(30);
//			p1.setProductImage("images/BBQBACONKING2.png");

			CartItem cartItem = new CartItem();
			cartItem.setProduct(product);
			cartItem.setQuantity(quantity);
			System.out.println("==================");
			System.out.println(cartItem.toString());
			if (quantity > 0){
				cart.addItem(cartItem);
			} else if (quantity <= 0) {
				cart.removeItem(cartItem);
			}
				
			session.setAttribute("cart", cart);
			System.out.println("==================");
//			System.out.println(cart.toString());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("shoppingCart.jsp");
		rd.forward(request, response);
		
	}

}
