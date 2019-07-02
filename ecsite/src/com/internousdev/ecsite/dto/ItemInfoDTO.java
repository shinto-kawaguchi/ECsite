package com.internousdev.ecsite.dto;

public class ItemInfoDTO {

	public String itemName;
	public String itemPrice;
	public String itemStock;
	public String id;
	public String insert_date;
	public String update_date;

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}
	public String getItemStock(){
		return itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}
	public String getUpdate_date(){
		return this.update_date;
	}
	public void setUpdate_date(String update_date){
		this.update_date = update_date;
	}
}
