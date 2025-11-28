package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	// this class is for creating the Connection with Mysql it ensure that only the connection is being created
	static Connection conn=null;
	
	// method for the getconncetion which will return the Connection
	public static Connection getMyConnection() {
		if(conn==null) { // agar connecion nahi bana hai to connection karna hai
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());  // this needs the throw or the try catch
				String url="jdbc:mysql://192.168.10.117:3306/dac104?useSSL=false";
				conn=DriverManager.getConnection(url,"dac104","welcome");
				
				
//				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//				String url="jdbc:mysql://localhost:3306/test?useSSL=false";
//				conn=DriverManager.getConnection(url,"root","root123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return conn;
	}
	
	// method for closing the connection
	
	public void closeMyConnection()  {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
