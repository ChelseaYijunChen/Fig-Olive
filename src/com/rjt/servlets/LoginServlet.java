package com.rjt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hibernate.pojo.Customer;
import com.hibernate.service.CustomerServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "index.jsp";
		String email = request.getParameter("userEmail");
		String password = request.getParameter("password");
		
		HttpSession session=request.getSession();  
	    session.setAttribute("email",email); 
		
		PrintWriter o=response.getWriter();
		CustomerServiceImpl amp1 = new CustomerServiceImpl();
		Customer c1 = amp1.viewCustomerByEmail(email);
		//session.setAttribute("customer",c1); 
		if(c1==null){
			o.println("This Email Does not registed, Please register");
		} else{
			if(c1.getPassword().equals(password) && c1.getIsAdmin().equals("Yes")){
				o.println("1");
//				page = "adminHome.jsp";
//				response.sendRedirect(page);
			} else if(c1.getPassword().equals(password) && c1.getIsAdmin().equals("No")){
				o.println("2");
//				page = "mainPage.jsp";
//				response.sendRedirect(page);
			} else{
				o.println("Wrong password");
			}
		}
	}

}
