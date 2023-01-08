<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<!--  dynamic -->
	<jsp:include page="HEader.jsp"></jsp:include>
	this is inclusion.jsp contnet
	<br>
	<!-- static  -->
	<%@include file="Footer.jsp"%>

	<%//h error %>
	<%=f%>



</body>
</html>