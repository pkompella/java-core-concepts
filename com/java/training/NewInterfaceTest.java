package com.java.training;

interface One {
	/*default void oneMethod() {
		System.out.println("One interface implementation of oneMethod");
	}*/
	void oneMethod();
}

interface Two extends One {
	void oneMethod();
}

public class NewInterfaceTest implements Two {

	public static void main(String[] args) {
		One one = new NewInterfaceTest();
		one.oneMethod();
		Two two = new NewInterfaceTest();
		two.oneMethod();

	}

	@Override
	public void oneMethod() {
		System.out.println("Class implementation of oneMethod");
		
	}


}


