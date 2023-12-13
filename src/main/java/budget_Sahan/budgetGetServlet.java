package budget_Sahan;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;




@WebServlet("/budgetGetServlet")
public class budgetGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int eventid =Integer.parseInt(request.getParameter("eventid"));

		try {
			List<budget> budgetInfo=budgetDBUtil.validate(eventid);
			request.setAttribute("budgetInfo", budgetInfo);
		}

		catch(Exception e){
			e.printStackTrace();
		}

		RequestDispatcher dis= request.getRequestDispatcher("checkBudget.jsp");
		dis.forward(request, response);



	}
}
