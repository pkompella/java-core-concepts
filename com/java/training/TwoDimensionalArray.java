package com.java.training;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// varying array
		String[][] twoDArray = new String[][] {
				{ "R1C1", "R1C2", "R1C3", "R1C4" }, { "R2C1", "R2C2", "R2C3" },
				{ "R3C1", "R3C2", "R3C3" }, { "R4C1", "R4C2"}, { "R5C1" }
				};
		
		//conventional loop
		for (int row = 0; row < twoDArray.length; row++) {
			for (int col = 0; col < twoDArray[row].length; col++) {
				//System.out.println("Value using conventional loop = " + twoDArray[row][col]);
			}
		}
		
		//new loops
		for (String[] rowData : twoDArray) {
			for (String s : rowData) {
				System.out.println("Value using new loop  = " + s);
			}
		}

	}

}
