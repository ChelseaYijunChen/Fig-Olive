package com.rjt.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Order;
import com.hibernate.service.OrderServiceImpl;

@WebServlet("/ViewAllOrderServlet")
public class ViewAllOrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServiceImpl omp = new OrderServiceImpl();
		List<Order> oList = omp.viewAllOrders();
		request.setAttribute("oList", oList);		
		RequestDispatcher rd = request.getRequestDispatcher("viewAllOrder.jsp");
		rd.forward(request, response);
	}

}
