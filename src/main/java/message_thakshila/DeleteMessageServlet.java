package message_thakshila;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteMessageServlet() {
        super();
   
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventid = request.getParameter("eventid");

        boolean istrue;
        
        int number = Integer.parseInt(eventid);
        istrue = MessageDBUtil.Deletemessage(number);
        
        if(istrue == true) {
        	request.setAttribute("message", "Event details deleted successfully!");
        	RequestDispatcher r1 = request.getRequestDispatcher("success.jsp");
    		r1.forward(request, response);
        }
        else {
        	request.setAttribute("message", "Failed to delete event details. Please try again.");
        	RequestDispatcher r1 = request.getRequestDispatcher("unsuccess.jsp");
    		r1.forward(request, response);
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
	
	
