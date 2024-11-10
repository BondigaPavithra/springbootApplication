package com.springboot.app01.service;

import java.util.List;

import com.springboot.app01.model.Student;

public interface StudentServiceInterface {
	
	public Student createStudent(Student student);
	public List<Student> getAllStudent();
	public Student  updateStudent(Student student);
	public void deleteStudentById(int id);
	public Student getStudentById(int id);
}
