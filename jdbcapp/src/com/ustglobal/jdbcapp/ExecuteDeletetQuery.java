package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeletetQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			
			//step3 Issue the SQL query 
			String sql = "delete from employee_info where id = 7";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step4 Read the result.   
			System.out.println(count +" Row(s) deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}// end of main

}//end of ExecuteInsertQuery

