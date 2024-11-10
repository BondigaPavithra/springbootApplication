package com.springboot.app01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.app01.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
