package com.del;

import java.util.Scanner;

public abstract class Arithmatic {

	int num1,num2;
	public abstract void calculate(int a,int b);
	public void read()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		this.calculate(a,b);
	}
	
	public void display(int num3)
	{
		System.out.println("Result : "+num3);
	}

	
}
