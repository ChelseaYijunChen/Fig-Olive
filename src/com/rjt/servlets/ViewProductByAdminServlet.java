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

/**
 * Servlet implementation class ViewProductByAdminServlet
 */
@WebServlet("/ViewProductByAdminServlet")
public class ViewProductByAdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl pmp = new ProductServiceImpl();
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		List<Product> productList = pmp.viewAvailableProduct(categoryId);		
		request.setAttribute("productList", productList);		
		RequestDispatcher rd = request.getRequestDispatcher("viewProductByAdmin.jsp");
		rd.forward(request, response);
	}

}
