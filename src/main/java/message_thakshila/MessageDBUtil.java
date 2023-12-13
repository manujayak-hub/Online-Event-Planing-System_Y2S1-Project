package message_thakshila;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class MessageDBUtil {
	private static Connection conn=null;
	private static Statement stmnt=null;
	private static ResultSet rst=null;


	
	public static boolean insertMessage(String customername,String customeremail,String messagedescription,int eventid) {
		
		
		boolean isSuccess = false;
		
		String url="jdbc:mysql://localhost:3306/oop";
		String user="root";
		String pass="12345";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt=con.createStatement();
			
			String sql="Insert into message (messageid,customername,customeremail,messagedescription,eventid) values(0,'"+customername+"','"+customeremail+"','"+messagedescription+"','"+eventid+"')";
	
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
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
	
	public static List<Message> validate(int eventid){
		
		ArrayList<Message> mes = new ArrayList<>();
		
		String url="jdbc:mysql://localhost:3306/oop";
		String user="root";
		String pass="12345";
		
	
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
			
				Connection con = DriverManager.getConnection(url,user,pass);
				Statement stmt=con.createStatement();
						
				String sql = "select * from message where eventid='"+eventid+"'";
				ResultSet rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					
					int messageid = rs.getInt(1);
					String customername=rs.getString(2);
					String customeremail=rs.getString(3);
					String messagedescription=rs.getString(4);
					int eventid1=rs.getInt(5);
					
					Message m=new Message(messageid,customername,customeremail,messagedescription,eventid1);
					mes.add(m);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			
			}
			return mes;
	}
	
	 public static boolean updatedetails(int messageid,String customername,String customeremail,String messagedescription,int eventid) {
		 boolean isSuccess = false;
		 try {
			 conn= DBConnection.getconnection();
			 stmnt = conn.createStatement(); 
			 String sql="UPDATE message SET messageid='"+messageid+"',customername='"+customername+"',customeremail='"+customeremail+"',messagedescription='"+messagedescription+"',eventid='"+eventid+"'" + " WHERE eventid='"+eventid+"'";
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
	 public static boolean Deletemessage(int eventid) {

			boolean isSuccess = false;


			try {
				conn= DBConnection.getconnection();
				stmnt = conn.createStatement(); 
				String sql = "DELETE FROM message WHERE eventid= '"+eventid+"'";
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