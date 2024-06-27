package com.array_problem;

import java.util.Arrays;

public class Reverse_Array {

	private static void reverse(int[] arr, int i, int j) {
		int temp;
		while(i<j) {
			temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		
	}	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k=3;
		
		//right-rotation
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-k-1);
		reverse(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		

	}

	

}
