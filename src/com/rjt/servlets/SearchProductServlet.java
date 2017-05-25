package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Product;
import com.hibernate.service.ProductServiceImpl;

@WebServlet("/SearchProductServlet")
public class SearchProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		ProductServiceImpl pmp = new ProductServiceImpl();
		int id = Integer.parseInt(request.getParameter("productId"));
		Product product= pmp.viewProductById(id);
		PrintWriter out=response.getWriter();
		if(product == null){
			out.print("there is no such product");
		} else {
			request.setAttribute("product", product);		
			RequestDispatcher rd = request.getRequestDispatcher("viewSingleProduct.jsp");
			rd.forward(request, response);
		}

	}
}
