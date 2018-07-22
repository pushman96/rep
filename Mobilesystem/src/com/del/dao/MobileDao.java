package com.del.dao;

import com.del.exception.MobileException;

public interface MobileDao {


    boolean authenticate(String login, String password);

	String getMobile();

	double showPendingAmount();

	double pay(double payment);

	void getDetails();

}


