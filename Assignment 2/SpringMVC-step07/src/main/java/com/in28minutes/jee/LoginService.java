package com.in28minutes.jee;

public class LoginService {
	public boolean validateUser(String user, String password  ) {
		return user.equalsIgnoreCase("hmnshu") && password.equals("12345");
		
	}

}