package com.hrApplication;

public class Employee {
	
	 private String id;
	 private String name;
	 private double salary;
	 private static final double MINIMUM_SALARY = 1000; // Example minimum salary threshold
	 
	 public Employee(String id, String name, double salary) {
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
	 }
	 public String getId() {
		 return id;
	 }
	 public String getName() {
		 return name;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public static double getMinimumSalary() {
		 return MINIMUM_SALARY;
	 }
	  
}
