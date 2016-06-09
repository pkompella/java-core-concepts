package com.java.training;

public class PassByValueTest {
	void passByValue(int x) {
		System.out.println("Before == > x = " + x);
		x = 1000;
		System.out.println("After ==>  x = " + x);
	}
	
	void passByValue(ClassTest test) {
		System.out.println("Before == > test.name = " + test.getName());
		test.setName("Param");
		System.out.println("After ==>  test.name = " + test.getName());
		System.out.println("Test address == " + test);
		ClassTest test2 = test;
		System.out.println("Test address == " + test);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValueTest pt = new PassByValueTest();
		int a = 10;
		pt.passByValue(a);
		System.out.println("a = " + a);
		
		ClassTest test = new ClassTest();
		test.setName("Java Training");
		pt.passByValue(test);
		System.out.println("Test Name = > " + test.getName());
		System.out.println("Test address == " + test);

	}

}
