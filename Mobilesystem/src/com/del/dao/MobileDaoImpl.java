package com.del.dao;

import com.del.exception.MobileException;
import com.del.util.Message;

public class MobileDaoImpl implements MobileDao {
	
	private double balance;
    private double PendingAmount=500;
    private double paymentMade =0;
    private String login="9903584913";
    private String password="del123";
  
    @Override
    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && 
                this.password.equals(password);
    }
	@Override
	public String getMobile() {
		return login;
	}
	@Override
	public double showPendingAmount() {
		System.out.println(PendingAmount);
		return PendingAmount;
	}
	@Override
	public double pay(double payment) {
		paymentMade = payment;
		if(payment>PendingAmount)
		{
			System.out.println("Amount entered by you exceeds pending amount.");
			return PendingAmount;
		}
		else
		{
		PendingAmount-=payment;
		return PendingAmount;
		}
	}
	@Override
	public void getDetails() {
	System.out.println("User details are as follows: ");
	System.out.println("Mobile Number: "+login);
	System.out.println("Pending Amount: "+ PendingAmount);
	System.out.println("Payment made: " + paymentMade);
	}
 
}


	
	
	

