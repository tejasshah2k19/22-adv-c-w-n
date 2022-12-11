package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie cookies[] = request.getCookies();

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body>");

		for (Cookie c : cookies) {
			out.print(c.getName() + ": " + c.getValue()+"<br>");
		}

		out.print("</body></html>");

	}

}
