package com.java.training;

public class ConstructorTest {
	private int length = 10;
	private int height = 10;
	private int width = 10;
	
	public ConstructorTest() {
		
	}
	
	public ConstructorTest(int len) {
		this.length = len;
	}
	
	public ConstructorTest(int length, int width) {
		this(length);
		this.width = width;
	}
	
	public ConstructorTest(int length, int width, int height) {
		this(length, width);
		this.height = height;
	}

	
	public int getVolume() {
		
		return length * width * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest test = new ConstructorTest();
		System.out.println("0 Arg Constructor called ==> " + test.getVolume());
		
		ConstructorTest test1 = new ConstructorTest(20);
		System.out.println("1 Arg Constructor called ==> " + test1.getVolume());
		
		ConstructorTest test2 = new ConstructorTest(20, 10);
		System.out.println("2 Args Constructor called ==> " + test2.getVolume());
		
		ConstructorTest test3 = new ConstructorTest(20, 10, 30);
		System.out.println("3 Args Constructor called ==> " + test3.getVolume());

	}

}
