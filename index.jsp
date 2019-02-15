<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>DVD STORE Home page</h1>
<hr>

<a href="MainController?param=1">visualizza tutti gli attori</a>
<br><br>

<form action="MainController" method="post">
	
	<input type="hidden" name="param" value="2">
	<input type="text" name="id">inserisci id attore<br>
	<input type="submit">
	


</form>

</body>
</html>