package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private StudentService studentService;

    public Student enrollStudentInCourse(String studentId, String courseName) {
        Student student = studentService.getStudent(studentId);
        student.getCourses().add(courseName);
        return studentService.addStudent(student.getName(), student.getAge(), student.getFeeBalance());
    }
}
