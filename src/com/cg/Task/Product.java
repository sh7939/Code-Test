package com.cg.Task;

public class Product {
	private Integer itemID;
	private String itemName;
	private Double itemCost;

	public Product(Integer itemID, String itemName, Double itemCost) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemCost() {
		return itemCost;
	}

	public void setItemCost(Double itemCost) {
		this.itemCost = itemCost;
	}

}
