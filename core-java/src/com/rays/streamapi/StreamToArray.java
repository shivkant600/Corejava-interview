package com.rays.streamapi;

import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("a", "b", "c");

		String[] sa = s.toArray(e -> new String[e]);
	//	String[] sa = s.toArray(String[]::new);

		System.out.println(sa[0]);
	}
	
}