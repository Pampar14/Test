import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cesare")
public class CesareServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("pagina.jsp");
		String frase= req.getParameter("frase");
		int incremento = Integer.parseInt(req.getParameter("incremento"));
		String risultato = Criptazione.criptazione(frase, incremento);
		req.setAttribute("risultato", risultato);
		dispatcher.include(req, resp);
	}
}
