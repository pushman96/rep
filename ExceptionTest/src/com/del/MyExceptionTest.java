package com.del;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {

	public MyExceptionTest() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter numerator");
			int numerator = scan.nextInt();
			System.out.println("Enter denominator");
			int denominator = scan.nextInt();
			int quotient = divide(numerator, denominator);
			System.out.println("Result : " + quotient);
		} catch (ArithmeticException e) {
			System.out.println("Denominator cannot be 0");
			
			
		}
		catch (InputMismatchException e)
		{
			System.out.println("Please enter numbers only");
		}
		finally {
			
			System.out.println("End of program");
		}

	}

	private int divide(int numerator, int denominator) {
		return numerator / denominator;
	}

	public static void main(String[] args) {
		new MyExceptionTest();

	}

}
