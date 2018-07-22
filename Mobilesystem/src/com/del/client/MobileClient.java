package com.del.client;


import java.util.InputMismatchException;
import java.util.Scanner;
 
import com.del.exception.MobileException;
import com.del.service.MobileService;
import com.del.service.MobileServiceImpl;

public class MobileClient {
	
	private MobileService mService;
	
		public MobileClient(){
			mService=new MobileServiceImpl();
					Scanner scan = new Scanner(System.in);
			int choice = 0;
			System.out.println("Welcome to Mobile system");
			System.out.println("Enter Login mobile number");
			String login=scan.nextLine();
			System.out.println("Enter password");
			String password=scan.nextLine();
			boolean loginSuccess= mService.authenticate(login,password);
			
			if (loginSuccess) {
	            while (true) {
	                choice = getChoice(scan);
	                switch (choice) {
	                case 1:
	                    System.out.println("SHOW PENDING AMOUNT");
	                    double pending = mService.showPendingAmount();
	                    break;
	                case 2:
	                    System.out.println("PAY PENDING AMOUNT");
	                    try {
	                       System.out.println("Enter amount to pay: ");
	                       double payment = scan.nextDouble(); 
	                       System.out.println(mService.pay(payment));                    
	                    } catch (InputMismatchException e) {
	                        System.err.println("Enter number only");
	                        scan.nextLine();
	                    }
	                    break;
	                case 3:
	                    System.out.println("SHOW DETAILS");
	                    mService.getDetails();
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
		        System.out.println("MOBILE SYSTEM PAYMENT DETAILS");
		        System.out.println(mService.getMobile());
		        System.out.println("1. Show Pending Amount");
		        System.out.println("2. Pay pending amount");
		        System.out.println("3. Show Details");
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
		        new MobileClient();
		    }
		}

			

	



