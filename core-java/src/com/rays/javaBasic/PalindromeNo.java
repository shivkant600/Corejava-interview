package com.rays.javaBasic;

public class PalindromeNo {
	public static void main(String[] args) {
		
		int num = 121;
		int num2 = num;
		int r = 0;
		int temp = 0;
		
		while(num2 != 0) {
			r = num2 % 10;
			temp = temp * 10 + r;
			num2 = num2 / 10;
		}
		if(temp == num) {
			System.out.println(num + " Is PalindromeNo");
		}else {
			System.out.println(num + " Is Not PalindromeNo");
		}
	}
}