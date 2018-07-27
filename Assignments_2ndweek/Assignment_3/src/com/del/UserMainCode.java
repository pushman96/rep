package com.del;

public class UserMainCode extends TripletCheck {

	public static boolean checkTripplets(int elements[]) {
		int d=1;
		for(int k=0;k<elements.length;k++) {
			if(k<elements.length-1) {
			if(elements[k]==elements[k+1]) {
				d=d+1;
			}
		}
		}
			if(d>=3) {
				System.out.println("TRUE");
				return true;
			}
			else {
				System.out.println("FALSE");
				return false;
			}
		}
		
		
	}

		
		
	

