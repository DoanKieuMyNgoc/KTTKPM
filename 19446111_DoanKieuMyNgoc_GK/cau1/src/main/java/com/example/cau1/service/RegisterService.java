package com.example.cau1.service;

import java.util.List;

import com.example.cau1.entity.User;

public interface RegisterService {
	public void addUser(User user) ;
	public List<User> getAllUser();
	

}
