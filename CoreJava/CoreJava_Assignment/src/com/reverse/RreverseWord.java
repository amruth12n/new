package com.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RreverseWord {
	
	public static String doReverse(String word) {
		StringBuilder str = new StringBuilder(word);
		return str.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "Currently Using CoreJava";
		
		Stream<String> lineStream = Arrays.stream(line.split(" "));
		
		String reverseLine = lineStream.map(word -> doReverse(word)).collect(Collectors.joining(" "));
		
		System.out.println(line);
		System.out.println(reverseLine);
	}

}
