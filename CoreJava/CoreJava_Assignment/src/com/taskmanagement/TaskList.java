package com.taskmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskList{
	private List<Task> tasks;

	public TaskList() {
		tasks = new ArrayList<Task>();
	 }

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void removeTask(Task task) {
		tasks.remove(task);
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void sortTasksByName() {
	 Collections.sort(tasks, new TaskNameComparator());
	}
}
