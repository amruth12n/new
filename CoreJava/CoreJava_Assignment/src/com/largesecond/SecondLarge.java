package com.largesecond;

public class SecondLarge {

	public static void main(String[] args) {
		int[] arr = {5,9,3,4,1,2,89,44,1,0,89,19};
		int large = Integer.MIN_VALUE, secondLarge=Integer.MIN_VALUE;
		
		for(int i: arr) {
			if(i>large) {
				secondLarge = large;
				large = i;
			}
			else if(i>secondLarge && i<large)
				secondLarge = i;
		}
		System.out.println("Second large number: "+secondLarge);
	}

}
