package com.del.service;

import com.del.exception.MobileException;

public interface MobileService {

	void depositAmount(double amount) throws MobileException;
	 
    double getAmount(double amount) throws MobileException;
 
    boolean authenticate(String login, String password);

    String getMobile();

    double showPendingAmount();

	double pay(double payment);

	void getDetails();
 

}
