package com.example.Spring_boot_data_redis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
	private static final long serialVersionUID = 4112198546343192807L;

	private Long id;
	@JsonProperty("employee_id")
	private String employeeId;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private String gender;
	@JsonProperty("work_dept")
	private String workDept;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWorkDept() {
		return workDept;
	}
	public void setWorkDept(String workDept) {
		this.workDept = workDept;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Employee(Long id, String employeeId, String firstName, String lastName, String gender, String workDept) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.workDept = workDept;
	}
	public Employee() {
		super();
	}
	public Employee(Long id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", workDept=" + workDept + "]";
	}
	
}
