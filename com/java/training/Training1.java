package com.java.training;

/**
 * @see java.lang.String
 * @
 * @author atp1pak
 *
 */
public class Training1 {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nHi There! Welcome to  Java online Training!");
		
		int i; // I am primitive
		i = 10;
		float f = 2; // I am another primitive
		double d = 3.21;
		String s = "Test";
		System.out.println("\nPrimitives = [i = " + i + " f = " + f + " d = " + d + " s = " + s + "]");
		
		//literals
		int i1 = 0;
		float pi = 3.1415F;
		double dd = 3.123d;
		long ll = 1234L;
		String s2 = null; 
		s2 = "\b \r \n \t";
		
		//operators
		/*i = 9;
		if (i < 10) {
			System.out.println("i is less than 10");
		}
		boolean dontRun = false;
		if (!dontRun) {
			//do something
		}*/
		
		if (i == 10) {
			
		} else if (i == 11) {
			
		}
		i = 0;
		while (i < 12) {
			//do something
			i++;
			break;
		}
		
		do {
			i++;
			break;
		} while (i < 12);
		
		for (int j = 0; j < 100; j++) {
			//do something
			continue;
		}
		

	}

}
