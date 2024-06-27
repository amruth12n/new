package com.findsum;

public class FindSum {

	public static void main(String[] args) {
		
		int num = 1234, sumOfDigits=0;
		String strNum = String.valueOf(num);
		
		sumOfDigits = strNum.chars().map(Character::getNumericValue).sum();
		System.out.println(sumOfDigits);

	}

}
