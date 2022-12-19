<%@page import="com.bean.ProductBean"%>
<%@page import="com.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome , ${cookie.userName.value}
	<br><Br>
	<%
		for (ProductBean p : ProductDao.products) {
	%>
	<%=p.getName()%><br>
	<a href="AddToCartServlet?productId=<%=p.getProductId()%>">Add To
		Cart</a>
<br><br><br>
	<%
		}
	%>
</body>

</html>