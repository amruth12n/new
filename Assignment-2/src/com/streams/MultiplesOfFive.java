package com.streams;
import java.util.Arrays;
import java.util.List;

public class MultiplesOfFive {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 7, 5, 16, 11, 30, 25, 78, 65, 29, 30);
				
		numList.stream()
				.filter(n -> n % 5 == 0)
				.forEach(n -> System.out.println(n));

	}

}
