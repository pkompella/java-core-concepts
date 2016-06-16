package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCQueryDemo {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/Training";

	// Database credentials
	static final String USER = "training";
	static final String PASS = "training123";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, fname, lname, age FROM Employee";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("fname");
				String last = rs.getString("lname");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First Name: " + first);
				System.out.println(", Last Name: " + last);
			}
			
			
	/*		//Prepared Statment
			String psql = "UPDATE Employee set age=?";
		    pstmt = conn.prepareStatement(psql);
		      
		      //Bind values into the parameters.
		      pstmt.setInt(1, 16);  // This would set age
		      //pstmt.setInt(2, 10); // This would set ID
		      
		      // Let us update age of the record with ID = 102;
		      int rows = pstmt.executeUpdate();
		      System.out.println("Rows impacted : " + rows );
		   */
		      
			
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			//pstmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			System.out.println("Exception occurred..... ==> " + se.getMessage() + "Code =>" + se.getErrorCode());
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");

	}

}
