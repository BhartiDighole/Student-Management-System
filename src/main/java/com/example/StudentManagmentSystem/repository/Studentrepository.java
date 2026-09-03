package com.example.StudentManagmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagmentSystem.entity.Student;

public interface Studentrepository  extends JpaRepository<Student, Integer> {
	
	

}
