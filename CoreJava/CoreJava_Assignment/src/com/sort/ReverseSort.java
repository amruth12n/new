package com.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,9,3,4,1,2,56,44,1,0,89,19);
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
	}

}
