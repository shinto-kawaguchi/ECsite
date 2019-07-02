package com.internousdev.ecsite.action;

import java.util.ArrayList;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport{

	private UserListDAO dao = new UserListDAO();
	private ArrayList<UserInfoDTO> userInfoList = new ArrayList<UserInfoDTO>();

	public String execute(){
		String result = SUCCESS;
		userInfoList = dao.getUserListInfo();
		return result;
	}

	public ArrayList<UserInfoDTO> getUserInfoList(){
		return this.userInfoList;
	}
}
