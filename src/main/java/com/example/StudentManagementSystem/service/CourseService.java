package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.entity.Course;
import com.example.StudentManagementSystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(String courseId, String courseName) {
        Course course = new Course(courseId,courseName);
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
