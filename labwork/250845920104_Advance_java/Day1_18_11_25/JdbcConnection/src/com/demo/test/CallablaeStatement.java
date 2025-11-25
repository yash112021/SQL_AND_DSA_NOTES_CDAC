package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class CallablaeStatement {

	public static void main(String[] args) {
		// using the callable statement 
		Connection conn=null;
		try {
			// step 1 loading and installing driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.117:3306/dac104?useSSL=false";

			
			// step2 getting the connection 
			conn=DriverManager.getConnection(url,"dac104","welcome");
			
			
			//step 3 callable statement
			CallableStatement cst=conn.prepareCall("call proc2(?,?,?)");
			cst.setInt(1,50);
			cst.setInt(2,50);
		
			cst.registerOutParameter(3,java.sql.Types.INTEGER);
			cst.execute();
			int cnt=cst.getInt(3);
			System.out.println("count :"+cnt);
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}		

	}

}
