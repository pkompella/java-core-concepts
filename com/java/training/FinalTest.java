package com.java.training;

public  class FinalTest {
	public  void  finalMethod() {
		System.out.println("this is final method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest test = new SubClass();
		test.finalMethod();

	}

}

class SubClass extends FinalTest {
	@Override
	public void finalMethod() {
		System.out.println("this is final method from derived class");
	}
	
}
