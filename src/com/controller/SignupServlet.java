package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("SignupServlet()");
		System.out.println("---------------");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
		// how to write some data on browser
		// how to send response using servlet

		// validation - required
		boolean isError = false;
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			error += "Please Enter Password<br>";
		}

		response.setContentType("text/html");// MIME type
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.print("<body>");

		if (isError == true) {
			out.print(error);
		} else {
			out.println("<br>FirstName => " + firstName);
			out.println("<br>Email => " + email);
			out.println("<br>Password => " + password);
		}

		out.print("</body>");
		out.print("</html>");
	}

	// wrapper class
	// String -> int
	// Ingteger.parseInt()
	// Integer.valueOf()
}
