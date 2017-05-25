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
import com.hibernate.pojo.Product;
import com.hibernate.service.CategoryServiceImpl;
import com.hibernate.service.ProductServiceImpl;

@WebServlet("/EditProductServlet")
public class EditProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl pmp = new ProductServiceImpl();
		int id = Integer.parseInt(request.getParameter("productId"));
		Product p1 = pmp.viewProductById(id);
		CategoryServiceImpl cmp = new CategoryServiceImpl();
//		Category cList = cmp.viewCategoryById(p1.getCategory().getCategoryId());
		List<Category> cList = cmp.viewAllCategorys();
		request.setAttribute("product", p1);
		request.setAttribute("cList", cList);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateProduct.jsp");
		rd.forward(request, response);
	}

}
