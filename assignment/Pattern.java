package com.del;

public class Pattern {
	
	public static void main(String[] args) {
		
	
		int n=9;
int k =2*n-2;

		{
	for (int i=0;i<n/2;i++)
	{
		 for (int j=0; j<k; j++)
         {
             // printing spaces
             System.out.print(" ");
         }
		 k=k-1;
			for( int j=0;j<i;j++)
			{
				
		System.out.print(" *");
	}
			System.out.println();
}
	for (int i=n/2;i<n;i=i+2)
		{
			 for (int j=0; j<k; j++)
	         {
	             // printing spaces
	             System.out.print(" ");
	         }
			 k=k-1;
				for( int j=0;j<i;j++)
				{
					
			System.out.print("*");
			System.out.print(" ");
		}
				System.out.print("*");
				System.out.println();
	}
	}
	}
	}