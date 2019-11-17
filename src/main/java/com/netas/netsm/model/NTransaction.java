package com.netas.netsm.model;

import javax.persistence.*;

@Entity
public class NTransaction {

	@Id()
	@GeneratedValue
	@Column(name = "ID")
	private String id;

	@Column(name = "OPERATION")
	private String operation;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "STOCK")
	private String stock;

	@Column(name = "USER_ID")
	private String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
