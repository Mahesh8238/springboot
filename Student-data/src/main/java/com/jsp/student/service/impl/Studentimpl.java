package com.jsp.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.student.entities.Student;
import com.jsp.student.repo.StudentRepo;
import com.jsp.student.service.StudentService;
@Service
public class Studentimpl implements StudentService{
    @Autowired
	private StudentRepo  studentRepo;
	
	@Override
	public Student insert(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student) ;
	}

	@Override
	public Student getStudent(Integer id) {
		return studentRepo.findById(id).get();
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		studentRepo.deleteById(id);
		return "Student deleted";
	}

	@Override
	public Student update(Student student) {
		return studentRepo.save(student);
	}
	

}
