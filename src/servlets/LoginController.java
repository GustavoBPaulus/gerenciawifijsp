package servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import entity.Usuario;
import util.Md5Converte;
import util.UsuarioUtil;

public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usuario = req.getParameter("login").trim();
		String senha = null;
		try {
			senha = Md5Converte.converte(req.getParameter("senha").trim());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean autenticado = false;
		System.out.println("usuário digitado: " + usuario);
		System.out.println("senha: " + senha);

		autenticado = (UsuarioUtil.verificaUsuario(usuario, senha));

		req.setAttribute("autenticado", autenticado);

		if (autenticado) {
			req.setAttribute("nome", req.getParameter("login"));
			RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/start");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/login.jsp");
			System.out.println();
			System.out.println(autenticado);
			dispatcher.forward(req, resp);
		}
	}

}
