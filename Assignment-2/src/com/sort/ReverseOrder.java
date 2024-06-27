package com.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {

	public static void main(String[] args) {
		List<Double> decimalList = Arrays.asList(0.7, 2.5, 0.9, 0.1, 2.9, 5.6, 0.09);
		
		List<Double> sortedList = decimalList.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		
		System.out.println(sortedList);
	}

}
