package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{

	private String deleteMessage;
	private ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();
	private String itemId;

	public String execute(){
		String result = SUCCESS;
		int res = dao.itemListDelete(itemId);

		if(res > 0){
			setDeleteMessage("商品情報を正しく削除しました。");
		}else if(res == 0){
			setDeleteMessage("商品情報の削除に失敗しました。");
		}
		return result;
	}

	public String getDeleteMessage(){
		return this.deleteMessage;
	}
	public void setDeleteMessage(String deleteMessage){
		this.deleteMessage = deleteMessage;
	}
	public String getItemId(){
		return this.itemId;
	}
	public void setItemId(String itemId){
		this.itemId = itemId;
	}
}


//itemIdを追加