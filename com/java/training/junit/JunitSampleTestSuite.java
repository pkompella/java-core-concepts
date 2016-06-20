package com.java.training.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestResult;
import junit.framework.TestSuite;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({ MySampleUnitTest.class, JUnitFixtureTest.class })
public class JunitSampleTestSuite {
	/*public static void main(String[] a) {
		// add the test's in the suite
		TestSuite suite = new TestSuite(MySampleUnitTest.class, JUnitFixtureTest.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());
	}*/
}
