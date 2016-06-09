package com.java.training;

public final class FinalKeyword {
	private static final String CONST = "I am a constant";
	
	/**
	 * This is final method - can't be overridden
	 * @return
	 */
	public final String value() {
		
		return "final value";
	}
	
	public String value(String a) {
		return "not final value " + a;
	}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword fk = new FinalKeyword();
		System.out.println(fk.value(CONST));

	}

}
