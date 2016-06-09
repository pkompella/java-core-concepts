package com.java.training;

public class LocalInnerClass {

	private String data = "local inner class data";// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
		
	}

}
