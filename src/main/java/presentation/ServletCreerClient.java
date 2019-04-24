package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import service.ServiceImplementation;

/**
 * Servlet implementation class ServletCreerClient
 */
@WebServlet("/ServletCreerClient")
public class ServletCreerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCreerClient() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String firstName = request.getParameter("prenom");
		String email = request.getParameter("email");
		String adress = request.getParameter("adresse");
		String city = request.getParameter("ville");
		String postalCode = request.getParameter("cp");
		String number = request.getParameter("tel");

		Client c = new Client(name, firstName, email, adress, postalCode, city, number);// on cree un client

		request.setAttribute("client", c);// on rajoute une ligne à la fiche avc une clé client et l objet c

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/CreerClient.jsp");

		dispatcher.forward(request, response);

	}

}
