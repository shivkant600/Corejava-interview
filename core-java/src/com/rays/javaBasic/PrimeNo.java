package com.rays.javaBasic;

public class PrimeNo {

	public static void main(String[] args) {

		int num = 7;
		int count = 0;
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println(num+" Is Prime Number");
		}else {
			System.out.println(num+" Is Not Prime Number");
		}
	}
}