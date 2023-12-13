package budget_Sahan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class budgetDBUtil {

	public static boolean insertbudget(int eventid,double venuecost,double guestcost, double entertainmentcost,double photographycost, double totalcost) {

		boolean isSuccess=false;


		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DBConnection.getconnection();
			Statement stmt =   con.createStatement();
			String sql= "Insert Into budget (eventid,venuecost,guestcost,entertainmentcost,photographycost,totalcost) values(  "+eventid+","+venuecost+","+guestcost+","+entertainmentcost+","+photographycost+","+totalcost+")";
			int rs= stmt.executeUpdate(sql);

			if(rs> 0) {
				isSuccess = true;
			}
			else {
				isSuccess= false;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}


	

	public static List<budget> validate(int eventid){

		ArrayList<budget> bud= new ArrayList<>();


		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DBConnection.getconnection();
			Statement stmt =   con.createStatement();

			String sql= "select * from budget where eventid='"+eventid+"'";
			ResultSet rs= stmt.executeQuery(sql);

			if(rs.next()) {
				int budgetid=rs.getInt(1);
				int eventid1=rs.getInt(2);
				double venuecost=rs.getDouble(3);
				double guestcost= rs.getDouble(4);
				double entertainmentcost= rs.getDouble(5);
				double photographycost= rs.getDouble(6);
				double totalcost=rs.getDouble(7);

				budget b1= new budget(budgetid,eventid1,venuecost,guestcost,entertainmentcost, photographycost,totalcost );

				bud.add(b1);
			}

		}

		catch(Exception e) {

			e.printStackTrace();


		}

		return bud;

	}
	
	
	public static boolean updatecustomer(int eventid,double venuecost,double guestcost, double entertainmentcost,double photographycost, double totalcost) {
		
		boolean isSuccess=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DBConnection.getconnection();
			Statement stmt=con.createStatement();
			String sql="update budget set eventid='"+eventid+"',venuecost='"+venuecost+"',guestcost='"+guestcost+"',entertainmentcost='"+entertainmentcost+"',photographycost='"+photographycost+"',totalcost='"+totalcost+"'"
		           +"where eventid='"+eventid+"'";
			
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}	
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	public static boolean deleteBudget(int eventid) {
		boolean isSuccess = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DBConnection.getconnection();
			Statement stmt=con.createStatement();
			String sql="delete from budget where eventid='"+eventid+"'";
			int r=stmt.executeUpdate(sql);
			if(r>0) {
				isSuccess=true;
			}
			else {
				
				isSuccess=false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}





}
