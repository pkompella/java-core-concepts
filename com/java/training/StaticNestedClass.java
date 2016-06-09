package com.java.training;

public class StaticNestedClass {
	static String data = "Static nested data";
	//String data2 = "Static nested data";

	static class Inner {
		void msg() {
			System.out.println("Non-static method called ==> data is " + data);
		}
		
		static void staticMsg() {
			System.out.println("static method called ==> called from static method - Data is " + data);
		}
	}

	public static void main(String args[]) {
		StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
		obj.msg();
		StaticNestedClass.Inner.staticMsg();
	}
}
