package com.ustglobal.jdbcapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2 get the connection.
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			
			//step3 Issue the SQL query 
			String sql = "insert into employee_info values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int salary = Integer.parseInt(empsal);
			pstmt.setInt(3, salary);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			int count =  pstmt.executeUpdate();
			
			//stmt = conn.createStatement();
			//int count = stmt.executeUpdate(sql);
			
			
			
			//step4 Read the result.   
			System.out.println(count +" Row(s) inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
//				if(stmt!=null)
//					stmt.close();
				if(pstmt!=null){
					pstmt.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}// end of main

}//end of ExecuteInsertQuery
