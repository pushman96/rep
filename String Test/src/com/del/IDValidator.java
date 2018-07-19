package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDValidator {

	private Pattern pattern;
	private Matcher matcher;
	private String regex= "^(\\d{3}-\\d{2}-\\d{4})$";
	
	private IDValidator() {
		
		pattern = Pattern.compile(regex);
	}
	private boolean validate(String input) {
		boolean valid = false;
		matcher = pattern.matcher(input);
		valid = matcher.matches();
		
		return valid;
	}

	public static void main(String[] args) {

		IDValidator idv = new IDValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ID ");
		String input = scan.nextLine();
		boolean valid = idv.validate(input);
		System.out.println("ID Valid: " + valid);
	}
}
