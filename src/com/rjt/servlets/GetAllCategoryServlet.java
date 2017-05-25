package com.rjt.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Category;
import com.hibernate.service.CategoryServiceImpl;

/**
 * Servlet implementation class GetAllCategoryServlet
 */
@WebServlet("/GetAllCategoryServlet")
public class GetAllCategoryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryServiceImpl cmp = new CategoryServiceImpl();
		List<Category> clist = cmp.viewAllCategorys();
		request.setAttribute("clist", clist);		
		RequestDispatcher rd = request.getRequestDispatcher("newProduct.jsp");
		rd.forward(request, response);
	}

}
