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


@WebServlet("/ViewBeverageByAdminServlet")
public class ViewBeverageByAdminServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl pmp = new ProductServiceImpl();
		//List<Product> beverageList = pmp.viewProductByCategoryId(2);
		List<Product> beverageList = pmp.viewAvailableProduct(2);
		request.setAttribute("beverageList", beverageList);		
		RequestDispatcher rd = request.getRequestDispatcher("viewBeverageByAdmin.jsp");
		rd.forward(request, response);
	}

}
