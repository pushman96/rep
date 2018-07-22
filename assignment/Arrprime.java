package lol;

import java.util.Scanner;

public class Arrprime {
	
	public int prime(int arr[],int n)
    {
		int sum=0;
		int num=0;
		
          for (int i=2;i< n;i++)
          {
        	  int c=1;
        	  for(int j=2;j<=i/2;j++)
        	  {
            if (i % j == 0)
            {
            	c=0;
            	break;
            }
        	  }
          
          if(c==1)
          {
        	  
            
            	sum=sum+arr[i];
            	
            	
            
          }
          }
		
		return sum;}
      
       
     
   
    public static void main(String[] args) 
    {
    	int as[]=new int[100];
    	Arrprime a=new Arrprime();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int p=scan.nextInt();
		System.out.println("Enter the numbers ");
		for(int l=0;l<p;l++)
		{
			as[l]=scan.nextInt();
		}
		System.out.println("The sum of the numbers present in the array prime locations is : "+a.prime(as, p));
         
    }
}


