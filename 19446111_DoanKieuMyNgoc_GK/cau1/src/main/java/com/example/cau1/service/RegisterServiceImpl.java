package com.example.cau1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cau1.entity.User;
import com.example.cau1.repository.UserRepository;
@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private UserRepository repository;

	@Transactional
	@Override
	public void addUser(User user) {
		repository.save(user);
		
	}
	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}

}
