package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

public class MyThirdJDBCWithDeleteProperties {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt  = null;
		FileReader reader = null;
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
//			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			 
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
		
			int count = pstmt.executeUpdate();
			System.out.println(count +" Row(s) deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstmt!=null)
					pstmt.close();
				if(reader!=null)
					reader.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

		
	}

	
}
