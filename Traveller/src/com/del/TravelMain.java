package com.del;

import java.util.Scanner;
public class TravelMain {
	
	public static void main(String[] args) {
		/*System.out.println("My first eclipse prog");
		Vehicle v=new Car(5,"Honda",1000000);
		System.out.println(v);
		Movable m=new Bus();
		m.move();*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vehicle type");
		String type = scan.nextLine();
		Movable myMovable=MovableFactory.getInstace(type);
		if(myMovable!=null)
			myMovable.move();
		else
			System.out.println(type+" Not Found");
		
	
	}

}
