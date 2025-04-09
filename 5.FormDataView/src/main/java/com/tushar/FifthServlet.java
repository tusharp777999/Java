package com.tushar;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FifthServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String number = req.getParameter("number");
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<html><body>");
		printWriter.println("Firstname: " + firstName + "<br>");
		printWriter.println("Lastname: " + lastName + "<br>");
		printWriter.println("Mobile No: " + number + "<br>");
		printWriter.println("</body></html>");
		printWriter.close();
	}
}
