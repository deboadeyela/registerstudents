/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.deboadeyela.registerstudents;

/**
 *
 * @author gbadebo
 */
import java.util.ArrayList;

public class CourseModule {
	private String name;
	private String id;
	private ArrayList<Student> enrolledStudents;
	
	public Module(String name, String id) {
		this.name = name;
		this.id = id;
		this.enrolledStudents = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public ArrayList<Student> getStudents() {
		return enrolledStudents;
	}
	
	public void addStudents(ArrayList<Student> enrolledStudents) {
		this.enrolledStudents.addAll(enrolledStudents);
	}
}
