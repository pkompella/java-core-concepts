package com.java.training;

public class AutoBoxingTest {

	public static void main(String[] args) {
		//boxing
		int a = 10;
		Integer intObject = a; //auto boxing
		
		System.out.println("Primitive int = " + a);
		System.out.println("Autoboxed Wrapper = " + intObject);
		
		//unboxing
		intObject  = 1000;
		a = intObject;
		
		System.out.println("Primitive int = " + a);
		System.out.println("Autoboxed Wrapper = " + intObject);
	
	}

}
