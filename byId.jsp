<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="attore" class="com.dvdStore.model.Actor" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:getProperty property="nome" name="attore"/><br>
<jsp:getProperty property="cognome" name="attore"/><br>

</body>
</html>