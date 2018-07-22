package lol;

import java.util.Scanner;

public class Calculator {
	
	public  void add(int a,int b)
	{
		int s;
		s=a+b;
		System.out.println("The sum of "+a+" and "+b+" is : "+s);
	}
	public  void subtract(int a,int b)
	{
		int s;
		s=a-b;
		System.out.println("The difference between "+a+" and "+b+" is : "+s);
	}
	public  void divide(int a,int b)
	{
		int s;
		s=a/b;
		System.out.println("The result of "+a+" divided by "+b+" is : "+s);
	}
	public  void multiply(int a,int b)
	{
		int s;
		s=a*b;
		System.out.println("The product of "+a+" and "+b+" is : "+s);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");

		int x=scan.nextInt();
		System.out.println("enter the value of b");
		int y=scan.nextInt();
		Calculator ca=new Calculator();
		ca.add(x,y);
		ca.subtract(x,y);
		ca.divide(x, y);
		ca.multiply(x, y);
	}

}
