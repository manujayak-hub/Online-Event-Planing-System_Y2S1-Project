package musicalShow_Shehani;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class GetDetailsForUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public GetDetailsForUpdateServlet() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showDBUtill showDBUtill =new showDBUtill();

		int idevent =Integer.parseInt(request.getParameter("idevent"));


		List<show> details = showDBUtill.getdetailsforUpdate(idevent);


		request.setAttribute("getid", details);



		RequestDispatcher r1 = request.getRequestDispatcher("showbooking.jsp");
		r1.forward(request, response);


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
}
