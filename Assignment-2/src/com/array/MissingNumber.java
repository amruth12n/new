package com.array;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numArray = {0, 1, 2, 3, 4};
		System.out.println(FindMissing(numArray));

	}
	
	public static int FindMissing(int[] numArray) {
		int len = numArray.length;
		int sumOfNo = len*(len+1)/2;
		int sum = 0;
		
		for(int num: numArray) {
			sum += num;
		}
		return sumOfNo-sum;
	}

}
