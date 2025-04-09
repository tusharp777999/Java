package com.tushar;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		//System.out.println("result is: " + result);
		
		//PrintWriter printWriter = resp.getWriter();
		//printWriter.println("result is: " + result);
		
		
		req.setAttribute("result", result);
		
		//To call the other servlet we have two ways i.e. RequestDispacther and Redirect.
		
		//Use of RequestDispatcher
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("square");
		//This will simply forward the request and response object to the other servlet.
		requestDispatcher.forward(req, resp);
	}
}
