package com.example.spring_data_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_data_crud.service.ChungNhanService;

@RestController
@RequestMapping("/chungnhan")
public class ChungNhanController {
	@Autowired
	private ChungNhanService chungNhanService;
	
//	9. Cho biết mã số của các phi công lái máy báy Boeing
	 @GetMapping("/findByBoeing")
	    public List<String> findByBoeing() {
	    	return chungNhanService.findByBoeing();
	    }
}
