package com.tushar;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//PrintWriter printWriter = resp.getWriter();
		//printWriter.println("Hello to Square Servlet.");
		
		int result = (int) req.getAttribute("result");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Result is: " + result * result);
	}
}
