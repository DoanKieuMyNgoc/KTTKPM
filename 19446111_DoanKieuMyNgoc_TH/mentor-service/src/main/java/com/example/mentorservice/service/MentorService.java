package com.example.mentorservice.service;

import com.example.mentorservice.model.Mentor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MentorService {
    public Mentor addMentor(Mentor mentor);

    public String deleteMentor(int id);

    public Mentor updateMentor(Mentor student);

    public Mentor getMentorById(int id);

    public List<Mentor> getListMentor();
}
