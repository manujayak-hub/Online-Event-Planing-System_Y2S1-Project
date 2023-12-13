package conCustomer;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public logoutServlet() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 // Get the existing session
        HttpSession session = request.getSession(false);

        // If session exists, invalidate it (log out the user)
        if (session != null) {
            session.invalidate();
        }

        // Redirect the user to the index page after logout
        response.sendRedirect("index.jsp");
		
		
		
	}

}
