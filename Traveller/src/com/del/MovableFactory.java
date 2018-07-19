package com.del;
//Design pattern called factory pattern
public class MovableFactory {
	//Factory method
	public static Movable getInstace(String type) {
		if("car".equals(type))
		{
			return new Car();
		}
		else if("bus".equals(type)) {
			return new Bus();
		}
		return new Movable() {

			@Override
			public void move() {
				// TODO Auto-generated method stub
				System.out.println("Anon vehicle is moving");
			}
			
		};
		
	}
	private static class Unknown implements Movable{

		@Override
		public void move() {
			// TODO Auto-generated method stub
			System.out.println("Unknown vehicle moves");
			
		}
		
		
		
	}
}
