package com.java.training;

//to explain Dynamic method dispatch - it means being able to dispatch the right method based on
//the object context - overriding happens at the runtime (dynamic) - hence the name
public class DMDTest {

	public static void main(String[] args) {
		Shape aShape = new Shape(); // object of type Shape
		Circle aCircle = new Circle(); // object of type Circle
		Rectangle aRectangle = new Rectangle(); // object of type Rectangle
		Shape someShape; // obtain a reference of type Shape

		someShape = aShape; // someShape refers to Shape object
		aShape.draw();

		someShape= aCircle; // someShape refers to Circle object
		someShape.draw(); 

		someShape= aRectangle; // someShape refers to Rectangle object
		someShape.draw(); 

	}

}

class Shape {
	void draw() {
		System.out.println("Inside Shape.draw() method");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Inside Circle.draw() method");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Inside Rectangle.draw() method");
	}
}


