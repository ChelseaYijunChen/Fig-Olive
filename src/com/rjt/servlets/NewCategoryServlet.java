package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Category;
import com.hibernate.service.CategoryServiceImpl;

@WebServlet("/NewCategoryServlet")
public class NewCategoryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "newCategory.jsp";
		PrintWriter out = response.getWriter();
		
		String category = request.getParameter("categoryName");
		
		CategoryServiceImpl cmp = new CategoryServiceImpl();
		Category c1 = new Category();
		if(cmp.viewCategoryByCategoryName(category)!=null){
			out.println("There alreay has this category");
		} else{		
			c1.setCategoryName(category);
			if(	cmp.addCategory(c1)>=1){
				out.println("Successed save new category");
			} else {
				out.println("Oops, somthing wrong");
			}
		}			
	}

}
