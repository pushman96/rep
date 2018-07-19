package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	private Pattern pattern;
	private Matcher matcher;
	private String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
	private PasswordValidator() {
		
		pattern = Pattern.compile(regex);
	}
	private boolean validate(String input) {
		boolean valid = false;
		matcher = pattern.matcher(input);
		valid = matcher.matches();
		
		return valid;
	}

	public static void main(String[] args) {

		PasswordValidator idv = new PasswordValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Password ");
		String input = scan.nextLine();
		boolean valid = idv.validate(input);
		System.out.println("Password Valid: " + valid);
	}
}
