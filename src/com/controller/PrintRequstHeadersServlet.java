package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintRequstHeadersServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String referer = request.getHeader("referer");
		
		Calendar c = Calendar.getInstance();
		Enumeration<String> headers = request.getHeaderNames();

		// browser print ->

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.print("<html><body>");
		// host cookie referer
		while (headers.hasMoreElements()) {
			String name = headers.nextElement();
			String value = request.getHeader(name);
			out.print(name+" => "+value+"<br>");
		}
		out.print("</body></html>");

	}

}
