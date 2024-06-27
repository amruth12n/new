package com.taskmanagement;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Task task1 = new Task("Complete assignment", 
				"Finish the programmingassignment", LocalDate.now().plusDays(5), 1);
		Task task2 = new Task("Buy groceries", 
				"Purchase fruits and vegetables",LocalDate.now().plusDays(2), 2);
		Task task3 = new Task("Study Assignment",
				"Study and Complete the givneassignment", LocalDate.now().plusDays(2), 3);
		Task task4 = new Task("Clean the room",
				"Wipe and arrange the items in room",LocalDate.now().plusDays(2), 4);
		
		// Add tasks to task-list
		TaskList tskList = new TaskList();
		tskList.addTask(task1); tskList.addTask(task3); tskList.addTask(task4); tskList.addTask(task2);
		
		 // Display tasks in the task-list
		System.out.println("Tasks After adding: ");
		printTask(tskList.getTasks());
		
		 // Remove a task from the task-list
		tskList.removeTask(task4);
		
		 // Display tasks after removal
		System.out.println("\nTasks After remove: ");
		printTask(tskList.getTasks());

		 // Sort tasks by name
		tskList.sortTasksByName();
		
		 // Display tasks after removal
		System.out.println("\nTasks After sort: ");
		printTask(tskList.getTasks());

	}

	private static void printTask(List<Task> list) {
		for(Task lst: list) {
			System.out.print(lst.getTitle()+" ");
			System.out.print(lst.getDescription()+" ");
			System.out.print(lst.getDueDate()+" ");
			System.out.print(lst.getPriority()+" \n");
		}
	}

}
