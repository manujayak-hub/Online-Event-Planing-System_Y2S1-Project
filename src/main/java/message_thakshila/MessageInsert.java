package message_thakshila;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;




public class MessageInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customername=request.getParameter("customername");
		String customeremail=request.getParameter("customeremail");
		String messagedescription=request.getParameter("messagedescription");
		int eventid=Integer.parseInt(request.getParameter("eventid"));
		
		boolean isTrue;
		
		isTrue=MessageDBUtil.insertMessage(customername, customeremail, messagedescription, eventid);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
		
	}

}
