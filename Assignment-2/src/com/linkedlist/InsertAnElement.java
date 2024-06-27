package com.linkedlist;

import java.util.LinkedList;

public class InsertAnElement {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.addLast(20);
		list.offer(30);
		list.offerLast(40);

		System.out.println(list); 
		
		list.offerFirst(1);
		list.addFirst(2);
		
		System.out.println(list); 

	}

}
