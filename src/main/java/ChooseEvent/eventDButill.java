package ChooseEvent;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class eventDButill {

	private static Connection conn=null;
	private static Statement stmnt=null;
	private static ResultSet rst=null;

	public static boolean adddetails(int cusid,String firstName,String lastName,String email,String phone,String address,String eventype, String eventdate,String venue,int guests,String theme,double budget,String service,String special,String odetails) {

		boolean isSuccess = false;

		try {

			conn= DBConnection.getconnection();
			stmnt = conn.createStatement();
			String sql = "INSERT INTO event (cusid, firstName, lastName, email, phone, address, eventype, eventdate, venue, guests, theme, budget, service, special, odetails) VALUES ('"+cusid+"','"+firstName+"', '"+lastName+"', '"+email+"', '"+phone+"', '"+address+"', '"+eventype+"', '"+eventdate+"', '"+venue+"', '"+guests+"', '"+theme+"', '"+budget+"', '"+service+"', '"+special+"', '"+odetails+"')";
			int rs =stmnt.executeUpdate(sql);

			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}


		}
		catch(Exception e){
			e.printStackTrace();
		}

		return isSuccess;

	}

	public static List<event> geteventdetails(int cusid){

		ArrayList<event> e1 = new ArrayList<>();

		try {

			conn= DBConnection.getconnection();
			stmnt = conn.createStatement();

			String sql = "SELECT * FROM event WHERE cusid ='"+cusid+"'";
			rst = stmnt.executeQuery(sql);




			while (rst.next()) {
				int idevent = rst.getInt(1);
				int customerid = rst.getInt(2);
				String firstName = rst.getString(3);
				String lastName = rst.getString(4);
				String email = rst.getString(5);
				String phone = rst.getString(6);
				String address = rst.getString(7);
				String eventype = rst.getString(8);
				String eventdate = rst.getString(9);
				String venue = rst.getString(10);
				int guests = rst.getInt(11);
				String theme = rst.getString(12);
				double budget = rst.getDouble(13);
				String servicesrequired = rst.getString(14);
				String specialRequests = rst.getString(15);
				String odetails = rst.getString(16);

				//factory method pattern

				event eve = new event(idevent, customerid, firstName, lastName, email, phone, address, eventype, eventdate, venue, guests, theme, budget, servicesrequired, specialRequests, odetails);
				e1.add(eve);
			}
		}

		catch(Exception e) {
			e.getMessage();
		} 

		return e1;

	}

	public static boolean updatedetails(int idevent, int cusid,String firstName,String lastName,String email,String phone,String address,String eventype, String eventdate,String venue,int guests,String theme,double budget,String service,String special,String odetails) {

		boolean isSuccess = false;


		try {
			conn= DBConnection.getconnection();
			stmnt = conn.createStatement(); 
			String sql = "UPDATE event SET  firstName='"+firstName+"',lastName= '"+lastName+"', email='"+email+"', phone='"+phone+"',address= '"+address+"',eventype= '"+eventype+"', eventdate='"+eventdate+"',venue= '"+venue+"', guests='"+guests+"', theme='"+theme+"', budget='"+budget+"',service= '"+service+"',special= '"+special+"', odetails='"+odetails+"'"
					+ " WHERE idevent='"+idevent+"'";
			int rs =stmnt.executeUpdate(sql);

			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}


		}
		catch(Exception e){
			e.printStackTrace();
		}

		return isSuccess;

	}

	public static List<event> geteventdetailstoupdate(int idevents){

		ArrayList<event> e1 = new ArrayList<>();

		try {

			conn= DBConnection.getconnection();
			stmnt = conn.createStatement();

			String sql = "SELECT * FROM event WHERE idevent ='"+idevents+"'";
			rst = stmnt.executeQuery(sql);




			while (rst.next()) {
				int idevent = rst.getInt(1);
				int customerid = rst.getInt(2);
				String firstName = rst.getString(3);
				String lastName = rst.getString(4);
				String email = rst.getString(5);
				String phone = rst.getString(6);
				String address = rst.getString(7);
				String eventype = rst.getString(8);
				String eventdate = rst.getString(9);
				String venue = rst.getString(10);
				int guests = rst.getInt(11);
				String theme = rst.getString(12);
				double budget = rst.getDouble(13);
				String servicesrequired = rst.getString(14);
				String specialRequests = rst.getString(15);
				String odetails = rst.getString(16);

				//factory method pattern
				event eve = new event(idevent, customerid, firstName, lastName, email, phone, address, eventype, eventdate, venue, guests, theme, budget, servicesrequired, specialRequests, odetails);
				e1.add(eve);
			}
		}

		catch(Exception e) {
			e.getMessage();
		} 

		return e1;

	}


	public static boolean DeleteEvent(int idevent) {

		boolean isSuccess = false;


		try {
			conn= DBConnection.getconnection();
			stmnt = conn.createStatement(); 
			String sql = "DELETE FROM event WHERE idevent = '"+idevent+"'";
			int rs =stmnt.executeUpdate(sql);

			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}


		}
		catch(Exception e){
			e.printStackTrace();
		}

		return isSuccess;

	}
}
