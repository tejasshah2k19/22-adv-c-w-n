<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<%
		String error = (String) request.getAttribute("error");
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
	%>

	<h2>Registration</h2>
	<form action="RegistrationServlet">
		FirstName: <input type="text" name="firstName" /> <span class="error">
			<%=firstNameError == null ? "" : firstNameError%>
		</span> <br> <br> Email : <input type="text" name="email">
		<%=emailError == null ? "" : emailError%>
		<br> <br> Password: <input type="password" name="password">
		<%=passwordError == null ? "" : passwordError%>
		<br> <br> <input type="submit" value="Signup" />

	</form>

	<%=error == null ? "" : error%>

</body>
</html>