package com.maxmin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMin {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5, 7 , 2, 3, 1);
		List<Integer> sortedList = numList.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Minimum number in the arraylist is " + sortedList.get(0));
		System.out.println("Maximum number in the arraylist is " + sortedList.get(sortedList.size() - 1));
	}

}
