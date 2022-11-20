package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("RegistrationServlet()");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation - required
		boolean isError = false;
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
			request.setAttribute("emailError", "Please Enter Email");

		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			error += "Please Enter Password<br>";
			request.setAttribute("passwordError", "Please Enter Password");

		}

		RequestDispatcher rd = null;
		if (isError) {
			// go to registration page
			request.setAttribute("error", error);
			rd = request.getRequestDispatcher("Registration.jsp");
		} else {
			// goto login
			rd = request.getRequestDispatcher("Login.jsp");
		}

		rd.forward(request, response);

	}
}
