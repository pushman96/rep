package com.del.bean;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	
	@Id
	private String dishname;
	private int price;
	private int availableQuanitity;
	private int selectedQuantity;
	
	public Invoice()
	{
		
	}
		
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableQuanitity() {
		return availableQuanitity;
	}
	public void setAvailableQuanitity(int availableQuanitity) {
		this.availableQuanitity = availableQuanitity;
	}
	public int getSelectedQuantity() {
		return selectedQuantity;
	}
	public void setSelectedQuantity(int selectedQuantity) {
		this.selectedQuantity = selectedQuantity;
	}
	@Override
	public String toString() {
		return "Invoice [dishname=" + dishname + ", price=" + price + ", availableQuanitity=" + availableQuanitity
				+ ", selectedQuantity=" + selectedQuantity + "]";
	}
	public Invoice(String dishname, int price, int availableQuanitity, int selectedQuantity) {
		super();
		this.dishname = dishname;
		this.price = price;
		this.availableQuanitity = availableQuanitity;
		this.selectedQuantity = selectedQuantity;
	}
	
	
}
