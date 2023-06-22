package com.jsp.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.person.models.Person;
import com.jsp.student.entities.Student;
import com.jsp.student.service.StudentService;
@RestController
@RequestMapping("/api/")
public class StudentController {
	
	@Autowired
	
	private StudentService studentService;
	@PostMapping("/insert")
	public ResponseEntity<Student> insert(@RequestBody Student student)
	{
		Student s1=studentService.insert(student);
		return new ResponseEntity<Student>(s1,HttpStatus.CREATED);
		
		
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id)
	{
		return new ResponseEntity<Student>(studentService.getStudent(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id)
	{
		return new ResponseEntity<String>(studentService.delete(id),HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Student> update(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.update(student),HttpStatus.OK);
	}
	 @GetMapping("/all")
     public ResponseEntity<List<Student>> getAllStudents()
     {
    	 return  new ResponseEntity<List<Student>>(studentService.getAllStudents(),HttpStatus.OK);
     }

	
	
	

}
