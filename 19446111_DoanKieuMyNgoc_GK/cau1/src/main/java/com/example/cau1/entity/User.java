package com.example.cau1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String passWord;
	private String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int userId, String userName, String passWord, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
	}
	public User() {
		super();
	}
	public User(String userName, String passWord, String email) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
	}
	

}
