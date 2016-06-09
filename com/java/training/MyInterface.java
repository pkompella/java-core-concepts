package com.java.training;

public interface MyInterface {
	
	public void test();
	public void anotherTest();

}

class MyInterfaceImpl implements MyInterface {

	@Override
	public void test() {
		System.out.println("test");
		
	}

	@Override
	public void anotherTest() {
		System.out.println("another test");
		
	}
	
	public static void main(String[] args) {
		MyInterface intf = new MyInterfaceImpl();
		intf.test(); intf.anotherTest();
	}
	
}
