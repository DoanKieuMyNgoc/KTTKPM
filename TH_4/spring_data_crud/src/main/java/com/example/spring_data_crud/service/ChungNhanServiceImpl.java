package com.example.spring_data_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_data_crud.respository.ChungNhanRespository;
@Service
public class ChungNhanServiceImpl implements ChungNhanService{

	@Autowired
	private ChungNhanRespository chungNhanRespository;
	@Override
	public List<String> findByBoeing() {
		// TODO Auto-generated method stub
		return chungNhanRespository.findByBoeing();
	}

}
