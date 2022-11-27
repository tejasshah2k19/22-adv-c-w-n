<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

	<%
		String productNameError = (String) request.getAttribute("productNameError");
		String priceError = (String) request.getAttribute("priceError");
		String qtyError = (String) request.getAttribute("qtyError");
		String productNameValue = (String) request.getAttribute("productNameValue");
		String qtyValue = (String) request.getAttribute("qtyValue");
		String priceValue = (String) request.getAttribute("priceValue");
	%>
	<form method="post" action="AddProductServlet">
		Name : <input type="text" name="pname"
			value="<%=productNameValue == null ? "" : productNameValue%>" />
		<%=productNameError == null ? "" : productNameError%>

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