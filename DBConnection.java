package com.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		// TODO Auto-generated method stub
		
		// This is DB connection string
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "select * from movies";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement(); // execute query
		ResultSet rs = stmt.executeQuery(query); 
		
		

	}

}