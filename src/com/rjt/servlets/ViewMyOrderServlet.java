package com.rjt.servlets;

import java.io.IOException;
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

@WebServlet("/ViewMyOrderServlet")
public class ViewMyOrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=(String)request.getSession().getAttribute("email"); 
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer c1 = cmp.viewCustomerByEmail(email);
		OrderServiceImpl omp = new OrderServiceImpl();
		List<Order> oList = omp.viewOrderByCustomerId(c1.getCustomerId());
		request.setAttribute("oList", oList);		
		RequestDispatcher rd = request.getRequestDispatcher("viewMyOrder.jsp");
		rd.forward(request, response);
	}

}
