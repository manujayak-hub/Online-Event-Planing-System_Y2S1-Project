package ChooseEvent;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class chooseEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public chooseEventServlet() {
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int cusid =Integer.parseInt(request.getParameter("cusid"));
			String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String email = request.getParameter("email");
	        String phone = request.getParameter("phone");
	        String address = request.getParameter("address");
	        String eventype = request.getParameter("eventType");
	        String eventdate = request.getParameter("eventDate");
	        String venue = request.getParameter("eventVenue");
	        int guests = Integer.parseInt(request.getParameter("guests"));
	        String theme = request.getParameter("theme");
	        double budget = Double.parseDouble(request.getParameter("budget"));
	        String servicesRequired = request.getParameter("ServicesRequired");
	        String specialRequests = request.getParameter("SpecialRequests");
	        String odetails = request.getParameter("otherdetails");

	        boolean istrue;
	        
	        istrue = eventDButill.adddetails(cusid, firstName, lastName, email, phone, address, eventype, eventdate, venue,guests, theme, budget, servicesRequired, specialRequests, odetails);
	        
	        if(istrue == true) {
	        	RequestDispatcher r1 = request.getRequestDispatcher("indexlogged.jsp");
	    		r1.forward(request, response);
	        }
	        else {
	        	RequestDispatcher r1 = request.getRequestDispatcher("chooseevntform.jsp");
	    		r1.forward(request, response);
	        }
	}

}
