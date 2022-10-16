package com.example.Tuan7.post;

import com.example.Tuan7.modal.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Post_postForEntity_Example {
	static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/employee";

	public static void main(String[] args) {
		Employee newEmployee = new Employee("E11", "Tom", "Cleck");

		RestTemplate restTemplate = new RestTemplate();

		// Dữ liệu đính kèm theo yêu cầu.
		HttpEntity<Employee> requestBody = new HttpEntity<>(newEmployee);

		// Gửi yêu cầu với phương thức POST.
		ResponseEntity<Employee> result = restTemplate.postForEntity(URL_CREATE_EMPLOYEE, requestBody, Employee.class);

		System.out.println("Status code:" + result.getStatusCode());

		// Code = 200.
		if (result.getStatusCode() == HttpStatus.OK) {
			Employee e = result.getBody();
			System.out.println("(Client Side) Employee Created: " + e.getEmpNo());
		}

	}

}
