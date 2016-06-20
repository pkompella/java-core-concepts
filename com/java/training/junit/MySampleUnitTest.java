package com.java.training.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySampleUnitTest {
	
	public void printValue(int a) {
		if (a > 1) {
			System.out.println("a is > 1");
		} else {
			System.out.println("a is <= 1");
		}
	}

	@Test
	public void sample() {
		String msg = "This is simple";
		assertEquals(msg, "This is simple");
		assertNotEquals(msg, "this is simple");
		//assertEquals(msg, "this is simple");
		assertNotNull(msg);
		printValue(2);
		printValue(1);

	}

}
