package com.del.assignment;



public class PrimeSquare {
	public static void main(String[] args) {
		
		for(int i=2;i<30;i++) {
			int flag=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=0;
					break;
					
				}
			}
				if(flag==1)
				{
					System.out.println("Square of prime number "+i+" is "+i*i);
					
					
				
			}
		}
	
			
		}
}
	


