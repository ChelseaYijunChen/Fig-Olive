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

@WebServlet("/ViewBurgerByAdminServlet")
public class ViewBurgerByAdminServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl pmp = new ProductServiceImpl();
		//List<Product> burgerList = pmp.viewProductByCategoryId(1);
		List<Product> burgerList = pmp.viewAvailableProduct(1);
		request.setAttribute("burgerList", burgerList);		
		RequestDispatcher rd = request.getRequestDispatcher("viewBurgerByAdmin.jsp");
		rd.forward(request, response);
	}

}
