package com.del;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of calculation you want to take place in the calculator");
		System.out.println("Press 0 for addition");
		System.out.println("Press 1 for subtraction");
		System.out.println("Press 2 for multiplication");
		System.out.println("Press 3 for division");
		int n=scan.nextInt();
		Arithmatic a[]= {new Addition(),new Subtraction(),new Multiplication(),new Division()};
		a[n].read();
	}


	}

	
		
	

		
		
		