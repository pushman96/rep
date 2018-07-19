package com.del.dao;

import com.del.exception.BankingException;
import com.del.util.Message;

public class BankingDaoImpl implements BankingDao {

	private double balance;
	private double minBalance=1000;
	private String login="Deloitte";
	private String password="112233";
	@Override
	public void depositAmount(double amount) {
		// TODO Auto-generated method stub
		balance +=amount;

	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	@Override
	public double getAmount(double amount) throws BankingException {
		// TODO Auto-generated method stub
		double bal=balance-amount;
		if(bal<minBalance)
		{
			throw new BankingException(Message.LOW_BALANCE);
			}
		else
		{
			balance=bal;
		}
		return amount;
		}
	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return this.login.equals(login)&& this.password.equals(password);
	}

}
