package com.rays.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;


public class TestEvenOdd {

	public static boolean oddEven(int i) {
		if (i % 2 == 0) {
			System.out.println(i + " is Even Number");
			return true;
		} else {
			System.out.println(i + " is Odd number");
			return true;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 6 };

		IntStream stream = Arrays.stream(arr);
		stream.distinct().filter(c -> oddEven(c)).forEach(c -> {
		});
	}

}
