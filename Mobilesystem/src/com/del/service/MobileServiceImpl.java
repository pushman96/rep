package com.del.service;

import com.del.dao.MobileDao;
import com.del.dao.MobileDaoImpl;
import com.del.exception.MobileException;
import com.del.util.Message;

public class MobileServiceImpl implements MobileService {
	
	private MobileDaoImpl mDao;
    
    public MobileServiceImpl() {
    mDao = new MobileDaoImpl();
    }
    @Override
    public void depositAmount(double amount)throws MobileException {
    	
        isAmountNegative(amount);
        mDao.depositAmount(amount);
    }
    @Override
    public double getAmount(double amount) throws MobileException {
        isAmountNegative(amount);
        return mDao.getAmount(amount);
    }
    private boolean isAmountNegative(double amount)
                 throws MobileException {
        if(amount<0) {
            throw new MobileException(Message.NEGATIVE_VALUE);
        }
        return true;
    }
    @Override
    public boolean authenticate(String login, String password) {
        return mDao.authenticate(login,password);
    }
	@Override
	public String getMobile() {	
		return mDao.getMobile();
	}
	@Override
	public double showPendingAmount() {
		return mDao.showPendingAmount();
		
	}
	@Override
	public double pay(double payment) {
		return mDao.pay(payment);
		
	}
	@Override
	public void getDetails() {
		mDao.getDetails();
	}

}
