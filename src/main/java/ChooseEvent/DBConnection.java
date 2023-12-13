 package ChooseEvent;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static String url="jdbc:mysql://localhost:3306/eventwise";
	private static String UserName="root";
	private static String PassWord="12345";
	private static Connection conn;
	
	public static Connection getconnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//singleton pattern
			conn =DriverManager.getConnection(url, UserName, PassWord);
		}
		catch(Exception e){
			System.out.println("Connection is Faild");
		}

		return conn;

	}
}
