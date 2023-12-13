package musicalShow_Shehani;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class createeventservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public createeventservlet() {
		super();

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String location = request.getParameter("location");
		String bandname = request.getParameter("bandname");
		String pricerange = request.getParameter("pricerange");
		String ticket = request.getParameter("ticket");

		boolean isTrue;

		isTrue = showDBUtill.addevent(fullname,email,address,location,bandname,pricerange,ticket);

		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("showbooking.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("eventcreate.jsp");
			dis2.forward(request, response);
		}
	}
}


