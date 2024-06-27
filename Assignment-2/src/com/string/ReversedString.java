package com.string;
import java.util.Scanner;
public class ReversedString {
	
   public static String reversedString(String str) {
		String reversed="";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			reversed = ch + reversed;
		}
		return reversed;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the given string: ");
		String str = scanner.nextLine();
		
		System.out.println(reversedString(str));
		scanner.close();
	}
	
	
}
