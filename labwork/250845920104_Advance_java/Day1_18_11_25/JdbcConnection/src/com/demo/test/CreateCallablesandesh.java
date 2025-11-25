package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateCallablesandesh {

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
			CallableStatement cst=conn.prepareCall("call proc1(?,?)");
			cst.setInt(1,1);
			cst.setInt(2,2);
			
		
			//cst.registerOutParameter(3,java.sql.Types.INTEGER);
			 cst.execute();
			 ResultSet rs = cst.getResultSet();
			 
			 while(rs.next()) {
				 System.out.println(rs.getInt(1));
			 }
			//int cnt=cst.getInt(3);
			//System.out.println("count :"+cnt);
			
			
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
