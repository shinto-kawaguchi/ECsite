package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware{

	private String deleteMessage;
	private UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();
	public Map<String, Object> session;

	public String execute(){
		String result = SUCCESS;
		int res = dao.userListDelete();

		if(res > 0){
			setDeleteMessage("ユーザー情報を正しく削除しました。");
		}else if(res == 0){
			setDeleteMessage("ユーザー情報の削除に失敗しました。");
		}
		return result;
	}

	public String getDeleteMessage(){
		return this.deleteMessage;
	}
	public void setDeleteMessage(String deleteMessage){
		this.deleteMessage = deleteMessage;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
