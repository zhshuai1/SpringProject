package com.zebrait.chapter10;

import java.io.Serializable;

import lombok.Data;

@Data
public class Beer implements Serializable {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private String name;
	private int quantity;
	private String brand;
	public Beer(String name, int quantity, String brand) {
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
	}
	
}

