package com.example.StudentManagementSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;

    private double feeBalance;
    public Student() {
    	
    }
    public Student(String name,int age,double feeBalance){
    	this.name=name;
    	this.age=age;
    	this.feeBalance=feeBalance;
    }

    @ElementCollection
    private List<String> courses = new ArrayList<>();
	public List<String> getCourses() {
		
		return courses;
	}
	public String getName() {
		
		return this.name;
	}
	public int getAge() {
		
		return this.age;
	}
	public double getFeeBalance() {
		
		return this.feeBalance;
	}
}