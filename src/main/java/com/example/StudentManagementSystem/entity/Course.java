package com.example.StudentManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data

public class Course {

    @Id
    private String courseId;

    private String courseName;
    public Course() {
    	
    }
    public Course(String courseId, String courseName){
    	  this.courseId = courseId;
    	  this.courseName = courseName;
    	}
}
