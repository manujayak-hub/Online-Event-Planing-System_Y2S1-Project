package message_thakshila;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PassTableToUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int eventid =Integer.parseInt(request.getParameter("eventid"));

		try {
			List<Message> mesDetails=MessageDBUtil.validate(eventid);
			request.setAttribute("mesDetails", mesDetails);
		}

		catch(Exception e){
			e.printStackTrace();
		}

		RequestDispatcher dis= request.getRequestDispatcher("updatePrint.jsp");
		dis.forward(request, response);



	}
}