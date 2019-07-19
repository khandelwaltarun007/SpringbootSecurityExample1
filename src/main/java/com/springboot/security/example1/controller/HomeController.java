package com.springboot.security.example1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is the Home Controller
 * @author tarkhand
 *
 */
@Controller
public class HomeController {

	/**
	 * This controller calls home page
	 * @return String
	 */
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	/**
	 *  This controller calls custom login page
	 * @return String
	 */
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
	
	/**
	 * This controller calls custom logout page
	 * @return String
	 */
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}
}
