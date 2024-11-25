package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    public Student enrollStudentInCourse(long studentId, String courseName) {
        Student student = studentService.getStudent(studentId);
        student.getCourses().add(courseName);
        return studentRepository.save(student);
    }
}
