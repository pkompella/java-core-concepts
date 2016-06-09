//package statement - first
package com.java.training;

//public access - can be accessible by all
public class EncapsulationAndAccessControl {
	//access control - private
	private String privateAccess = "this is private property";
	
	//access - public
	public String publicAccess = "this is public property";
	
	//access - protected - only by subclasses
	protected String protectedAccess = "this is protected property";
	
	//access - package - only within the package
	String packageAccess = "This is package access";

	public static void main(String[] args) {
		EncapsulationAndAccessControl eac = new EncapsulationAndAccessControl();
		//private - this will work only in the class - not outside of the class
		System.out.println("Accessing private = " + eac.privateAccess);
		
		//public - this will work outside of the class - anywhere
		System.out.println("Accessing public = " + eac.publicAccess);
		
		//protected - this will work in the class file and subclass file only
		System.out.println("Accessing protected = " + eac.protectedAccess);
		
		//package - this will work in the package
		System.out.println("Accessing package = " + eac.packageAccess);

		

	}
	
	private void test() {
		System.out.println("In test() method");
	}
	
	protected void baseTest() {
		System.out.println("In Base test() menthod");
	}

}


