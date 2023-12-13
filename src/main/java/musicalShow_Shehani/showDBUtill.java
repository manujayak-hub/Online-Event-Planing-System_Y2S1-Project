package musicalShow_Shehani;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ChooseEvent.DBConnection;

public class showDBUtill{
	
	private static Connection con=null;
	private static Statement stat=null;
	private static ResultSet ss=null;
	
	
	public static boolean addevent(String fullname, String email,String address,String location,String bandname,String pricerange,String ticket) {
		
		boolean isSuccess = false;
		 

		
		
		try {
			
			con = DBConnection.getconnection();
			stat = con.createStatement();
			String sql = "INSERT INTO eventcreate (fullname,email,address,location,bandname,pricerange,ticket) VALUES('"+fullname+"','"+email+"','"+address+"','"+location+"','"+bandname+"','"+pricerange+"','"+ticket+"')";
			int check = stat.executeUpdate(sql);
			
			if(check > 0) {
				isSuccess = true;
			}else {
				isSuccess = false; 
			}
			
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return isSuccess;
	}
	
	public List <show> getshowdetails(){


	ArrayList<show> s1 = new ArrayList<>();


	try {


		con = DBConnection.getconnection();
		stat = con.createStatement();
		String sql = "SELECT * FROM eventcreate ";


		ss = stat.executeQuery(sql);


		while (ss.next()) {

			int ideventcreate = ss.getInt(1);
			String fullname = ss.getString(2);
			String email = ss.getString(3);
			String address = ss.getString(4);
			String location = ss.getString(5);
			String bandname = ss.getString(6);
			double pricerange = ss.getDouble(7);
			int ticket = ss.getInt(8);

			show sh = new show (ideventcreate,fullname,email,address,location,bandname,pricerange,ticket);
			s1.add(sh);

		}


	}
	catch(Exception e) {
		e.printStackTrace();
	}

	return s1;


}

public static boolean updatedetails(int ideventcreate, String fullname, String email, String address,String location, String bandname, double pricerange, int ticket) {

	boolean isSuccess = false;

	try {

		con = DBConnection.getconnection();
		stat = con.createStatement();
		String sql = "UPDATE eventcreate SET fullname='"+fullname+"',email='"+email+"',address='"+address+"',location='"+location+"',bandname='"+bandname+"',pricerange='"+pricerange+"',ticket='"+ticket+"'WHERE ideventcreate='"+ideventcreate+"'";
		int check = stat.executeUpdate(sql);

		if(check > 0) {
			isSuccess = true;
		}else {
			isSuccess = false; 
		}

	}
	catch(Exception e) {
		e.printStackTrace();
	



}
	return isSuccess;
}

public List<show> getdetailsforUpdate(int eventid){
	ArrayList<show> s1 = new ArrayList<>();


	try {


		con = DBConnection.getconnection();
		stat = con.createStatement();
		String sql = "SELECT * FROM eventcreate where idEventCreate = '"+eventid+"' ";


		ss = stat.executeQuery(sql);


		while (ss.next()) {

			int ideventcreate = ss.getInt(1);
			String fullname = ss.getString(2);
			String email = ss.getString(3);
			String address = ss.getString(4);
			String location = ss.getString(5);
			String bandname = ss.getString(6);
			double pricerange = ss.getDouble(7);
			int ticket = ss.getInt(8);

			show sh = new show (ideventcreate,fullname,email,address,location,bandname,pricerange,ticket);
			s1.add(sh);

		}

		

	}
	catch(Exception e) {
		e.getMessage();
	}

	return s1;



}

public static boolean DeleteEvent(int idevent) {

	boolean isSuccess = false;


	try {
		con= DBConnection.getconnection();
		stat = con.createStatement(); 
		String sql = "DELETE FROM eventcreate WHERE ideventcreate = '"+idevent+"'";
		int rs =stat.executeUpdate(sql);

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
