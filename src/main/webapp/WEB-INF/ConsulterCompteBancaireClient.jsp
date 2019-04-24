<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="ServletConsulterCompteBancaireClient">
		<div class="parta">
			<h1>Consulter les comptes d'un de vos Clients</h1>
			Veuillez inscrire le nom du client <input type="text" name="name"
				placeholder="nom">
			<p />
			Veuillez inscrire le prénom du client <input type="text"
				name="firstName" placeholder="prenom">
		</div>
		<div class="partc">
			<input type="submit" value="envoyer" /> <input type="reset"
				value="reset" />
			<p />
		</div>

	</form>

</body>
</html>