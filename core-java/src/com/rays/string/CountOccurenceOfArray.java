package com.rays.string;

public class CountOccurenceOfArray {

	public static void main(String[] args) {

		String[] name = { "shivkant", "choudhary" };
		

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (String s : name) {

				for (int i = 0; i < s.length(); i++) {

					if (ch == s.charAt(i)) {
						count++;

					}
				}

			}
			if (count != 0) {
				System.out.println(ch + " " + count);

			}
		}

	}
}