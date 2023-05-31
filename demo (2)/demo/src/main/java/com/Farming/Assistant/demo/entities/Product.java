package com.Farming.Assistant.demo.entities;

import jakarta.persistence.Table;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name ="ProductTable")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "PRODUCT_PRICE")
	private long productPrice;

	@Column(name = "PRODUCT_Quantity")
	private long productQuantity;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Product(long productId, String productName, long productPrice, long productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	
}
