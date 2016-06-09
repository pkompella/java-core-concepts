package com.java.training;

//using abstract class
abstract class Person {
	abstract void eat();
}

//using interface
interface Eatable{  
	void eat();  
}  

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("abstract class ==> nice fruits");
			}
		};
		p.eat();
		
		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("interface class ==> nice fruits");
			}
		};
		e.eat();

	}

}

