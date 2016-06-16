package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtDemo {


	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		try (Connection conn = JDBCHelper.getConnection()){
			//Connection conn = demo.getConnection();
			String psql = "UPDATE Employee set age=?";
		    pstmt = conn.prepareStatement(psql);
		      
		      //Bind values into the parameters.
		      pstmt.setInt(1, 16);  // This would set age
		      //pstmt.setInt(2, 10); // This would set ID
		      
		      // Let us update age of the record with ID = 102;
		      int rows = pstmt.executeUpdate();
		      System.out.println("Rows impacted : " + rows );
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage() );
		}


	}

	

}
