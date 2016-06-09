package com.java.training;

class A {
	interface Message {
		void msg();
	}
}

public class NestedInterface2 implements A.Message {
	public void msg() {
		System.out.println("Hello nested interface from class");
	}

	public static void main(String args[]) {
		A.Message message = new NestedInterface2();
		message.msg();
	}
}