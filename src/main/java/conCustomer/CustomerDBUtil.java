package conCustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ChooseEvent.DBConnection;

public class CustomerDBUtil {
	
	private static Connection conn=null;
	private static Statement stmnt=null;
	private static ResultSet rst=null;
	
	public static boolean cusdetails(String firstName,String lastName,String email, String password) {
		boolean isSuccess = false;

		try {

			conn= DBConnection.getconnection();
			stmnt = conn.createStatement();
			String sql = "INSERT INTO customer (firstName, lastName, email,password) VALUES ('"+firstName+"', '"+lastName+"', '"+email+"', '"+password+"')";
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
	
	public static List<Customer> validateLogin(String email, String Password){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
	
		
		try {
			conn= DBConnection.getconnection();
			stmnt = conn.createStatement();

			String sql = "select * from customer where email ='"+email+"' and password ='"+Password+"'";
			
			rst = stmnt.executeQuery(sql);
			
			
			
			
			if(rst.next()){
				int cusId=rst.getInt(1);
				String name=rst.getString(2);
				String surName=rst.getString(3);
				String mail=rst.getString(4);
				String passWord=rst.getString(5);
				
				Customer c =new Customer(cusId, name, surName, mail, passWord);
				cus.add(c);
				
				
				
			}
		}
		
		catch(Exception e) {
			e.getMessage();
		} 
		
		return cus;
		
	}

}
