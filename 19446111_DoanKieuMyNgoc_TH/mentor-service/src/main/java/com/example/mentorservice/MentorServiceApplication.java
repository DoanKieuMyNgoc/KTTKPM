package com.example.mentorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MentorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MentorServiceApplication.class, args);
    }

}
