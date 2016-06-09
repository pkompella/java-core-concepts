package com.java.training;

abstract class Test {
	abstract void test();
	Test() {
		System.out.println("calling abstract base constructor");
	}
}


public class AbstractTest extends Test {
	
	public AbstractTest() {
		super();
		System.out.println("calling derived constructor");
	}
	public  static void main(String[] args) {
		Test a = new AbstractTest();
	}
	
	void test() {
		// TODO Auto-generated method stub
		
	}


}


