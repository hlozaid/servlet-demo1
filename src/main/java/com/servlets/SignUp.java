package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myname = request.getParameter("name2");
		String myusername = request.getParameter("username2");
		String myemail = request.getParameter("email2");
		String mypassword = request.getParameter("password2");
		
		PrintWriter out = response.getWriter();
		
		out.println("Name: "+myname);
		out.println("Username: "+myusername);
		out.println("Email: " + myemail);
		out.println("Password: " + mypassword);
		
	}
	

}
