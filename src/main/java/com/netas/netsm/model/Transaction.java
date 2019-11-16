package com.netas.netsm.model;

import javax.persistence.*;

@Entity
public class Transaction {

	@Id()
	@GeneratedValue
	@Column(name = "ID")
	private String id;
	
	@Column(name= "USER_ID")
	private String userId;
	
	@Column(name = "STOCK")
	private String stock;
	
	@Column(name= "PRICE")
	private double price;
	
	@Column(name = "QUANTITY")
	private double quantity;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
}
