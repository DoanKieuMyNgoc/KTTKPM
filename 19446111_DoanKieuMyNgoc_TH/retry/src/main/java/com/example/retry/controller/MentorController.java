package com.example.retry.controller;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class MentorController {

    private static final String MENTOR_SERVICE="mentorService";

    @Autowired
    private RestTemplate template;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    //	retry
    private int attempts = 1;
    private static final Logger logger = LoggerFactory.getLogger(MentorController.class);

    @GetMapping("/apo/mentor")

    @Retry(name = MENTOR_SERVICE, fallbackMethod = "fallback_retry")
    public ResponseEntity<String> createOrder() {
        logger.info("item service call attempted:::" + attempts++);
        String response = template.getForObject("http://localhost:8082/api/mentor", String.class);
        logger.info("item service called");
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
    public ResponseEntity<String> fallback_retry(Exception e) {
        attempts = 1;
        return new ResponseEntity<String>("Item service is down", HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
