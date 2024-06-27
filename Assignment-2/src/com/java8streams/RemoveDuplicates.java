package com.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 1, 7, 9, 4, 4, 8, 2, 9, 5, 7, 2);
		List<String> strList = Arrays.asList("Tom", "Cat", "Jerry", "Cat", "Tom");
		
		List<Integer> distinctnumList = numList.stream()
	    .distinct()
		.collect(Collectors.toList());
		
		List<String> distinctstrList = strList.stream()
		.distinct()
		.collect(Collectors.toList());
			   
		System.out.println(distinctnumList);
		System.out.println(distinctstrList);
}
}
