package message_thakshila;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MessageUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int messageid = Integer.parseInt(request.getParameter("messageid"));
        String customername = request.getParameter("customername");
        String customeremail = request.getParameter("customeremail");
        String messagedescription = request.getParameter("messagedescription");
        int eventid = Integer.parseInt(request.getParameter("eventid"));
        
        boolean istrue;

        istrue = MessageDBUtil.updatedetails(messageid, customername, customeremail, messagedescription, eventid);

        if (istrue==true) {
            RequestDispatcher r1 = request.getRequestDispatcher("updateSuccess.jsp");
            r1.forward(request, response);
        } else {
            request.setAttribute("message", "Failed to update the message. Please try again.");
            RequestDispatcher r1 = request.getRequestDispatcher("updateUnsuccess.jsp");
            r1.forward(request, response);
        }
    
	}

}
