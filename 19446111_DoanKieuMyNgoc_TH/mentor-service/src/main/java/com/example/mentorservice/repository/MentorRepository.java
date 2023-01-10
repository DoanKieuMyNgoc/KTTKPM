package com.example.mentorservice.repository;

import com.example.mentorservice.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor,Integer> {
}
