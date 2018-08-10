package com.del.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.bean.Login;
import com.del.bean.NonVegMenu;
import com.del.bean.NonVegSelected;
import com.del.bean.VegMenu;
import com.del.dao.RestDao;

@Service("rService")
public class RestServiceImpl implements RestService {
	
	@Autowired
	private RestDao rDao;

	@Override
	public boolean checklogin(Login login) {
		
		return rDao.checklogin(login);
	}
	
	@Override
	public boolean register(Login login) {
		return rDao.register(login);
	}
	
	@Override
	public List<VegMenu> getVegMenu() {
		return rDao.getVegMenu();
	}
	
	@Override
	public boolean updateQuantity(NonVegSelected nonveg) {
		return rDao.updateQuantity(nonveg);
	}


	
	
	
	
	
	public RestDao getrDao() {
		return rDao;
	}

	public void setrDao(RestDao rDao) {
		this.rDao = rDao;
	}

	@Override
	public List<NonVegMenu> getNonVegMenu() {
		return rDao.getNonVegMenu();
	}


	
	


}
