package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

//Spring Bean
@Component
public class LoginService {
	
	public boolean validateUser(String userId,String password) {
		return userId.equalsIgnoreCase("in28Minutes") && password.equals("1234");
	}
}
