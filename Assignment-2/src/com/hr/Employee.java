package com.hr;

class Employee {
	 private String id;
	 private String name;
	 private double salary;
	 private static final double MINIMUM_SALARY = 1000; // Example minimum salary threshold
	 
	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	

	public static double getMinimumSalary() {
		return MINIMUM_SALARY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
