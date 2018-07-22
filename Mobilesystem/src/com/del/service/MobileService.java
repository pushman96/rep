package com.del.service;

import com.del.exception.MobileException;

public interface MobileService {


 
    boolean authenticate(String login, String password);

    String getMobile();

    double showPendingAmount();

	double pay(double payment);

	void getDetails();
 

}
