package lol;

import java.util.Scanner;

public class Prime {
	
	    static boolean prime(int n)
	    {
	        
	        if (n <= 1)
	            return false;
	      
	        
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	      
	        return true;
	    }
	     
	   
	    public static void main(String[] args) 
	    {
	    	Prime a=new Prime();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number to be checked ");
			int p=scan.nextInt();
	         if(prime(p)) 
	         System.out.println("it's a prime number") ;
	         
	         else
	         System.out.println("it's not a prime number");
	          
	    }
	}

