package com.sumavg;

public class SumandAverage {

	public static void main(String[] args) {
		int[] arr = {5,9,3,4,1,2,89,44,1,0,89,19};
		int sum=0;
		
		for(int i: arr)
			sum +=i;
		System.out.print("Sum of array: "+sum+"\nAverage of array: ");
		System.out.println(sum/arr.length);
	}

}
