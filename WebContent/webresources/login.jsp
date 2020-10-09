<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Wifrs</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/webresources/css/bootstrap-grid.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/webresources/css/base.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/webresources/css/layout.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/webresources/css/componentes.css" />
</head>
<body>
	<header class="layout-cabecalho">
		<div class="container">
			<nav class="navegacao navegacao--assinatura">
				<a href="index.html"> <img
					src="${pageContext.request.contextPath}/webresources/images/logo.png"
					width="2%" height="2%" alt="IFRS">
				</a>
			</nav>

		</div>
	</header>

	<main class="layout-login">
<!--  	<div class="container"> -->
		<div class="caixa-login_formulario">
			<form action="/wifiAlunos/login" method="post">

				<h1 class="titulo-formulario titulo-formulario--login">Login</h1>

				<div class="grupo-entrada grupo-entrada--login">
					<label for="login">Login:</label> <input class="campo campo--login"
						type="text" id="login" name="login">
				</div>

				<div class="grupo-entrada grupo-entrada--login">
					<label for="senha">Senha:</label> <input class="campo campo--login"
						type="password" id="senha" name="senha">
				</div>

				<!-- verificar se deu erro no usuário e senha  -->
				<jstl:if test="${requestScope.autenticado==false}">
					<h6>Usuário ou senha incorreto!</h6>
				</jstl:if>

				<center>
					<input type="submit" value="Logar"
						class="botao botao--principal botao--formulario">
				</center>

			</form>
		</div>
	<!-- </div>   -->

	</main>



	<footer class="layout-rodape layout-rodape--login">
			<p>&copy; TI IFRS IBIRUBÁ.</p>
	</footer>
<script type="text/javascript" src="${pageContext.request.contextPath}/webresources/javascripts/messages.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/webresources/javascripts/events.js"></script>
	
</body>
</html>