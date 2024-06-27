package com.minmax;

import java.util.Arrays;
import java.util.List;

public class FindMinMax {
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	void findMinimumMaximum(List<Integer> list){
		for(int i: list) {
			max = Math.max(i, max);
			min = Math.min(i, min);
		}	
	}
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,9,3,4,11,2,56,44,21,2,89,19);
		
		FindMinMax fnd = new FindMinMax();
		fnd.findMinimumMaximum(list);
		System.out.println("Max number: "+fnd.max+"\nMin number: "+fnd.min);
	}

}
