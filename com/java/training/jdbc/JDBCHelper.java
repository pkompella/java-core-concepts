package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCHelper {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 2: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(JDBCConstants.DB_URL, JDBCConstants.USER, JDBCConstants.PASS);
		} catch (Exception e) {
			System.out.println("Error getting connection   => "
					+ e.getMessage());
		}
		return conn;
	}
}
