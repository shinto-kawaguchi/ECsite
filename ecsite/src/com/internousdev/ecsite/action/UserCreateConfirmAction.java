package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.internousdev.ecsite.dto.UserCreateConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;
	private String errorMessage;
	private String duplicateMessage;
	private UserCreateConfirmDAO dao = new UserCreateConfirmDAO();
	private UserCreateConfirmDTO dto = new UserCreateConfirmDTO();

	public String execute(){
		String result = SUCCESS;


		//未入力の項目の有無を確認しています。
		if (!(loginUserId.equals(""))
				&& !(loginPassword.equals(""))
				&& !(userName.equals(""))){
			dto = dao.selectLoginUserId(loginUserId);
			//追加(既に登録済みのIDを入力した場合にエラーメッセージを表示する)
			if(loginUserId.equals(dto.getLoginId())){
				setErrorMessage("すでに登録されているIDです");
				result = ERROR;
			}else {
				//確認画面で表示したい値をセッションに格納します。
				session.put("loginUserId", loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("userName", userName);
			}

		}else{
			setErrorMessage("未入力の項目があります");
			result = ERROR;
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
	public String getDuplicateMessage(){
		return this.duplicateMessage;
	}
	public void setDuplicateMessage(String duplicateMessage){
		this.duplicateMessage = duplicateMessage;
	}
}
