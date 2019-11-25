package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MySecondJDBCWithInsertProperties {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		
		
		try {
			//step1 load the driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);			
			
	
			//step2 get the connection.
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			
			//step3 Issue the SQL query 
			String sql = prop.getProperty("insert-query");
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
			
		} catch (Exception e) {
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
				if(reader!=null) {
					reader.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}// end of main

}//end of ExecuteInsertQuery

