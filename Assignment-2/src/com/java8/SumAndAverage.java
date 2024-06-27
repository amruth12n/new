package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAndAverage {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2, 5 , 7, 1 , 6);
		
		int sumOfDigits = numList.stream()
				.map(n -> n)
				.collect(Collectors.summingInt(n -> n));
		
		double averageOfDigits = numList.stream()
				.map(n->n)
				.collect(Collectors.averagingInt(n -> n));
		
		System.out.println("Sum of digits is: " + sumOfDigits);
		System.out.println("Average of digits is: " + averageOfDigits);
	}

}
