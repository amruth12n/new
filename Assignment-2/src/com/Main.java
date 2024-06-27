package com;

import java.time.LocalDate;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	 // Create tasks
		 Task task1 = new Task("Complete assignment", "Finish the programming assignment", LocalDate.now().plusDays(5), 1);
		 Task task2 = new Task("Buy groceries", "Purchase fruits and vegetables", LocalDate.now().plusDays(2), 2);
		 Task task3 = new Task("Study Assignment", "Study and Complete the given assignment", LocalDate.now().plusDays(2), 2);
		 Task task4 = new Task("Clean the room", "Wipe and arrange the items in room",LocalDate.now().plusDays(2), 2);
	 // Add tasks to task list
	 // Display tasks in the task list
	 // Remove a task from the task list
	 // Display tasks after removal
	 // Sort tasks by name
	//Display tasks after removal
	 
		 TaskList taskList = new TaskList();
		 taskList.addTask(task1);
	     taskList.addTask(task2);
	     taskList.addTask(task3);
	     taskList.addTask(task4);
	        
	     System.out.println("Tasks in the list:");
	     displayTasks(taskList.getTasks());
	        
	     taskList.removeTask(task2);
	     System.out.println("\nTasks after removing 'Buy groceries':");
	     displayTasks(taskList.getTasks());
	        
	     taskList.sortTasksByName();
	     System.out.println("\nTasks after sorting by name:");
	     displayTasks(taskList.getTasks());
	    }
	    
	    private static void displayTasks(List<Task> tasks) {
	        for (Task task : tasks) {
	            System.out.println(task);
	        }
	    }
	
	
	
}