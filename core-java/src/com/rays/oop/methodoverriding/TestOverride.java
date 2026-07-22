package com.rays.oop.methodoverriding;

public class TestOverride {

	public static void main(String[] args) {

//		BaseCtl b = new BaseCtl();
//		b.display();
//
//		UserCtl u = new UserCtl();
//		u.display();

		
		
		//call basectl ki display method hoo gee orr chala gi child kiii
		//yeh runtime polymorphism ka example haiii
		BaseCtl bu = new UserCtl();
		bu.display();
	}
}