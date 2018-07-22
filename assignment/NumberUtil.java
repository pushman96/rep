package com.del.assignment;
import java.util.Scanner;

public class NumberUtil {
	int product(int a,int b) {
		System.out.println(a*b);
		return a*b;
	}
	double squareRoot(double c) {
		System.out.println(Math.sqrt(c));
		return Math.sqrt(c);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose what you want to do.....1.MULTIPLICATION 2.SQUAREROOT");
		int input=sc.nextInt();
		NumberUtil obj=new NumberUtil();
		if(input==1) {
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter second Number");
			int b=sc.nextInt();
			
			obj.product(a,b);
		}
		else if(input==2)
		{
			System.out.println("Enter the number");
			int c=sc.nextInt();
			obj.squareRoot(c);
		}
		}
		
	}


