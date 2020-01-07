package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.DummyService;
import com.in28minutes.springboot.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	DummyService dummyService;

	// Injection Automatically
	@Autowired
	LoginService service;
	// LoginService service = new LoginService();

	@GetMapping("/login")
	/* @RequestMapping(value = "/login", method = RequestMethod.GET) */
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@PostMapping("/login")
	/* @RequestMapping(value = "/login", method = RequestMethod.POST) */
	public String handleLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {

		boolean isValidUser = service.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

}
