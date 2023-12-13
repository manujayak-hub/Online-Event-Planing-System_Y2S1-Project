package musicalShow_Shehani;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UpdateDataServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ideventcreate = Integer.parseInt(request.getParameter("eventID"));
		 String fullname = request.getParameter("fullName");
		 String email = request.getParameter("email");
		 String address = request.getParameter("address");
		 String location = request.getParameter("location" );
		 String bandname = request.getParameter("bandName");
		 double pricerange = Double.parseDouble(request.getParameter("priceRange"));
		 int ticket = Integer.parseInt(request.getParameter("ticket"));

		boolean isTrue;

		isTrue = showDBUtill.updatedetails(ideventcreate, fullname, email, address, location, bandname,pricerange,ticket);

		
		
		if(isTrue==true) {

			RequestDispatcher dis = request.getRequestDispatcher("showbooking.jsp");
			dis.forward(request, response);
		}
		else {
			

			RequestDispatcher dis = request.getRequestDispatcher("showbooking.jsp");
			dis.forward(request, response);
		}

	}

}
