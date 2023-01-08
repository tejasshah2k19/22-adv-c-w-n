<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>

	<%
		String bookNameError = (String) request.getAttribute("bookNameError");
		String priceError = (String) request.getAttribute("priceError");
		String qtyError = (String) request.getAttribute("qtyError");
		String bookNameValue = (String) request.getAttribute("bookNameValue");
		String qtyValue = (String) request.getAttribute("qtyValue");
		String priceValue = (String) request.getAttribute("priceValue");
	%>

 
	<form method="post" action="AddBookServlet">
		Name : <input type="text" name="bname"
			value="<%=bookNameValue == null ? "" : bookNameValue%>" />
		<%=bookNameError == null ? "" : bookNameError%>

		<Br> <Br> Price : <input type="text" name="price"
			value="<%=priceValue == null ? "" : priceValue%>" />
		<%=priceError == null ? "" : priceError%>

		<Br> <Br> Qty : <input type="text" name="qty"
			value="<%=qtyValue == null ? "" : qtyValue%>" />
		<%=qtyError == null ? "" : qtyError%>
		<Br> <Br> <input type="submit" value="Add Product">
	</form>

</body>
</html>