package com.del;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// Take a n digit number from user and verfiy same
		int digits = 5;
		System.out.println("Enter a " + digits + " digit number");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		boolean valid = input.matches("\\d{" + digits + "}");// \d{5}
		System.out.println("valid = " + valid); // test cases : 12345 1234 123456 1234H
	}

}
