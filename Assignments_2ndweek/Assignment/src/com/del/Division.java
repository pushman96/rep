package com.del;

public class Division extends Arithmatic {

	
	@Override
	public void calculate(int num1,int num2) {
		int num3=num1/num2;
		this.display(num3);
	}
}