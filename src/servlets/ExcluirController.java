package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RadcheckDao;

public class ExcluirController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		new RadcheckDao().removeRadCheck(Integer.parseInt(req.getParameter("id")));
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/webresources/start.jsp");
		
	}



	
	
	
}
