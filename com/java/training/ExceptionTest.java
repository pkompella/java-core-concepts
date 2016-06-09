package com.java.training;

public class ExceptionTest {
	
	void doBusiness() throws MyException {
		//do something here
		System.out.println("I am in doBusiness");
		throw new MyException("My business exception");
	}
	
	void doCalculation() {
		System.out.println("I am in doCalculation");
		throw new MyRuntimeException("My Runtime Exception");
	}

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		try {
			test.doBusiness();
			test.doCalculation();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}

class MyException extends Exception {
	MyException(String message) {
		super(message);
	}
}

class MyRuntimeException extends RuntimeException {
	MyRuntimeException(String msg) {
		super(msg);
	}
}
