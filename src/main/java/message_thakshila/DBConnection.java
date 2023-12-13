package message_thakshila;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DBConnection {
	
	private static String url="jdbc:mysql://localhost:3306/oop";
	private static String UserName="root";
	private static String PassWord="12345";
	private static Connection conn;
	
	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.jdcb.Driver");
			conn=(Connection) DriverManager.getConnection(url,UserName,PassWord);
		}
		catch(Exception e) {
			System.out.println("Connection is Faild");
		}
		return conn;
	}
	

}
