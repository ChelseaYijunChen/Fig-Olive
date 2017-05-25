package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Customer;
import com.hibernate.pojo.Order;
import com.hibernate.service.CustomerServiceImpl;
import com.hibernate.service.OrderServiceImpl;

/**
 * Servlet implementation class SearchCustomerServlet
 */
@WebServlet("/SearchCustomerServlet")
public class SearchCustomerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		String email = request.getParameter("email");
		Customer c1 = cmp.viewCustomerByEmail(email);
		PrintWriter out=response.getWriter();
		if(c1 == null){
			//String page = "searchCustomer.jsp";
			RequestDispatcher rd = request.getRequestDispatcher("noUser.jsp");
			rd.forward(request, response);
		} else {
			//String page = "viewOrderByCustomer.jsp";
			OrderServiceImpl omp = new OrderServiceImpl();
			List<Order> oList = omp.viewOrderByCustomerId(c1.getCustomerId());
			request.setAttribute("customer", c1);
			request.setAttribute("oList", oList);
			RequestDispatcher rd = request.getRequestDispatcher("viewOrderByCustomer.jsp");
			rd.forward(request, response);
		}
		
	}

}
