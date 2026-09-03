package com.example.StudentManagmentSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagmentSystem.entity.Student;
import com.example.StudentManagmentSystem.repository.Studentrepository;
import com.example.StudentManagmentSystem.service.StudentService;

@Service
public class serviceImpl implements StudentService {

    @Autowired
    private Studentrepository studentRepository;

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    public Optional<Student> getByID(int id) {

        return studentRepository.findById(id);
    }

    @Override
    public Student getStudentById(int id) {

        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student) {

        Student existingStudent =
                studentRepository.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setEmail(student.getEmail());

            return studentRepository.save(existingStudent);
        }

        return null;
    }

    @Override
    public void deleteStudentById(int id) {

        studentRepository.deleteById(id);
    }
}