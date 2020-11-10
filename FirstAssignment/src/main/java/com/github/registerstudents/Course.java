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
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Module> modules;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String name, ArrayList<Module> modules, LocalDate startDate, LocalDate endDate) 
        {
		this.name = name;
		this.modules = modules;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
}

