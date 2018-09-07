package coid.bca.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import coid.bca.dao.UserDao;

@Controller
public class HomeController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping("/login")
	public String getNumber(Locale locale) {
		System.out.println(userDao.getAll() + locale);
		return "login";
	}
	
	@GetMapping("/dashboard")
	public String viewDashboard() {
		return "dashboard";
	}
}
