package com.example.mentorservice.service;

import com.example.mentorservice.model.Mentor;
import com.example.mentorservice.repository.MentorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService{
    @Autowired
    private MentorRepository repository;
    @Override
    @Transactional
    public Mentor addMentor(Mentor mentor) {
        return repository.save(mentor);
    }

    @Override
    public String deleteMentor(int id) {
        return null;
    }

    @Override
    public Mentor updateMentor(Mentor student) {
        return null;
    }

    @Override
    public Mentor getMentorById(int id) {
        return null;
    }

    @Override
    public List<Mentor> getListMentor() {
        List<Mentor> mentors= repository.findAll();
        return mentors;
    }
}
