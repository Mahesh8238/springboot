package com.jsp.student.service;

import java.util.List;

import com.jsp.student.entities.Student;

public interface StudentService {

	
	public Student insert(Student student);
	public Student getStudent(Integer id);
	public List<Student> getAllStudents();
	public String delete(Integer id);
	public Student update(Student student);
	
}
