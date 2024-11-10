package com.springboot.app01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String studentName;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student(int id, String studentName, String email, String password) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.email = email;
		this.password = password;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", email=" + email + ", password=" + password
				+ "]";
	}
	
}
