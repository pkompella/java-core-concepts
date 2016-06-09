package com.java.training;

public class Inheritance {
	public static void main(String args[]) {
	      Car b1 = new Car();
	      b1.color = "Blue";
	      b1.speed = 200 ;
	      b1.size = 22;
	      b1.CC = 1000;
	      b1.gears = 5;
	      b1.attributes();
	      
	      Vehicle v1 = new Vehicle();
	      v1.speed = 300;
	      v1.size = 100;
	      v1.color = "Red";
	      
	      Car car2 = (Car)new Vehicle();
	      car2.CC = 100;
	      
;	  }
}


class Vehicle {
   String color;
   int speed;
   int size;
   void attributes() {
	   
      System.out.println("Color : " + color);
      System.out.println("Speed : " + speed);
      System.out.println("Size : " + size);
   }
}

// A subclass which extends for vehicle
class Car extends Vehicle {
   int CC;
   int gears;
   void attributes() {
      // The subclass refers to the members of the superclass
      //System.out.println("Color of Car : " + color);
      //System.out.println("Speed of Car : " + speed);
      //System.out.println("Size of Car : " + size);
	   super.attributes();
      System.out.println("CC of Car : " + CC);
      System.out.println("No of gears of Car : " + gears);
   }
   
   Car() {
	   //super.attributes();
	   super();
   }
}


