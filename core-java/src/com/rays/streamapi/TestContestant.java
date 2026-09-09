package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<>();

		list.add(new Contestant("Ram", "9876543212"));
		list.add(new Contestant("Ajay", "8815603982"));
		list.add(new Contestant("Raj", "6268923724"));
		list.add(new Contestant("Prince", "8349516759"));
		list.add(new Contestant("Ram", "1176543212"));

		// distinct duplicate no remove kar dai gaaa

		// list.stream stream mai convert kiyaaa
		// filter condition check kar taa haiii
		// collect steam ko collection mai convert kar rhiii haii
		// Collectors.toList() collection ko list mai convert karaa haiiii
		// suffle value ko sufflekar rhaa h

		list.stream().filter(e -> e.phoneNo.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream(); // fir say stream mai convert karaaa
				})).limit(1).forEach(e -> {
					System.out.println(e.name + " " + e.phoneNo);
				});

		// .forEach(System.out::println);
	}

}