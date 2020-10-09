<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Incluir</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/incluir">
	<label for="username">Username:</label>
	<input type="text" id="username" name="username" />

	<label for="senha">Senha:</label>
	<input type="password" id="senha" name="senha" />

	<label for="tipos">Tipo:</label>
	<select name="tipos" id="tipos">
		<option value="aluno">aluno</option>
		<option value="tecnico">tecnico</option>
		<option value="professor">professor</option>
	</select>

	<label for="situacao">Situação:</label>
	<select name="situacao" id="situacao">
		<option value="ativo">ativo</option>
		<option value="inativo">inativo</option>
	</select>
	
	<input type="submit" />
	</form>
		<!-- verificar se deu erro no usuário e senha  -->
				<jstl:if test="${requestScope.formularioCompleto==false}">
					<h6>preencha todos os campos!</h6>
				</jstl:if>
</body>
</html>