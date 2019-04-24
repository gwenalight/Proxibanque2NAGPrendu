<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h3> le client est bien créé</h3>
<body>
<p/>nom :${client.name}
<p/>firstName :${client.firstName}
<p/>email :${client.email}
<p/>adress :${client.adress}
<p/>city: ${client.city}
<p/>postalCode :${client.postalCode}
<p/>number:${client.number}


</body>
</html>