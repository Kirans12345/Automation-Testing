package com.storedprocedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args)  {
		
		
		String url="jdbc:mysql://localhost/ecommerce";
		String username="root";
		
		String password="root";
	
	Connection con;
	try {
		con = DriverManager.getConnection(url, username, password);
	
	Statement st=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}