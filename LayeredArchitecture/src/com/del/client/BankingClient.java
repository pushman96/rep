package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.BankingException;
import com.del.service.BankingService;
import com.del.service.BankingServiceImpl;

public class BankingClient {
	private BankingService bService;

	public BankingClient() {
		bService = new BankingServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to banking system");
		System.out.println("Enter Login");
		String login=scan.nextLine();
		System.out.println("Enter password");
		String password=scan.nextLine();
		boolean loginSuccess=bService.authenticate(login,password);
		if(loginSuccess) {
			
		
		while (true) {
			choice = getChoice(scan);
			switch (choice) {
			case 1:
				System.out.println("DEPOSIT AMOUNT");
				System.out.println("Enter Amount to be deposited");

				try {
					double amount = scan.nextDouble();
					bService.depositAmount(amount);
				} catch (BankingException e) {
					System.err.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("Enter numbersd only");
				}
				break;
			case 2:
				System.out.println("WITHDRAW AMOUNT");
				System.out.println("Enter amount to be withdrawn");

				double amountWithdrawn = 0;
				try {
					double amount = scan.nextDouble();
					amountWithdrawn = bService.getAmount(amount);
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("Enter numbersd only");
				}
				System.out.println("Withdrawn: " + amountWithdrawn);
				break;
			case 3:
				System.out.println("CHECK BALANCE");
				double balance = bService.getBalance();
				System.out.println("Balance: " + balance);
				break;
			case 4:
				System.out.println("Exiting... Thank you.");
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}
	}
	else {
		System.out.println("Either login or password is wrong");
	}
	}
	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("BANKING SYSTEM");
		System.out.println("1. Deposit amount");
		System.out.println("2. Withdraw amount");
		System.out.println("3. Check balance");
		System.out.println("4. Quit program");
		System.out.println("Enter a choice 1 to 4");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Please enter numbers only");
			scan.nextLine();
		}
		return choice;
	}

	public static void main(String[] args) {
		new BankingClient();
	}
}