<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Risultato errore</title>
	</head>
	<body>
	<h2>I primi <%= request.getAttribute("numero") %> numeri sono : </h2>
		<h3><%= request.getAttribute("risultato") %></h3>
	</body>
	</html>