package com.example.LoginService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.example.LoginService.model.User;

@SpringBootApplication
public class LoginServiceApplication {
	private static final String URL = "http://localhost:8080/api/";
	private static final String URLADD = "http://localhost:8080/api/users";

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL, String.class);
		System.out.println(result);
		
		
		User subject= new User( "username", "123456", "");
		restTemplate.postForEntity(URLADD, subject, User.class);
		System.out.println(URLADD);
	}

}
