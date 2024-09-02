package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myusername = request.getParameter("username1");
		String mypassword = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		if(myusername.equals("hlozaid") && mypassword.equals("12345")) {
			RequestDispatcher rd= request.getRequestDispatcher("/welcome.html");
			rd.forward(request, response);
		}else {
			response.setContentType("text/html");
			out.print("Wrong Email and Password");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
	}
}
