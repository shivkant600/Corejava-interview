package com.rays.string;

public class CountOccurenceOfaChar {

	public static void main(String[] args) {
		
		String name = "Shivkant";
		int count = 0;
		
		char ch = 'h';
		
		for(int i=0; i<name.length(); i++) {
			if(ch == name.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch +" "+ count);
	}
}