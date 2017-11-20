<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<%@page import="ma.sylob.formation.models.Fruit"%>
<%@page import="ma.sylob.formation.util.BDDUtil"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des fruits</title>
</head>
<body>
	<table>
		<tr>
			<th>id</th>
			<th>code</th>
			<th>Description</th>
			<th>Action</th>
		</tr>
		<%
List<Fruit> listfruit = BDDUtil.getInstance().getListFruit();
for(Fruit fruit:listfruit){ %>
		<tr>
			<td><%= fruit.getId() %></td>
			<td><%= fruit.getCode() %></td>
			<td><%= fruit.getDescription() %></td>
			<td><a href="<c:url value="/deletefruit?fruitId=${fruit.id}"/>"></td>
			
		</tr>
		<% 
}
%>
	</table>
</body>
</html>