package com.rjt.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Product;
import com.hibernate.service.ProductServiceImpl;

@WebServlet("/ViewSidesServlet")
public class ViewSidesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl pmp = new ProductServiceImpl();
		//List<Product> sidesList = pmp.viewProductByCategoryId(3);
		List<Product> sidesList = pmp.viewAvailableProduct(3);
		request.setAttribute("sidesList", sidesList);		
		RequestDispatcher rd = request.getRequestDispatcher("viewSides.jsp");
		rd.forward(request, response);
	}

}
