package com.example.studentservice.service;

import com.example.studentservice.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public Student addStudent(Student customer);

    public String deleteStudent(int id);

    public Student updateStudent(Student student);

    public Student getStudentById(int id);

    public List<Student> getListStudent();
}
