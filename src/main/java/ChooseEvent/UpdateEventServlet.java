package ChooseEvent;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class UpdateEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateEventServlet() {
        
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idevent = Integer.parseInt(request.getParameter("idevent"));

        
        List<event> eventToUpdate = eventDButill.geteventdetailstoupdate(idevent);
        request.setAttribute("eventToUpdate", eventToUpdate);

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("User.jsp");
        dispatcher.forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idevent = Integer.parseInt(request.getParameter("idevent"));
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
        
        
        istrue = eventDButill.updatedetails(idevent, cusid, firstName, lastName, email, phone, address, eventype, eventdate, venue, guests, theme, budget, servicesRequired, specialRequests, odetails);
        
        if(istrue == true) {
        	request.setAttribute("message", "Event details added successfully!");
        	RequestDispatcher r1 = request.getRequestDispatcher("User.jsp");
    		r1.forward(request, response);
        }
        else {
        	request.setAttribute("message", "Failed to add event details. Please try again.");
        	RequestDispatcher r1 = request.getRequestDispatcher("User.jsp");
    		r1.forward(request, response);
        }
	}

}
