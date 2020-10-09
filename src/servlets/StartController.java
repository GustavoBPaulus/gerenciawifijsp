package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RadcheckDao;
import entity.Radcheck;

public class StartController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usuarioLogado = req.getParameter("login").trim();
		
		List<Radcheck> listaRadcheck = new RadcheckDao().listRadCheck();
		
		req.setAttribute("usuarioLogado", usuarioLogado);
		req.setAttribute("listaRadcheck", listaRadcheck);
		
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/start.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}
	
	

}
