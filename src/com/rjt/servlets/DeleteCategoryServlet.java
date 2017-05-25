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
import com.hibernate.pojo.Product;
import com.hibernate.service.CategoryServiceImpl;
import com.hibernate.service.OrderServiceImpl;
import com.hibernate.service.ProductServiceImpl;

/**
 * Servlet implementation class DeleteCategoryServlet
 */
@WebServlet("/DeleteCategoryServlet")
public class DeleteCategoryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "viewAllCategory.jsp";
		PrintWriter out= response.getWriter();
		CategoryServiceImpl cmp = new CategoryServiceImpl();
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		ProductServiceImpl omp = new ProductServiceImpl();
		List<Product> plist = omp.viewProductByCategoryId(categoryId);
		if(plist == null || plist.size() == 0 ){
			cmp.deleteCategory(Category.class, categoryId);
			out.println("delete category sucess");
		} else {
			out.println("There are some product belong to this category, you can not delete it");
		}
		
	}
}
