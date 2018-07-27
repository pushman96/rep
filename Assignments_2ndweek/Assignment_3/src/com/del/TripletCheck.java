package com.del;

import java.util.Scanner;
public class TripletCheck {
 
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int[] elements= new int[size];
			for(int j=0;j<size;j++){
				elements[j]=sc.nextInt();
			}
			UserMainCode obj=new UserMainCode();
			obj.checkTripplets(elements);		
		}

	}

