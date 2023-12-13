package conCustomer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;



public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Login() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uemail");
		String password = request.getParameter("upw");
		
		HttpSession session =request.getSession();
		
		
		try {
			 List<Customer> cusDetails = CustomerDBUtil.validateLogin(username, password);
	            request.setAttribute("cusDetails", cusDetails);

	            session.setAttribute("cusDetails", cusDetails);

	            // Check if the validated user is admin, redirect to user.jsp
	            if ("budgetm@gmail.com".equals(username)) {
	                RequestDispatcher adminDispatcher = request.getRequestDispatcher("insertBudget.jsp");
	                adminDispatcher.forward(request, response);
	            }
	            
	            else if ("showm@gmail.com".equals(username)){
	            	 RequestDispatcher adminDispatcher = request.getRequestDispatcher("eventcreate.jsp");
		                adminDispatcher.forward(request, response);
	            }
	            else if ("eventh@gmail.com".equals(username)){
	            	 RequestDispatcher adminDispatcher = request.getRequestDispatcher("insertBudget.jsp");
		                adminDispatcher.forward(request, response);
	            }
	            else {
	                // For other users, redirect to indexlogged.jsp
	                RequestDispatcher userDispatcher = request.getRequestDispatcher("indexlogged.jsp");
	                userDispatcher.forward(request, response);
	            }

			
		}
		catch (Exception e) {
			e.getMessage();
		}
		
		
	}

}
