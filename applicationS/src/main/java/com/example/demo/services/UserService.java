package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User register(User user) {
		return userRepository.save(user);
		
	}
	
	public String login(User user) {
		userRepository.findByPasswordAndEmail(user.getpassword(), user.getEmail());
		return "Welcome";
		
	}

}
