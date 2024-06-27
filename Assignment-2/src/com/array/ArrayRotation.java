package com.array;

public class ArrayRotation { 
    
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(numArray, k);
        for (int num : numArray) {
            System.out.print(num + " ");
        }
    }
    
    public static void rotate(int[] numArray, int k) {
        int len = numArray.length;
        k = k % len; 
        
        reverse(numArray, 0, len-1);      
        reverse(numArray, 0, k-1);      
        reverse(numArray, k, len-1);    
    }

    private static void reverse(int[] numArray, int start, int end) {
        while (start < end) {
            int temp = numArray[start];
            numArray[start] = numArray[end];
            numArray[end] = temp;
            start++;
            end--;
        }
    }

}

