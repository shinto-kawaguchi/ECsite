package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemCreateCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil du = new DateUtil();

	private String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, insert_date) VALUES(?,?,?,?)";

	public void createItem(String newItemName, String newItemPrice, String newItemStock){
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newItemName);
			ps.setString(2, newItemPrice);
			ps.setString(3, newItemStock);
			ps.setString(4, du.getDate());
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
