package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{

	// creating the connection
	static Connection conn;
	static {
		conn=DBUtil.getMyConnection();
	}
	
	
	@Override
	public List<Integer> findallCategory() {
		
		//  Prepared Statement
		try {
			PreparedStatement pst=conn.prepareStatement("select PRODID from product");
			ResultSet rs=pst.executeQuery();
			// now one result set tostroe the prouduct id
			List<Integer> lst=new ArrayList<>();
			while(rs.next()) {
				lst.add(rs.getInt(1));
			}
			return lst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<Product> findByCid(int cid) {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from product where PRODID=?");
			ps.setInt(1,cid);
			ResultSet rs = ps.executeQuery();
			List<Product> plist = new ArrayList<>();
			// now getting the reusltset from the database
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString("DESCRIP"),rs.getInt(3),rs.getInt(4),rs.getFloat(5)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
