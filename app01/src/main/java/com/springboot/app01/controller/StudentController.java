package com.springboot.app01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.app01.model.Student;
import com.springboot.app01.service.StudentService;


@Controller
@RequestMapping
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String getStudents(Model model){
		 List<Student> students=studentService.getAllStudent();
		 model.addAttribute("students",students);
		 return "list";
	}
	
	@GetMapping("/getIndex")
	public String getdetails(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}
	@PostMapping("/create")
	public String insert(@ModelAttribute Student student) {
		 studentService.createStudent(student);
		 return "index";
	}
	
	
	@GetMapping("/update/{id}")
	public String detStudentForupdate(@PathVariable int id, Model model) {
		
		Student std= studentService.getStudentById(id);
		model.addAttribute(std);
		return "update";
	}
	@PostMapping("/updateStudent")
	public String Update(@ModelAttribute Student student,Model model) {
		
		studentService.updateStudent(student);
		List<Student> students=studentService.getAllStudent();
		 model.addAttribute("students",students);
		return "list";
	}
	
	@GetMapping("/delete/{id}")
	public String deleting(@PathVariable int id,Model model) {
		studentService.deleteStudentById(id);
		 List<Student> students=studentService.getAllStudent();
		 model.addAttribute("students",students);
		 return "list";
	}
	
	

}
