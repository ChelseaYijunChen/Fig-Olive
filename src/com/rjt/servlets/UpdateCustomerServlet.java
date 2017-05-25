package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.pojo.Customer;
import com.hibernate.service.CustomerServiceImpl;


@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "viewMyAccount.jsp";
		PrintWriter out=response.getWriter();
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String phoneNum = request.getParameter("phoneNum");
		String password = request.getParameter("password1");
		String address = request.getParameter("address");
		
		CustomerServiceImpl cmp = new CustomerServiceImpl();
		Customer c1 = cmp.viewCustomerById(customerId);
		System.out.println(c1.toString());
		Customer c2 = cmp.viewCustomerByEmail(email);
		System.out.println(c2.toString());
		System.out.println(c2.getCustomerId() == customerId);
		if(c2.getCustomerId() == customerId){
			c1.setEmail(email);
			c1.setPhoneNum(phoneNum);
			c1.setAddress(address);
			c1.setPassword(password);
			c1.setIsAdmin("No");
			c1.setUserName(fullName);
			cmp.updateCustomer(c1);
			out.println("Successed update your account information");
		} else{
			out.println("This email already been registed, please provied a new one");
		}
	}

}
