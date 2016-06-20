package com.java.training.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EvenNumberTest {

	private Integer inputNumber;
	private Boolean expectedResult;
	private NumberChecker numberChecker;

	@Before
	public void initialize() {
		this.numberChecker = new NumberChecker();
	}

	// Each parameter should be placed as an argument here
	public EvenNumberTest(Integer inputNumber, 
      Boolean expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

	@Parameterized.Parameters
	public static Collection numbers() {
		return Arrays.asList(new Object[][] { { 2, true }, { 3, false }, { 6, true }, { 22, true }, { 23, false } });
	}
	
	

	// This test will run 4 times since we have 5 parameters defined
	@Test
	public void testEvenNumberChecker() {
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, this.numberChecker.validate(inputNumber));
	}

}
