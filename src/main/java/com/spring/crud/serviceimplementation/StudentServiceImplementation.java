package com.spring.crud.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.StudentRepository;
import com.spring.crud.model.Student;
import com.spring.crud.serviceinterface.StudentInterface;

@Service
public class StudentServiceImplementation implements StudentInterface {
	@Autowired
	private StudentRepository studentRepo;
	

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);;
		
		
	}
	
	
	
}
