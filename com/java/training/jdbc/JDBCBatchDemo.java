package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatchDemo {

	public static void main(String[] args) throws Exception {
		// Create SQL statement
		String SQL = "INSERT INTO Employee(id,age, fname, lname, address) "
				+ "VALUES(?, ?, ?, ? , ?)";

		//final PreparedStatement stmt = null;

		// Create preparedStatemen
		System.out.println("Creating statement...");
		try (Connection conn = JDBCHelper.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(SQL);

			// Set auto-commit to false
			conn.setAutoCommit(false);

			// First, let us select all the records and display them.
			displayRows(stmt);
			
			//cleanup the created rows
			deleteRows(stmt);
			
			//DBOperations b = (s) -> deleteRows(stmt);
			
			// add records to batch
			addRecordsToBatch(stmt);

			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();
			System.out.println("Batch execute returns = " + count.length);

			// Explicitly commit statements to apply changes
			conn.commit();

			// Again, let us select all the records and display them.
			displayRows(stmt);
			
			//cleanup the created rows
			deleteRows(stmt);

			// cleanup
			stmt.close();

		} catch (Exception e) {
			System.out.println("Error ==> " + e.getMessage());
		}

	}

	private static void addRecordsToBatch(PreparedStatement stmt)
			throws SQLException {
		// Set the variables
		for (int index = 1; index <= 100; index++) {
			stmt.setInt(1, 1000 + index);
			stmt.setInt(2, 23+index);
			stmt.setString(3, "Test First Name " + index);
			stmt.setString(4, "Test Last Name " + index);
			stmt.setString(5, "Sample Address " + index);
			// Add it to the batch
			stmt.addBatch();
		}

	}

	private static void displayRows(Statement stmt) throws SQLException {
		System.out.println("Displaying available rows...");
		// Let us select all the records and display them.
		String sql = "SELECT id, age, fname, lname, address FROM Employee";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String first = rs.getString("fname");
			String last = rs.getString("lname");
			String address = rs.getString("address");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Age: " + age);
			System.out.print(", First: " + first);
			System.out.println(", Last: " + last);
			System.out.println(", Address: " + address);
		}
		System.out.println();
		rs.close();
	}// end printRows()
	
	private static void deleteRows(Statement stmt) {
		System.out.println("Displaying available rows...");
		// Let us select all the records and display them.
		String sql = "DELETE from Employee where id > 1000";
		int result = 0;
		try {
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Delete result = " + result);
	}// end printRows()


}

interface DBOperations {
	void deleteRows(Statement stmt);
}
