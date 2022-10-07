package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.model.Student;
import com.spring.crud.serviceimplementation.StudentServiceImplementation;

@RestController

@CrossOrigin("*")
public class HomeController {

	@Autowired
	private StudentServiceImplementation studentServiceImple;
	
	@PostMapping(value="saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Successfully save!!");
		studentServiceImple.saveStudent(student);
		return student;
	}
	
	
	@GetMapping(value = "getAllStudent")
	public List<Student> findAllStudent(){
		return studentServiceImple.findAllStudents();
	}
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		//System.out.println("Successfully update!!");
		studentServiceImple.updateStudent(student);
		return student;
	}
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		//System.out.println("Successfully update!!");
		studentServiceImple.deleteStudent(id);
		return "Successfully Deleted!!";
	}
}
