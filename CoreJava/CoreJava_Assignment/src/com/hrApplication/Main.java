package com.hrApplication;

public class Main {

	public static void main(String[] args) {
		HRManager hrManager = new HRManager();
		 // Test adding employees
		 try {
			 hrManager.addEmployee("1001", "John Doe", 1500);
			 hrManager.addEmployee("1002", "Jane Smith", 800);
		 } catch (InvalidEmployeeDataException | EmployeeAlreadyExistsException |
		SalaryBelowMinimumException e) {
			 System.out.println("Failed to add employee: " + e.getMessage());
		 }

	}

}
