package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadWriteByKeyboard {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = new FileWriter("D:\\io\\shivkant.txt");
		
		System.out.println("Enter Here.......");
		
		String str = reader.readLine();
		
		while(str != null) {
			
			fw.write(str);
			
			System.out.println(str);
			
			str = reader.readLine();
		}
		
		reader.close();
		fw.close();
	}
}