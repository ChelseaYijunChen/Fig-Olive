package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Product;
import com.hibernate.service.ProductServiceImpl;

/**
 * Servlet implementation class TakeDownProductServlet
 */
@WebServlet("/TakeDownProductServlet")
public class TakeDownProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String page = "viewSidesByAdmin.jsp";
		PrintWriter out=response.getWriter();
		int productId = Integer.parseInt(request.getParameter("productId"));
		ProductServiceImpl pmp = new ProductServiceImpl();
		Product p1 = pmp.viewProductById(productId);
		p1.setIsAvailable("false");
		pmp.updateProduct(p1);
		out.println("Sucess take product down");
	}

}
