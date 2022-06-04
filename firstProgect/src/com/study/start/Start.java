package com.study.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
	
	public static void main( String[] args) {

	Employee Bob = new Employee();
	Employee Tom = new Employee();
	Employee Ted = new Employee();
	
	Bob.setName("Bob");
	Bob.setAge(16);
	Tom.setName("Tom");
	Tom.setAge(14);
	Ted.setName("Ted");
	Ted.setAge(15);
	
	List<Employee> Employees = new ArrayList<>();
	Employees.add(Bob);
	Employees.add(Tom);
	Employees.add(Ted);
	
	for(Employee Employee : Employees) {
		System.out.println(Employee.getName());
	}
	
    }
	
}