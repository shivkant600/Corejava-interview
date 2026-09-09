package com.rays.collection;

import java.util.Stack;

public class TestAtoZ {
	public static void main(String[] args) {

		Stack s = new Stack();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(" " + s.push(ch));
		}

		Stack s1 = new Stack();  //PUSH SAY ADD 
		System.out.println();  //POP NIKAL RHAA HAIII

		while (!s.empty()) {
			System.out.print(" " + s1.push(s.pop()));
		}
	}
}