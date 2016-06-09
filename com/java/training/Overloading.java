package com.java.training;

public class Overloading {

	// no. of args change
	/*void sum(int a, int b) {
		System.out.println("2 arg sum method called with ints");
		System.out.println(a + b);
	}*/

	void sum(int a, int b, int c) {
		System.out.println("3 arg sum method called with ints");
		System.out.println(a + b + c);
	}

	// type of args change

	void sum(double a, double b) {
		System.out.println("2 arg sum method called with double");
		System.out.println(a + b);
	}
	
	/*double sum(double a, double b) {
		System.out.println("2 arg sum method called with double");
		System.out.println(a + b);
		return a+b;
	}*/
	
	/*private void sum(double a, double b) {
		System.out.println("2 arg sum method called with double");
		System.out.println(a + b);
	}*/

	public static void main(String args[]) {
		Overloading obj = new Overloading();
		obj.sum(20, 20);
		//obj.sum(10.5, 10.5, 10.5);
		obj.sum(10.5,10.5);  
	}

}
