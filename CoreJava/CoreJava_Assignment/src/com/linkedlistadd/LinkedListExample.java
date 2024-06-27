package com.linkedlistadd;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		//Adding elements at the end of the list
		list.add(10);
		list.addLast(20);
		list.offer(30);
		list.offerLast(40);
		//Printing the elements of list
		System.out.println(list); //Output : [10, 20, 30, 40]
		//Adding elements at the beginning of the list
		list.offerFirst(1);
		list.addFirst(2);
		//Printing the elements of list
		System.out.println(list); //Output : [2, 1, 10, 20, 30, 40]
		list.addLast(90);
		System.out.println(list); //Output : [2, 1, 10, 20, 30, 40,90]
	}

}
