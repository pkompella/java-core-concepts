package com.java.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallableStmtDemo {

	public static void main(String[] args) {
		 CallableStatement stmt = null;
		 
		 try (Connection conn = JDBCHelper.getConnection()){
		      //S: Execute a query
		      System.out.println("Creating statement...");
		      String sql = "{call getEmpName (?, ?)}";
		      stmt = conn.prepareCall(sql);
		      
		      //Bind IN parameter first, then bind OUT parameter
		      int empID = 1001;
		      stmt.setInt(1, empID); // This would set ID as 102
		      // Because second parameter is OUT so register it
		      stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		      
		      //Use execute method to run stored procedure.
		      System.out.println("Executing stored procedure..." );
		      stmt.execute();

		      //Retrieve employee name with getXXX method
		      String empName = stmt.getString(2);
		      System.out.println("Emp Name with ID:" + 
		               empID + " is " + empName);
		      stmt.close();
		      conn.close();
		   }catch(Exception se){
			   System.out.println("Error.. ==> " + se.getMessage() );
		   }

	}

}
