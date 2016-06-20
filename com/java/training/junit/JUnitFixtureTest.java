package com.java.training.junit;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class JUnitFixtureTest {//no need to do this now - extends TestCase {
	protected int value1, value2;
	
	@BeforeClass
	public static void  setUpClass() {
	  // Initialize stuff once for ALL tests (run once)
		System.out.println("Startup() called at first - only once");
	}
	
	@Before
	public void startUp() {
		this.value1 = 10; 
		this.value2 = 20;
		System.out.println("Startup() called - before each test");
	}
	
	@After
	public void tearDown() {
		this.value1 = 0; 
		this.value2 = 0;
		System.out.println("TearDown() called - after each test");
	}

	
	@AfterClass
	public static void tearDownClass() {
	  // Initialize stuff once for ALL tests (run once)
		System.out.println("TearDown() called at last - only once");
	}
	
	
	
	@Test
	public void testFixture() {
		assertEquals(value1 + value2, 30);
		System.out.println("Inside testFixture()");
	}
	
	
	@Test
	public void testAnother() {
		assertEquals("same", "same");
		System.out.println("Inside testAnother()");
		System.out.println("Value1 = " + value1);
		System.out.println("Value2 = " + value2);
	}

}
