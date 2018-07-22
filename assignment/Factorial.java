package lol;

import java.util.Scanner;

public class Factorial {

		public int fact(int x)
		{
		int i,fac=1;
		//It is the number to calculate factorial.
		for(i=1;i<=x;i++){
		fac=fac*i;
		}
		return fac;
		}
		
		
		public static void main(String args[]){
			
			Factorial a=new Factorial();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the value for which the factorial is to be calculated");

			int f=scan.nextInt();
			System.out.println("The factorial of "+f+" is : "+a.fact(f));
			
			
		}
}
