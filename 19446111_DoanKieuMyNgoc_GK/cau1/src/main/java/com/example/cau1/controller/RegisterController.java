package com.example.cau1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cau1.entity.User;
import com.example.cau1.service.RegisterService;

@RestController
@RequestMapping("/api")
public class RegisterController {
	@Autowired
	private RegisterService service;
	
	@PostMapping("/users")
	public User addUser(@RequestBody  User user) {
		service.addUser(user);
		return user;
	}
	@GetMapping("/")
	public List<User> findAll() {
		return service.getAllUser();
		
	}

}
