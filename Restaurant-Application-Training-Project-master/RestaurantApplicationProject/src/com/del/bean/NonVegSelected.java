package com.del.bean;

import javax.persistence.Id;

public class NonVegSelected {

	private int id;
	private String dishname;
	private int availableQuant;
	public int getAvailableQuant() {
		return availableQuant;
	}
	public void setAvailableQuant(int availableQuant) {
		this.availableQuant = availableQuant;
	}
	private int selctedQuant;
	private int price;
	
	public NonVegSelected()
	{
		
	}
	@Override
	public String toString() {
		return "NonVegSelected [id=" + id + ", dishname=" + dishname + ", availableQuant=" + availableQuant
				+ ", selctedQuant=" + selctedQuant + ", price=" + price + "]";
	}
	
	public NonVegSelected(int id, String dishname, int availableQuant, int selctedQuant, int price) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.availableQuant = availableQuant;
		this.selctedQuant = selctedQuant;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public int getSelctedQuant() {
		return selctedQuant;
	}
	public void setSelctedQuant(int selctedQuant) {
		this.selctedQuant = selctedQuant;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
