package com.del.service;

import com.del.exception.BankingException;

public interface BankingService {

	void depositAmount(double amount) throws BankingException;

	double getAmount(double amount) throws BankingException;

	double getBalance();

	boolean authenticate(String login, String password);

	

	

}
