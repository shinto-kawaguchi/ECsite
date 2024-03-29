package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	//メソッド名は処理内容を分かりやすくするために「getLoginUserInfo」にします。
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){
		String sql = "SELECT * FROM login_user_transaction WHERE login_id = ? AND login_pass = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
				//rs.getString("admin_flg") != null でnullの場合はこのif文を避けるようにする。
				if(rs.getString("admin_flg") != null && rs.getString("admin_flg").equals("1") ){
					loginDTO.setAdminFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}
}
