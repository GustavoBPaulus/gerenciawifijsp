<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de acessos</title>
</head>
<body>
	
		<table border="1" cellpadding="5" cellspacing="1">
			<thead>
			<tr>	
				<th>Username</th>
				<th>Senha</th>	
				<th>Editar</th>
				<th>Excluir</th>
			</tr>
			</thead>
		<tbody>
			<jstl:forEach items="${listaRadcheck}" var="radcheck">
				<tr>
					<td> ${radcheck.username} </td>
					<td> ${radcheck.value} </td>
					<td> <a href="${pageContext.request.contextPath}/editar?id=${radcheck.id}">Editar</a> </td>
					<td> <a href="${pageContext.request.contextPath}/excluir?id=${radcheck.id}">Excluir</a> </td>
				</tr>
			</jstl:forEach>	
		</tbody>	
		</table>
		<a href="${pageContext.request.contextPath}/incluir">Criar novo</a>
	
	
	
</body>
</html>