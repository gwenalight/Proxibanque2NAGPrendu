<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="ServletEffectuerVirement">
		<div class="parta">
			<h1>Effectuer un Virement de Compte à compte</h1>
			Veuillez indiquer le numero de compte à débiter <input type="text"
				name="CB1" placeholder="numero compte bancaire">
			<p />
			Veuillez indiquer le numero de compte à créditer<input type="text"
				name="CB2" placeholder="numero compte bancaire">
			<p />
			Indiquer le montant à transferer<input type="text" name="somme"
				placeholder="montant" />
			<p />
		</div>

		<div class="partc">
			<input type="submit" value="envoyer" /> <input type="reset"
				value="reset" />
			<p />
		</div>

	</form>

</body>
</html>