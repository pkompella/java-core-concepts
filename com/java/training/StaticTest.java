package com.java.training;

public class StaticTest {
	//memory allocated at the heap when object created
	private String nonStaticMember = "I am not static";
	private static String staticMember = "I am static";
	
	//here is the static code block
	static {
		//this is called before the object is created
		staticMember = "want to change my value";
		//nonStaticMember = "fdsfds";
	}
	
	public static void staticMethod() {
		System.out.println("Static method called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static can be accessed here = " + staticMember);
		//System.out.println("Non Static cannot be accessed here = " + nonStaticMember);
		
		//you can call static methods directly without creating objects
		StaticTest.staticMethod();

	}

}
;