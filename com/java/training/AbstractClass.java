package com.java.training;

public  abstract class AbstractClass {
	
	public void doFirstThing() {
		System.out.println("Base class function ==> doing the first thing");
	}
	
	public void doLastThing() {
		System.out.println("Base class function ==> doing the last thing");
	}
	
	public abstract void doAction();
	
	public void doProces() {
		//do your first thing
		doFirstThing();
		//do some action
		doAction();
		//do your last thing
		doLastThing();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ERROR
		//AbstractClass ab = new AbstractClass();
		
		DerivedClass dc = new DerivedClass();
		dc.doProces();
		
		//Anonymous Inner Class
		/*AbstractClass ab = new AbstractClass() {
			
			@Override
			public void doAction() {
				System.out.println("Anonymous Inner Derived class implementation ==> Action");
			}
		};
		ab.doProces();*/

	}
	
	
}

class DerivedClass extends AbstractClass {

	@Override
	public void doAction() {
		System.out.println("Derived class implementation ==> Action");
		
	}
	
}

