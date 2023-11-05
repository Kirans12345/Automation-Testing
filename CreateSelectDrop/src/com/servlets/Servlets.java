package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlets
 */
@WebServlet("/Servlets")
public class Servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con = null;
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/animated_movies","root","root");
				PreparedStatement ps = con.prepareStatement("select * from movies where title='Inside Out'");
				ResultSet rs = ps.executeQuery();
				
		while(rs.next()) {
					
				}
		
		           con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
