package com.spring.crud.serviceinterface;

import java.util.List;

import com.spring.crud.model.Student;

public interface StudentInterface {

	public Student saveStudent(Student student);

	public Student updateStudent(Student student);

	public List<Student> findAllStudents();
	
	public void deleteStudent(int id);

}
