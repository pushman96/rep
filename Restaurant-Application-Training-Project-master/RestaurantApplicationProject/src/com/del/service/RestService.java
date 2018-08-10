package com.del.service;

import java.util.List;

import com.del.bean.Login;
import com.del.bean.NonVegMenu;
import com.del.bean.NonVegSelected;
import com.del.bean.VegMenu;

public interface RestService {

	boolean checklogin(Login login);

	boolean register(Login login);

	List<VegMenu> getVegMenu();
	
	List<NonVegMenu> getNonVegMenu();

	boolean updateQuantity(NonVegSelected nonveg);
}
