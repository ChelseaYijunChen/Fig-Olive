package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Category;
import com.hibernate.service.CategoryServiceImpl;

/**
 * Servlet implementation class EditCategoryServlet
 */
@WebServlet("/EditCategoryServlet")
public class EditCategoryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CategoryServiceImpl cmp = new CategoryServiceImpl();
		int id = Integer.parseInt(request.getParameter("categoryId"));
		Category c1 = cmp.viewCategoryById(id);
		request.setAttribute("category", c1);
		RequestDispatcher rd = request.getRequestDispatcher("updateCategory.jsp");
		rd.forward(request, response);
	}
}
