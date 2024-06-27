package com.hrApplication;

import java.util.ArrayList;
import java.util.List;

public class HRManager {
	 private List<Employee> employeeList;
	 public HRManager() {
		 employeeList = new ArrayList<>();
	 }
public void addEmployee(String id, String name, double salary)
	 throws InvalidEmployeeDataException, EmployeeAlreadyExistsException,
	SalaryBelowMinimumException {
	 // Validate employee data
	 if (id == null || name == null || id.isEmpty() || name.isEmpty() || salary <= 0) {
		 throw new InvalidEmployeeDataException("Invalid employee data provided");
	 }
	 // Check if employee already exists
	 for (Employee employee : employeeList) {
		 if (employee.getId().equals(id)) {
			 throw new EmployeeAlreadyExistsException("Employee with ID " + id + " already exists");
		 }
	 }
	 // Check salary threshold
	 if (salary < Employee.getMinimumSalary()) {
		 throw new SalaryBelowMinimumException("Salary cannot be below the minimum threshold: " +
				 Employee.getMinimumSalary());
	 }
	 // Add employee to the list
	 employeeList.add(new Employee(id, name, salary));
	 System.out.println("Employee added successfully: " + name);
	 }
}
