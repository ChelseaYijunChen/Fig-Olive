package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.bean.Cart;
import com.hibernate.bean.CartItem;
import com.hibernate.pojo.Customer;
import com.hibernate.pojo.Order;
import com.hibernate.pojo.Product;
import com.hibernate.service.CustomerServiceImpl;
import com.hibernate.service.OrderServiceImpl;
import com.hibernate.service.ProductServiceImpl;

@WebServlet("/CheckOutServlet")
public class CheckOutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String email=(String)request.getSession().getAttribute("email"); 
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer c1 = cmp.viewCustomerByEmail(email);
		
		OrderServiceImpl omp = new OrderServiceImpl();
		Order o1 = new Order();
		o1.setOrderDate(new Date().toString());
		o1.setCustomer(c1);
		
		ProductServiceImpl pmp = new ProductServiceImpl();
		Cart cart = (Cart) request.getSession().getAttribute("cart"); 
		List<CartItem> items = cart.getItems();
		if(items.isEmpty()){
			out.println("Please add product into shopping cart before checkout");
		} else{
			int totalQuantity = 0; 
			double totalPrice = 0;
			for (CartItem item : items){
				Product product = item.getProduct();
				pmp.viewProductById(product.getProductId());
				totalQuantity += item.getQuantity();
				totalPrice += item.getTotal();
				o1.getProduct().add(product);
			}
			items.clear();
			       
			o1.setQuanlity(totalQuantity);
			o1.setTotalPrice(totalPrice);
			
			if(omp.addOrder(o1)>=1){
				request.setAttribute("order", o1);
				request.setAttribute("customer", c1);
				RequestDispatcher rd = request.getRequestDispatcher("sucessOrder.jsp");
				rd.forward(request, response);
//				String page = "sucessOrder.jsp";
//		        response.sendRedirect(page);
			}else{
				out.println("Oops, somthing is wrong");
			}
		}

	}
}
