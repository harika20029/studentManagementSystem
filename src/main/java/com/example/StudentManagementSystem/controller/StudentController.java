package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.service.EnrollmentService;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private EnrollmentService enrollmentService;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestParam String name, @RequestParam int age, @RequestParam double feeBalance) {
        return studentService.addStudent(name, age, feeBalance);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping("/enrollment/{studentId}")
    public Student enrollStudent(@PathVariable long studentId, @RequestParam String courseName) {
        return enrollmentService.enrollStudentInCourse(studentId, courseName);
    }
}
