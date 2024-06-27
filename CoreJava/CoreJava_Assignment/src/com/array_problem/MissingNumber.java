package com.array_problem;

public class MissingNumber {
	
	private static int findMissinfNumber(int[] arr, int n) {
		int arraySum = 0;
		int actualSum = (n*(n+1))/2;
		for(int i: arr) arraySum += i;
		
		if(actualSum == arraySum) return 0;
		else return actualSum - arraySum;
	}

	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4,5,6,8,9};
		int n = 9;
		
		System.out.println("Missing Number: "+ findMissinfNumber(arr,n));
		
	}


}
