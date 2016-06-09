package com.java.training;

public interface Animal extends Mammal {
	int data = 10;
	void eat();
	void travel();
}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("A Dog eats meat & bones");
	}

	@Override
	public void travel() {
		System.out.println("A Dog travles by walking | running ");
	}
	
	@Override
	public boolean isMammal() {
		System.out.println("A Dog is a mammal ");
		return true;
	}

		
}

class Fish implements Animal {

	@Override
	public void eat() {
		System.out.println("A Fish eats meat & sea weed");
		
	}

	@Override
	public void travel() {
		System.out.println("A Fish travles by swimming ");
		
	}
	@Override
	public boolean isMammal() {
		System.out.println("A Fish is not a mammal ");
		return false;
	}
	
}

class Kangaroo implements Animal {

	@Override
	public void eat() {
		System.out.println("A Kangaroo eats grass & vegetables");
		
	}

	@Override
	public void travel() {
		System.out.println("A Kangaroo travles by crawling | jumping ");
		
	}
	@Override
	public boolean isMammal() {
		System.out.println("A Kangaroo is  a mammal ");
		return true;
	}
	
}
