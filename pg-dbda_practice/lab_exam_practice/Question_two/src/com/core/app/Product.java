package com.core.app;
import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable {
	private static final long serialVersionUID = 6761053141759865185L;
	private int Id;
	private static int count=0;
	private String productName;
	private double price;
	private LocalDate expiryDate;
	
	public Product(int Id, String productName, double price, LocalDate expiryDate) {
		//		this.Id=Id;
		this.productName=productName;
		this.price=price;
		this.expiryDate=expiryDate;
		this.Id=++count;
		
	}//end of constructor

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Product Name=" + productName + ", price=" + price + ", expiryDate=" + expiryDate + "]";
	}//end of overridden toString method

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return productName;
	}

	public void setName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

}//end of Product Class
