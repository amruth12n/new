package com.string;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: "); String str = sc.next();
		System.out.println("\nOriginal String: "+str);
		
		StringBuffer strBfr = new StringBuffer();
		
		for(int i=str.length()-1; i>=0; i--) 
			strBfr.append(str.charAt(i));
		
		System.out.println("Reversed String: "+strBfr.toString());
		sc.close();

	}

}
