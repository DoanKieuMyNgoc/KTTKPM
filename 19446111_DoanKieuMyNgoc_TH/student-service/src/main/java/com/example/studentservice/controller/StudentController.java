package com.example.studentservice.controller;

import java.util.List;


import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;
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
@RequestMapping("/api/student")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public  List<Student> geetList(){
        List<Student> students= studentService.getListStudent();
        return students;
    }

    @PostMapping("")
    public Student addCustomer(@RequestBody Student student) {
        studentService.addStudent(student);
        return student;
    }
}
