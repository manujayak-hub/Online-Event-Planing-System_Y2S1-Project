package budget_Sahan;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/budgetinsert")
public class budgetInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eventid= Integer.parseInt(request.getParameter("eventid"));
		double venuecost=Double.parseDouble(request.getParameter("venuecost"));
		double guestcost=Double.parseDouble(request.getParameter("guestcost"));
		double entertainmentcost=Double.parseDouble(request.getParameter("entertainmentcost"));
		double photographycost=Double.parseDouble(request.getParameter("photographycost"));
		double totalcost=Double.parseDouble(request.getParameter("totalcost"));
	
		
		
		boolean isTrue;
		
		isTrue= budgetDBUtil.insertbudget(eventid,venuecost,guestcost,entertainmentcost,photographycost,totalcost);
		
		if(isTrue== true) {
			RequestDispatcher dis = request.getRequestDispatcher("insertBudget.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2= request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}

