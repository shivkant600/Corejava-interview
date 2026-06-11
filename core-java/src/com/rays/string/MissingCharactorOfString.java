package com.rays.string;

public class MissingCharactorOfString {

	public static void main(String[] args) {

		String name = "shivkant choudhary";

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;

			for (int i = 0; i < name.length(); i++) {

				if (ch == name.charAt(i)) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(ch + " ");
			}
			
		}
	}
}