package com.jsp.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.student.entities.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
