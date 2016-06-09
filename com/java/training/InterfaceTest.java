package com.java.training;

public class InterfaceTest {

	public static void main(String[] args) {
		Animal dog = new Dog();
		//dog.eat(); dog.travel();
		
		Animal fish = new Fish();
		//fish.eat(); fish.travel();
		
		Animal kangaroo = new Kangaroo();
		//kangaroo.eat(); kangaroo.travel();
		
		
		//explain the polymorphism concept here
		//giving different meaning to the same thing. The same things
		//here are eat an travel. When they are applied in the context
		//of different objects, the meaning changes
		Animal animals[] = {dog, fish, kangaroo};
		for (Animal animal : animals) {
			animal.eat();
			animal.travel();
			animal.isMammal();
		}
		
	}

}
