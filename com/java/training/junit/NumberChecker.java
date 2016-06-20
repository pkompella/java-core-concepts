package com.java.training.junit;

public class NumberChecker {
	public Boolean validate(final Integer number) {
	      if (number < 0) return false;
	      if (number % 2 == 0) return true;
	      return false;
	}
}


