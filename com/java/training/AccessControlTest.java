package com.java.training;

public class AccessControlTest {

	public static void main(String[] args) {
		EncapsulationAndAccessControl eac = new EncapsulationAndAccessControl();
		// private - this will work only in the class - not outside of the class
		//System.out.println("Accessing private = " + eac.privateAccess);

		// public - this will work outside of the class - anywhere
		System.out.println("Accessing public = " + eac.publicAccess);

		// protected - this will work in the class file and subclass file only
		System.out.println("Accessing protected = " + eac.protectedAccess);

		// package - this will work in the package
		System.out.println("Accessing protected = " + eac.packageAccess);

	}

}
