package com.internousdev.ecsite.dto;

public class UserInfoDTO {

	public String userListId;
	public String userListLoginId;
	public String userListLoginPassword;
	public String userListUserName;
	public String userListInsert_date;

	public String getUserListId(){
		return this.userListId;
	}
	public void setUserListId(String userListId){
		this.userListId = userListId;
	}
	public String getUserListLoginId(){
		return this.userListLoginId;
	}
	public void setUserListLoginId(String userListLoginId){
		this.userListLoginId = userListLoginId;
	}
	public String getUserListLoginPassword(){
		return this.userListLoginPassword;
	}
	public void setUserListLoginPassword(String userListLoginPassword){
		this.userListLoginPassword = userListLoginPassword;
	}
	public String getUserListUserName(){
		return this.userListUserName;
	}
	public void setUserListUserName(String userListUserName){
		this.userListUserName = userListUserName;
	}
	public String getUserListInsert_date(){
		return this.userListInsert_date;
	}
	public void setUserListInsert_date(String userListInsert_date){
		this.userListInsert_date = userListInsert_date;
	}
}
