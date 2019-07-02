package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<UserInfoDTO> getUserListInfo(){
		ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();

		String sql = "SELECT id, login_id, login_pass, user_name, insert_date FROM login_user_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto = new UserInfoDTO();
				dto.setUserListId(rs.getString("id"));
				dto.setUserListLoginId(rs.getString("login_id"));
				dto.setUserListLoginPassword(rs.getString("login_pass"));
				dto.setUserListUserName(rs.getString("user_name"));
				dto.setUserListInsert_date(rs.getString("insert_date"));
				userInfoDTO.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userInfoDTO;
	}
}
