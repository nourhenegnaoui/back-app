package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping({"/user"})
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(value = { "/register" })
	public User register(@RequestBody User user) {
		userService.register(user);
		return user;
	}
	@PostMapping(value={"/login"})
	public String login(@RequestBody User user) {
		userService.login(user);
		return "Welcome !!!";
	}

}
