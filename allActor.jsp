<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList" %>

<%@ page import="com.dvdStore.model.Actor" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Tabella attori</h1>
<hr>
		<table border="1">
				
				<tr>
					<td><b>Cognome</b></td>
					<td><b>Nome</b></td>
				
				</tr>
				<c:forEach items="${requestScope.fullList}" var="x">
						
						<tr>
							<td>
								<c:out value="${x.getCognome() }"></c:out>
							</td>
							<td>
								<c:out value="${x.getNome() }"></c:out>
							</td>
						</tr>
				</c:forEach>
				
				
				
				
				
				
				
				
				
				
				<%
// 					ArrayList<Actor> lista=(ArrayList<Actor>)request.getAttribute("fullList");
// 					for(int i=0;i<lista.size();i++){
						
// 					out.println("<tr>");
					
// 					out.println("<td>");
// 							out.println(lista.get(i).getCognome());
// 							out.println("</td>");
						
// 							out.println("<td>");
// 							out.println(lista.get(i).getNome());
// 					out.println("</td>");
						
// 					out.println("</tr>");
// 					}
				
				%>
				
		
		</table>

</body>
</html>