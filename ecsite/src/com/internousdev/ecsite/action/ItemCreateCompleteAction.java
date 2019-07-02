package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute(){
		String result = SUCCESS;
		itemCreateCompleteDAO.createItem(session.get("newItemName").toString(),
				session.get("newItemPrice").toString(),
				session.get("newItemStock").toString());
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}