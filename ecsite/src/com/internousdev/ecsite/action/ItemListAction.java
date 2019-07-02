package com.internousdev.ecsite.action;

import java.util.ArrayList;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{

	private ItemListDAO dao = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfoList = new ArrayList<ItemInfoDTO>();

	public String execute(){
		String result = SUCCESS;
		itemInfoList = dao.getItemListInfo();
		return result;
	}

	public ArrayList<ItemInfoDTO> getItemInfoList(){
		return this.itemInfoList;
	}
}
