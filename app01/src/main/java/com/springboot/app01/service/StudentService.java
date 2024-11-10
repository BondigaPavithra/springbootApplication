package com.springboot.app01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app01.model.Student;
import com.springboot.app01.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		Student s=studentRepository.findById(id).get();
		studentRepository.delete(s);
		
		
	}

	@Override
	public Student getStudentById(int id) {
		Student std=studentRepository.findById(id).get();
		return std;
	}
}
