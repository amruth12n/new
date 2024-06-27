package com.multiplof;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MultipleOf {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,9,3,4,1,20,56,44,10,0,890,19);
		checkMultiOf(list);
	}

	private static void checkMultiOf(List<Integer> list) {
		System.out.println("multiples of 5");
		Stream<Integer> stream = list.stream();
		stream.forEach(x -> { if(x%5==0){
									System.out.println(x);
								}
							}
						);
	}

}
