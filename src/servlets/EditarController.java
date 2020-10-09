package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RadcheckDao;
import entity.Radcheck;


public class EditarController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idRad = Integer.parseInt(req.getParameter("id"));
		Radcheck radcheck = new RadcheckDao().getRadcheck(idRad);
		
		req.setAttribute("radcheck", radcheck);
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/editar.jsp");
		dispatcher.forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Radcheck radcheck = new Radcheck();
		radcheck.setId(Integer.parseInt(req.getParameter("id")));
		radcheck.setUsername(req.getParameter("username"));
		radcheck.setValue(req.getParameter("senha"));
		radcheck.setSituacao(req.getParameter("situacao"));
		radcheck.setTipo(req.getParameter("tipo"));
		
		new RadcheckDao().updateRadcheck(radcheck);
		
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/start.jsp");
		dispatcher.forward(req, resp);
		
	}

	
	
	
}
