package com.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ReverseEachWord {
	
	public static String reverse(String word) {
		String reversed = "";
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			reversed = ch + reversed;
		}
		return reversed;
	}

	public static void main(String[] args) {
		String sentence = "The Sun rises in the East";
		String[] array = sentence.split(" ");
		
		List<String> strList = Arrays.asList(array);
				
		String sortedList = strList.stream()
				.map(word -> reverse(word))
				.collect(Collectors.joining(" "));
				
		System.out.println(sortedList);

	}
	

}
