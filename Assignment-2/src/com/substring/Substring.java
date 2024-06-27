package com.substring;
import java.util.Scanner;
import java.util.HashSet;
public class Substring {
	
	public static int lengthOfSubstring(String str) {
		String substring = "";
		int result = 0;
		for (int i=0; i<str.length(); i++) {
			substring += str.charAt(i);
			boolean duplicatecheck = checkForDuplicateLetters(substring);
			if(duplicatecheck==false) {
				int substringLength = substring.length();
				if(substringLength>result) {
					result = substringLength;
				}
			}
			
		}
		return result;
		
	}
	public static boolean checkForDuplicateLetters(String input) {
        String lowercaseStr = input.toLowerCase();

        HashSet<Character> chars = new HashSet<>();
        boolean duplicateFound = false;

        for (char c : lowercaseStr.toCharArray()) {
            if (!chars.add(c)) {
                duplicateFound = true;
            }
        }

        return duplicateFound;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scanner.nextLine();
		
		
		System.out.println(lengthOfSubstring(str));
		scanner.close();
	}

}
