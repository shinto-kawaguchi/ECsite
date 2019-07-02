package com.internousdev.ecsite.action;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String newItemName;
	private String newItemPrice;
	private String newItemStock;
	public Map<String, Object> session;
	private String errorMessage;

	public String execute(){

		String result = SUCCESS;

		//未入力の項目の有無を確認しています。
		if(!(newItemName.equals(""))
				&& !(newItemPrice.equals(""))
				&& !(newItemStock.equals(""))){

			//正規表現のパターンを指定して、文字列が数値かどうかチェックする。
			Pattern p = Pattern.compile("^[0-9]+$");
			Matcher m1 = p.matcher(newItemPrice);
			Matcher m2 = p.matcher(newItemStock);
			if(!(m1.find())
				|| !(m2.find())){
					setErrorMessage("入力に間違いがあります");
					result = ERROR;
			}else{
				//確認画面で表示したい値をセッションに格納します。
				session.put("newItemName", newItemName);
				session.put("newItemPrice", newItemPrice);
				session.put("newItemStock", newItemStock);
			}
		}else{
			setErrorMessage("未入力の項目があります");
			result = ERROR;
		}
		return result;
	}
	public String getNewItemName(){
		return this.newItemName;
	}
	public void setNewItemName(String newItemName){
		this.newItemName = newItemName;
	}
	public String getNewItemPrice(){
		return this.newItemPrice;
	}
	public void setNewItemPrice(String newItemPrice){
		this.newItemPrice = newItemPrice;
	}
	public String getNewItemStock(){
		return this.newItemStock;
	}
	public void setNewItemStock(String newItemStock){
		this.newItemStock = newItemStock;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
	public String getErrorMessage(){
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
}
