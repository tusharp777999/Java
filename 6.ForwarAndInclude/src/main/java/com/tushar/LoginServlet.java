package com.tushar;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equalsIgnoreCase("Tushar") && password.equalsIgnoreCase("Demo")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
			requestDispatcher.forward(req, resp);
		} else {
			
		}
	}
}
