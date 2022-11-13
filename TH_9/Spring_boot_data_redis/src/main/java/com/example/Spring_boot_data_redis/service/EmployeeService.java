package com.example.Spring_boot_data_redis.service;

import java.util.List;
import java.util.Map;

import com.example.Spring_boot_data_redis.dto.Employee;

public interface EmployeeService {

	void save(Employee employee);

	void update(Employee employee);

	void delete(Long id);

	Employee findById(Long id);

	List<Employee> getAllEmployees(String key);

	List<Employee> findEmployeeById(List<Long> id);

	Map<Long, Employee> getAll();
}