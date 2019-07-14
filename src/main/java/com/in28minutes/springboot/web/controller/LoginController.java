package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	
	//LoginService service = new LoginService();
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(ModelMap model, @RequestParam String name ,@RequestParam String password) {
    	
    	boolean isValidUser = service.validateUser(name, password);
    	
    	if (!isValidUser) {
    		model.put("errorMessage", "Invalid Credentials");
    		return "login";
    	}
    		
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
	
	/*
	@RequestMapping("/login")
	public String loginMessage(@RequestParam String name, ModelMap model){
		model.put("name", name);
		return "login";
	}
	*/
	
	/* display text in response body * 
	@RequestMapping("/login")
	@ResponseBody
	public String loginMessage(){
		return "Hello World";
	}
	*/
	
}
