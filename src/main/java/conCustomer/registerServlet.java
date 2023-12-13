package conCustomer;

import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
       
  
    public registerServlet() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("confirmPassword");
   

        boolean istrue;
        
        istrue = CustomerDBUtil.cusdetails(firstName, lastName, email, password);
        
        if(istrue == true) {
        	out.println("<h3>Registration successful! You can now <a href='login.jsp'>login</a>.</h3>");
        	RequestDispatcher r1 = request.getRequestDispatcher("login.jsp");
    		r1.forward(request, response);
        }
        else {
        	RequestDispatcher r1 = request.getRequestDispatcher("Register.jsp");
    		r1.forward(request, response);
        }
	}

}
