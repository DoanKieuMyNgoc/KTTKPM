package com.example.mentorservice.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name ="t_mentor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MentorId;
    private String Name;
    private String Address;
}
