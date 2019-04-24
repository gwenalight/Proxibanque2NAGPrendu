<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CreerClient</title>
</head>
<h2>
	<center>Creation Client</center>
</h2>
<body>
	<fieldset>

			<br> Nom : <br>
			<input type="text" name="name" placeholder="Entrez le nom"> <br>
			Prenom : <br>
			<input type="text" name="prenom" placeholder="tapez le prenom">
			<br> Adresse : <br>
			<input type="text" name="adresse" placeholder="tapez l'adresse">
			<br> Ville :<br> <input type="text" name="ville"
				placeholder="tapez la ville"> <br> Code Postal : <br>
			<input type="text" name="cp" placeholder="tapez le code postal">
			<br> Email :<br> <input type="email" name="email"
				placeholder="tapez l'email"> <br> Télephone :<br>
			<input type="text" name="tel" placeholder="tapez le telephone">
			<br> <br>
			 <form method="post" action="ServletCreerClient"><input type="submit" value="Valider"></form>

		</form>
	</fieldset>
</body>
</html>