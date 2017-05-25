package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Product;
import com.hibernate.service.OrderServiceImpl;
import com.hibernate.service.ProductServiceImpl;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		ProductServiceImpl pmp = new ProductServiceImpl();
		int id = Integer.parseInt(request.getParameter("productId"));
		OrderServiceImpl omp = new OrderServiceImpl();
		
		
		pmp.deleteProduct(Product.class, id);
		out.println("delete product sucess");
	}

}
