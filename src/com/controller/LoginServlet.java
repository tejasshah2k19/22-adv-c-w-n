package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	String cEmail;
	String cPassword;

	public void init(ServletConfig config) throws ServletException {
		cEmail = config.getInitParameter("email");
		cPassword = config.getInitParameter("password");

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

//		ServletConfig config = getServletConfig();
//		String cEmail = config.getInitParameter("email");
//		String cPassword = config.getInitParameter("password");

	}

}
