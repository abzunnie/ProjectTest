package com.example.demo;

import java.util.Date;

public class Product 
{
	private int productID;
	private String productCategory;
	private int productPrice;
	private String Name;
	private Date mfgDate;
	private Date expiryDate;
	
	public Product(int productID, String productCategory, int productPrice, String Name, Date mfgDate, Date expiryDate) {
		super();
		this.productID = productID;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.Name = Name;
		this.mfgDate = mfgDate;
		this.expiryDate = expiryDate;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	
	
	
}
