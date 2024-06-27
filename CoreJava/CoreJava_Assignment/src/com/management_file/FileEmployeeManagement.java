package com.management_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEmployeeManagement {
	 private static final String FILE_NAME = "employee_records.txt";
	 
	 public static void main(String[] args) {
		 try {
			 File file = new File(FILE_NAME);
			 if (!file.exists()) {
				 file.createNewFile();
			 }
			 Scanner scanner = new Scanner(System.in);
			 int choice;
			 do {
				 System.out.println("\n1. Add Employee Record");
				 System.out.println("2. Display All Employee Records");
				 System.out.println("3. Search Employee Record by ID");
				 System.out.println("4. Update Employee Salary by ID");
				 System.out.println("5. Delete Employee Record by ID");
				 System.out.println("6. Exit");
				 System.out.print("Enter your choice: ");
				 choice = scanner.nextInt();
				 scanner.nextLine(); // Consume newline
				 
				 
				 switch (choice) {
					 case 1:
						 addEmployeeRecord();
						 break;
					 case 2:
						 displayAllEmployeeRecords();
						 break;
					 case 3:
						 searchEmployeeByID();
						 break;
					 case 4:
						 updateEmployeeSalary();
						 break;
					 case 5:
						 deleteEmployeeRecord();
						 break;
					 case 6:
						 System.out.println("Exiting...");
						 break;
					 default:
						 System.out.println("Invalid choice. Please enter a number between 1 and 6.");
				}
			 } while (choice != 6);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		  }
	}
	 
	private static void addEmployeeRecord() throws IOException {
		 //Get Employee data from user
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Id: "); String id = sc.nextLine();
			System.out.print("Enter Name: "); String name = sc.nextLine();
			System.out.print("Enter Department: "); String department = sc.nextLine();
			System.out.print("Enter Salary: "); double salary = sc.nextDouble();
			
			 // Create employee object say employee and pass it to employee constructor
			Employee employee = new Employee(id, name, department, salary);
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
				 writer.write(employee.toString());
				 writer.newLine();
				 System.out.println("Employee record added successfully.");
			 }
		}
		catch(Exception e) {
			System.out.println("Error! Salary Input Mismatch Exception "+e.getCause());
		}
	}
	
	private static void displayAllEmployeeRecords() throws IOException {
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
			 String line;
			 System.out.println("\nEmployee Records:");
			 while ((line = reader.readLine()) != null) {
				 System.out.println(line);
			 }
		 }
	}
	
	private static void searchEmployeeByID() throws IOException {
		//Get the employee id from user to be search in a variable called searchID
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id To Search: "); String searchID = sc.next();
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
			 String line;
			 boolean found = false;
			 while ((line = reader.readLine()) != null) {
				 if (line.startsWith("Employee [id=" + searchID)) {
					 System.out.println("\nEmployee Record found:");
					 System.out.println(line);
					 found = true;
					 break;
				 }
			 }
			 if (!found) {
				 System.out.println("Employee with ID " + searchID + " not found.");
			 }
		 }
	}
	
	private static void updateEmployeeSalary() throws IOException {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter Employee ID to update salary: ");
		 String updateID = scanner.nextLine(); 
		 StringBuilder newRecords = new StringBuilder();
		 boolean updated = false, valid= false;
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
			 String line;
			 while ((line = reader.readLine()) != null) {
				 if (line.startsWith("Employee [id="+ updateID)) {
					 String[] parts = line.split(", ");
					 System.out.print("Enter new Salary for " + parts[1] + ": $");
					 double newSalary = scanner.nextDouble();
					 parts[3] = "salary=" + newSalary+"]";
					 line = String.join(", ", parts);
					 updated = true;
				 }
				 newRecords.append(line).append("\n");
			 }
		 }
		 //need to fix
		 catch(Exception e) {
			 System.out.println("Error! Input Mismatch Exception "+e.getCause());
			 valid = !valid;
		 }
		 if(!valid) {
			 if (!updated) {
				 System.out.println("Employee with ID " + updateID + " not found.");
			 } else {
				 try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
					 writer.write(newRecords.toString());
					 System.out.println("Salary updated successfully.");
				 }
			 }
		 }
	}
	private static void deleteEmployeeRecord() throws IOException {
		 //Get deleteID from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id To Delete: "); String deleteID = sc.next();
		 StringBuilder newRecords = new StringBuilder();
		 boolean deleted = false;
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
			 String line;
			 while ((line = reader.readLine()) != null) {
				 if (!line.startsWith("Employee [id=" + deleteID)) {
					 newRecords.append(line).append("\n");
				 } else {
					 deleted = true;
				 }
			 }
		 }
		 if (!deleted) {
			 System.out.println("Employee with ID " + deleteID + " not found.");
		 } else {
			 try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
				 writer.write(newRecords.toString());
			 System.out.println("Employee record deleted successfully.");
			 }
		 }
	}


}
