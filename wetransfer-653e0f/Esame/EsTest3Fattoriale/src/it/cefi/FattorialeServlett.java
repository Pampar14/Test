package it.cefi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fattoriale")
public class FattorialeServlett extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("risultato.jsp");
		int fattoriale = Integer.parseInt(req.getParameter("numero"));
		int risultato = Fattoriale.calcolaFattoriale(fattoriale);
		req.setAttribute("risultato", risultato);
		
		
		dispatcher.include(req, resp);
	}

}
