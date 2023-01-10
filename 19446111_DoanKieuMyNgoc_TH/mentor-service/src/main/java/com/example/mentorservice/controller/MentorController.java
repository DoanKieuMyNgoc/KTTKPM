package com.example.mentorservice.controller;

import java.util.List;


import com.example.mentorservice.model.Mentor;
import com.example.mentorservice.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/mentor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    @GetMapping("")
    public  List<Mentor> geetList(){
        List<Mentor> mentors= mentorService.getListMentor();
        return mentors;
    }
    @PostMapping("")
    public Mentor addCustomer(@RequestBody Mentor mentor) {
        mentorService.addMentor(mentor);
        return mentor;
    }
}
