package com.del;

public class Car extends Vehicle implements Movable {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int tyres, String type, double cost) {
		super(tyres, type, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car"+super.toString();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car is moving");
	}
	
}
