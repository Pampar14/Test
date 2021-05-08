<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criptografico Cesare</title>
</head>
<body>
	<form action="cesare" method="post">
		<label>Inserisci una frase da criptare: </label>
		<input type="text" name="frase"><br/>
		<label>Di quanto la vuoi incrementare?</label>
		<input type="number" name="incremento">
		<button>Cripta!</button>	
	</form>
</body>
</html>