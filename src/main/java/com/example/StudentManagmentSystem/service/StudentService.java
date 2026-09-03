package com.example.StudentManagmentSystem.service;

import java.util.List;
import com.example.StudentManagmentSystem.entity.Student;

public interface StudentService {
    
    List<Student> getAllStudents();
    
    Student saveStudent(Student student);
    
    // 🔹 For Edit
    Student getStudentById(int id);
    
    // 🔹 For Delete
    void deleteStudentById(int id);
    
    
}
