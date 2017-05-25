package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.pojo.Customer;
import com.hibernate.service.CustomerServiceImpl;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "index.jsp";
		PrintWriter out=response.getWriter();
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email1");
		String phoneNum = request.getParameter("phoneNum1");
		String address = request.getParameter("address");
		String password = request.getParameter("password1");
		
		HttpSession session=request.getSession();  
	    session.setAttribute("email",email); 
		
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer c1 = new Customer();
		if(cmp.viewCustomerByEmail(email)!= null){
			out.println("This email already been registed, please provied a new one");
		} else{
			c1.setUserName(fullName);
			c1.setEmail(email);
			c1.setPassword(password);
			c1.setPhoneNum(phoneNum);
			c1.setAddress(address);
			c1.setRegDate(new Date().toString());
			c1.setIsAdmin("No");
			if(	cmp.addCustomer(c1)>=1){
//				page = "mainPage.jsp";
//				response.sendRedirect(page);
				out.println("1");
			} else {
				out.println("Oops, somthing wrong");
			}
		}
	}

}
