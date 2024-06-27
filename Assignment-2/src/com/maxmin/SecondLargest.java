package com.maxmin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5, 7 , 2, 3, 8, 1, 9, 7);
		List<Integer> sortedList = numList.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Second Largest number in the arraylist is " + sortedList.get(sortedList.size() - 2));
	}

}
