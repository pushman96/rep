package com.del.mvc;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.del.bean.Login;
import com.del.bean.NonVegMenu;
import com.del.bean.NonVegSelected;
import com.del.bean.VegMenu;
// import com.del.dao.MyDao;
import com.del.service.RestService;



@Controller
public class MyController {
	@Autowired
	private RestService rService;

	@RequestMapping(value = "/home")
	public String goHome() {
		// System.out.println("Go to home"); // console
		return "home";
	}

	@RequestMapping(value = "/loginExisting")
	public String loginExisting(Model model) {
		// System.out.println("loginExisting"); // console
		model.addAttribute("login", new Login()); // model is instantiated by spring and injected to your method
													// (binding path)
		return "login";
	}

	@RequestMapping(value = "/checkLogin")
	public String checkLogin(@ModelAttribute(value = "login") Login login, Model model) {
		// System.out.println("checking login");
		// System.out.println(login);
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("spring-servlet.xml");

		boolean success = rService.checklogin(login);
		if (success) {
			// System.out.println("SUCCESS!");
			return "success";
		} else {
			// System.out.println("Failed!");
			return "fail";
		}
	}

	@RequestMapping(value = "/register")
	public String register(Model model) {
		// System.out.println("register"); // console
		model.addAttribute("register", new Login()); // model is instantiated by spring and injected to your method
		return "register";
	}

	@RequestMapping(value = "/confirmReg")
	public String confirmReg(@ModelAttribute(value = "register") Login newlogin, Model model) {
		// System.out.println("checking registration");
		// System.out.println(newlogin);
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("spring-servlet.xml");

		boolean success = rService.register(newlogin);
		if (success) {
			// System.out.println("REG SUCCESS!");
			return "regSuccess";
		} else {
			// System.out.println("REG FAILED!");
			return "fail";
		}
	}

	@RequestMapping(value = "/vegmenu")
	public String vegMenu(Model model) {
		
		List<VegMenu> vegList = rService.getVegMenu();
		System.out.println("Reached controller /vegmenu");
		System.out.println(vegList);
		model.addAttribute("veg",vegList);
		return "vegmenu";
	}
	

	@RequestMapping(value = "/nonvegmenu")
	public String nonvegMenu(Model model) {
		List<NonVegMenu> nonvegList = rService.getNonVegMenu();
		System.out.println("Reached controller /nonvegmenu");
		System.out.println(nonvegList);
		model.addAttribute("veg",nonvegList);
		model.addAttribute("billing", new NonVegMenu());
		return "nonvegmenu";
	}
	
	@RequestMapping(value = "/bill")
	public String invoice(@ModelAttribute(value = "billing") NonVegMenu nonveg, Model model) {
		
		System.out.println("invoice");
		
        System.out.println("Quantity checker: " + nonveg);
//		
//		boolean success = rService.updateQuantity(nonveg);
//		if(success)
//		{
//			System.out.println("Success");
//		}
//		else
//		{
//			System.out.println("Failed.");
//		}
		return "bill";
	}

	public RestService getrService() {
		return rService;
	}

	public void setrService(RestService rService) {
		this.rService = rService;
	}

}
