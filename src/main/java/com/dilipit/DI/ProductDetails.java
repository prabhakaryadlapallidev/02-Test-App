package com.dilipit.DI;

import org.springframework.stereotype.Component;

@Component("product")
public class ProductDetails {

	ProductDetails(){
		System.out.println("productDetails instance is created.....");
	}
	
	
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
