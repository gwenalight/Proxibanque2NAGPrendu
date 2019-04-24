<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="parta">
		<h1>Liste de vos Clients</h1>
		<c:forEach items="${client}" var="i">
			<p /> ${i.name}  
			<p />${i.firstName}
		</c:forEach>
	</div>

	<div class="partc">
		<input type="submit" value="selectionner" /><br />
		<form method="post" action="ServletFormCreerClient">
			<input type="submit" value="creer client" />
		</form>
		<br /> <input type="submit" value="supprimer client" /><br /> <form method="get" action="ServletConsulterCompteBancaireClient"><input
			type="submit" value="consulter " /></form> <br /> <input
			type="submit" value="editer client" /><br />
		<form method="get" action="ServletEffectuerVirement">
			<input type="submit" value="effectuer un virement" />
		</form>
		<p />
	</div>

</body>
</html>