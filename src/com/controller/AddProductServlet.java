package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

public class AddProductServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
	}

	// doPost db add
	// doGet read
	// doDelete destroy
	// doPut update

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("pname");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		boolean isError = false;

		if (productName == null || productName.trim().length() == 0) {
			isError = true;
			request.setAttribute("productNameError", "Please Enter Product Names");
		} else if (Validators.isAlpha(productName) == false) {

			request.setAttribute("productNameError", "Please Enter Valid Product Names");
			request.setAttribute("productNameValue", productName);

		} else {
			request.setAttribute("productNameValue", productName);
		}
		if (price == null || price.trim().length() == 0) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Price");
		} else {
			request.setAttribute("priceValue", price);
		}
		if (qty == null || qty.trim().length() == 0) {
			isError = true;
			request.setAttribute("qtyError", "Please Enter Qty");
		} else {
			request.setAttribute("qtyValue", qty);
		}
		RequestDispatcher rd = null;
		if (isError) {
			// goback
			rd = request.getRequestDispatcher("AddProduct.jsp");
		} else {
			// goahead
			rd = request.getRequestDispatcher("Home.jsp");

		}

		rd.forward(request, response);

	}
}
