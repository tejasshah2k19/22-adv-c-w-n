<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jstl Demo</title>
</head>
<body>
<%int a=10; %>
<%=a %>

<br>
<c:set var="a" value="90"></c:set>
<c:out value="${a}"/>



</body>
</html>