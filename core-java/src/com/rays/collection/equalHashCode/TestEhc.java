package com.rays.collection.equalHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestEhc {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ram", 5000);

		Employee e2 = new Employee(2, "Ajay", 8000);

		Employee e3 = new Employee(3, "Aman", 4000);

		Employee e4 = new Employee(1, "Ram", 5000);

		System.out.println(".....................ArrayList.......................");

		List list = new ArrayList();
		
		// sirf contain orr remove chala giii tooo sirf equals check hooo gaaa

		list.add(e1);
		list.add(e2);
		list.add(e4);

		System.out.println("1.." + list);

		System.out.println("2.." + list.contains(e1));

		System.out.println("3.." + list.remove(e4));

		System.out.println("4.." + list);

		System.out.println("5.." + list.size());

		System.out.println("...................Set.........................");

		Set s = new HashSet();
		
		// jab v data add hoo gaaa too hashcode check hooo gaaa orrr data duplicate hooo gaa to equals v check hooo gaaa

		s.add(e1);
		s.add(e2);
		s.add(e4);
		System.out.println("/////////");

		System.out.println("6.." + s.contains(e2));  //contain mai hashcode check hooo gaa

		System.out.println("7.." + s.remove(e4)); // hashcode equals dono check hooo gaaa

		System.out.println("8.." + s);

		System.out.println("....................Map.........................");

		Map m = new HashMap();
   
		// jab v data add hoo gaaa too hashcode check hooo gaaa orrr data duplicate hooo gaa to equals v check hooo gaaa
		
		
		m.put(e1, "one");
		m.put(e2, "two");
		m.put(e4, "three");

		System.out.println("9.." + m);

		System.out.println("10.." + m.containsKey(e4));  // hashcode orr equal dono check hooo giii

		System.out.println("11.." + m.remove(e2));  // hashcode orr equal dono check hooo giii

		System.out.println("12.." + m);
		
		
		
		

		//System.out.println("....................String.........................");

//		String s1 = "Anand";
//
//		String s2 = "Raju";
//
//		System.out.println("13.." + s1.equals(s2));
//
//		System.out.println("14.." + s1);
//		System.out.println("15.." + s2);
//
//		System.out.println("16.." + e1.equals(e2));

	}
}