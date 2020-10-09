package servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RadcheckDao;
import entity.Radcheck;
import util.Md5Converte;


public class IncluirController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		//valida se todos os campos estão completos
		boolean formularioCompleto = false;
		
		String username = req.getParameter("username").trim();
		String senha = req.getParameter("senha").trim();
		
		if( (username!=null && !username.equals("")) && ( senha != null && !senha.equalsIgnoreCase("") )  )
			formularioCompleto = true;
		else {
			req.setAttribute("formularioCompleto", formularioCompleto);
			
			RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/inserir.jsp");
			dispatcher.forward(req, resp);
			
			
			
		}

		
	
		if(formularioCompleto) {
		
		Radcheck radcheck = new Radcheck(username, senha, 
				req.getParameter("tipos").trim(), req.getParameter("situacao").trim());
		
		new RadcheckDao().addRadcheck(radcheck);
		
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/start.jsp");
		dispatcher.forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/inserir.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	
	
	
	
	
	
	
	

	
	
}
