package com.del;

public class CreateObject {
	
	public static void main(String[] args) {
		Dept d=new Dept(1212,"IT","Bangalore");
		Emp e=new Emp(1234,"Tarun",9012341234L,d);
		System.out.println(e);
		Emp e1=null;
		try
		{
			 e1=(Emp)e.clone();
		
		System.out.println(e1);
		System.out.println("Same : "+ (e==e1));
		}
		catch(CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		//e=null;
		//System.gc(); shallow cloning- objects inside an object are cloned
		e1.getDept().setLocation("Mumbai");
		e1.setMobile(9012121212L);
		System.out.println(e);//deep cloning- all the objects are cloned
		System.out.println("End of program");
	}

}
