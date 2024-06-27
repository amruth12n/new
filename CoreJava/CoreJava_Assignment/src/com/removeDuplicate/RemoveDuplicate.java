package com.removeDuplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,8,2,3,4,4,9,6,3,1);

		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Previous list: "+list);
		System.out.println("Current list: "+newList);

	}

}
