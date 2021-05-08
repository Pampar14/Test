package it.cefi;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fibonacci")
public class FibonacciServlett extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/pagina.jsp");
		int numero = Integer.parseInt(req.getParameter("numeroFibonacci"));
		String risultato = FibonacciSequenza.fibonacciSeq(numero);
		req.setAttribute("risultato", risultato);
		req.setAttribute("numero", numero);
		dispatcher.include(req, resp);

	}

	
}
