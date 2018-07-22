package com.del.dao;

import com.del.exception.MobileException;

public interface MobileDao {


	void depositAmount(double amount);
 
    double getAmount(double amount) throws MobileException;
 
    boolean authenticate(String login, String password);

	String getMobile();

	double showPendingAmount();

	double pay(double payment);

	void getDetails();

}


