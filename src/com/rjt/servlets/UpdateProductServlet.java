package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Category;
import com.hibernate.pojo.Product;
import com.hibernate.service.CategoryServiceImpl;
import com.hibernate.service.ProductServiceImpl;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		String description = request.getParameter("description");
		String image = request.getParameter("image");
		double price = Double.parseDouble(request.getParameter("price"));
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		String isAvailable = request.getParameter("isAvailable");
		
		CategoryServiceImpl cmp = new CategoryServiceImpl();
		Category c1 = cmp.viewCategoryById(categoryId);
		
		ProductServiceImpl pmp = new ProductServiceImpl();
		Product p1 = pmp.viewProductById(productId);
		p1.setProductName(productName);
		p1.setProductPrice(price);
		p1.setProductDescription(description);
		p1.setCategory(c1);
		p1.setProductImage(image);
		p1.setIsAvailable(isAvailable);
		pmp.updateProduct(p1);
		
		out.println("Successed update your product");
	}

}
