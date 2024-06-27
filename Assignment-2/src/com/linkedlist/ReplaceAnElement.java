package com.linkedlist;

import java.util.LinkedList;

public class ReplaceAnElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");

		System.out.println(list); 
		
		list.set(2, "ZERO");
		System.out.println(list); 

	}

}
