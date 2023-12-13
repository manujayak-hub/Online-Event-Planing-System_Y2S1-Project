package ChooseEvent;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DeleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteEventServlet() {
       
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int idevent = Integer.parseInt(request.getParameter("idevent"));

        boolean istrue;
        
        
        istrue = eventDButill.DeleteEvent(idevent);
        
        if(istrue == true) {
        	request.setAttribute("message", "Event details deleted successfully!");
        	RequestDispatcher r1 = request.getRequestDispatcher("User.jsp");
    		r1.forward(request, response);
        }
        else {
        	request.setAttribute("message", "Failed to delete event details. Please try again.");
        	RequestDispatcher r1 = request.getRequestDispatcher("User.jsp");
    		r1.forward(request, response);
        }
    }
	
}
