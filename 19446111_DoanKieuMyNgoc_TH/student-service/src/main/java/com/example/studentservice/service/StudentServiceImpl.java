package com.example.studentservice.service;

import com.example.studentservice.model.Student;
import com.example.studentservice.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;

    @Override
    @Transactional
    public Student addStudent( Student student) {
        return repository.save(student);
    }

    @Override
    public String deleteStudent(int id) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getListStudent() {
        List<Student> dsStudents = repository.findAll();
        return dsStudents;
    }
}
