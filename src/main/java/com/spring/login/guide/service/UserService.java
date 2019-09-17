package com.spring.login.guide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.login.guide.models.User;
import com.spring.login.guide.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User findUser(String username) {
		List<User> userList = userRepository.findAll();
		for(User user : userList) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	} 
}
