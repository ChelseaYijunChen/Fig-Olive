package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Category;
import com.hibernate.service.CategoryServiceImpl;

/**
 * Servlet implementation class UpdateCategoryServlet
 */
@WebServlet("/UpdateCategoryServlet")
public class UpdateCategoryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "updateCategory.jsp";
		PrintWriter out=response.getWriter();
		CategoryServiceImpl cmp = new CategoryServiceImpl();
		int id = Integer.parseInt(request.getParameter("categoryId"));
		String categoryName = request.getParameter("categoryName");
		Category c1 = cmp.viewCategoryById(id);
		Category c2 = cmp.viewCategoryByCategoryName(categoryName);
		if(c2!=null && c2.getCategoryId() !=id){
			out.println("There alreay has this category");
		} else {
			c1.setCategoryName(categoryName);
			cmp.updateCategory(c1);
			out.println("Successed update category information");
		}
	}

}
