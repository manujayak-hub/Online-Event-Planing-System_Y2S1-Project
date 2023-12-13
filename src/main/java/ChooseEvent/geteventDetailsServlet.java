package ChooseEvent;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class geteventDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public geteventDetailsServlet() {
    	
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cusid = Integer.parseInt(request.getParameter("customerid"));
		
		try {
			List<event> eventdetails = eventDButill.geteventdetails(cusid);
			
			request.setAttribute("eventdetails", eventdetails); 
		
			
		}
		catch (Exception e) {
			e.getMessage();
		}
		
		RequestDispatcher r1 = request.getRequestDispatcher("User.jsp");
		r1.forward(request, response);
	}

}
