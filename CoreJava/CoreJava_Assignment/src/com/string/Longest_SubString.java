package com.string;
import java.util.HashMap;
public class Longest_SubString {

	public static int findLongSubstring(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		int length = 0;
		int startPnt=0; //sndPnt=0;
		for(int i=0; i<str.length();i++) {
				char ch = str.charAt(i);
				
				if(map.containsKey(ch)) {
					
					if(startPnt<=map.get(ch)) {
						while(startPnt<i)
							startPnt++;
					}
					map.put(ch, i);
				}
				else
					map.put(ch, i);
				
				length = Math.max((i-startPnt)+1,length);
		}
		
		return length;
		
	}
	public static void main(String[] args) {
		String str = "aadbbus";
		System.out.println("Length of longest substring: "+findLongSubstring(str));

	}

}
