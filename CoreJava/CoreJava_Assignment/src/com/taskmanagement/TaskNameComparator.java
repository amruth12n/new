package com.taskmanagement;

import java.util.Comparator;

public class TaskNameComparator implements Comparator<Task>{
	
	public int compare(Task task1, Task task2) {
		 return task1.getTitle().compareTo(task2.getTitle());
	}

	public TaskNameComparator() {
		super();
	}
	

}
