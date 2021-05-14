package com.example.two.SpringRestLogin.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.two.SpringRestLogin.entity.User;

@Service
public class ServiceUserImpl implements UserService {

	List<User> users;

	public ServiceUserImpl() {
		users = new ArrayList<>();
		users.add(new User("Aman", "pass"));
		users.add(new User("abhay", "pass"));
		users.add(new User("somnam", "pass"));
		users.add(new User("sreerag", "pass"));
		
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
