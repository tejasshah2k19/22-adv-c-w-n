<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Cookie</title>
</head>
<body>
	<form action="AddCookieServlet" method="post">
		Cookie Name : <input type="text" name="cname"><br>
		<br> Cookie Value : <input type="text" name="cvalue"><Br>
		<Br> <input type="submit" value="Save Cookie" />
	</form>
<br>

<a href="PrintCookieServlet">Print All Cookie</a>
</body>
</html>