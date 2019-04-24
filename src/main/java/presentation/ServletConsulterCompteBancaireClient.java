package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;

/**
 * Servlet implementation class ServletConsulterCompteBancaireClient
 */
@WebServlet("/ServletConsulterCompteBancaireClient")
public class ServletConsulterCompteBancaireClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConsulterCompteBancaireClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("name");
		String firstName = request.getParameter("firstName");

		Client c = new Client(name, firstName);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/WEB-INF/ConsulterCompteBancaireClient.jsp");
		requestDispatcher.forward(request, response);
		// ensuite il faut creer un if afin que si on donne les infos d'un client on
		// arrive sur une page ou l'on voit ses comptes et si on ne donne pas les infos
		// ils faut recommencer (cf identification conseiller)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// WEB-INF/ConsulterCompteBancaireClient.jsp
	}

}
