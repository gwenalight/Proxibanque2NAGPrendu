package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;

/**
 * Servlet implementation class ServletListClient
 */
@WebServlet("/ServletListClient")
public class ServletListClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 List<Client> listeClient = new ArrayList<Client>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletListClient() {

		Client  i= new Client("name", "firstName");
		Client i1 = new Client("name1", "firstName1");
		Client i2 = new Client("name2", "firstName2");
		Client i3 = new Client("name3", "firstName3");
		listeClient.add(i);
		listeClient.add(i1);
		listeClient.add(i2);
		listeClient.add(i3);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("client", listeClient);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/ListeClient.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
