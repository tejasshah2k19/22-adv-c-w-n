package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validators;

public class AddBookFormatFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("AddBookValidatorFilter::doFilter()");
		String bookName = request.getParameter("bname");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		boolean isError = false;

		if (Validators.isAlpha(bookName) == false) {
			isError = true;
			request.setAttribute("bookNameError", "Please Enter Valid Book Names");
		} else {
			request.setAttribute("bookNameValue", bookName);
		}
		if (Validators.isDigit(price) == false) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Valid Price");
		} else {
			request.setAttribute("priceValue", price);
		}
		if (Validators.isDigit(qty) == false) {
			isError = true;
			request.setAttribute("qtyError", "Please Enter Valid Qty");
		} else {
			request.setAttribute("qtyValue", qty);
		}
		RequestDispatcher rd = null;
		if (isError) {
			// goback
			rd = request.getRequestDispatcher("AddBook.jsp");
			rd.forward(request, response);
		} else {
			//next filter or servlet 
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
