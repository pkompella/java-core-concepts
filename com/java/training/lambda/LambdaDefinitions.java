package com.java.training.lambda;

public class LambdaDefinitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation addition = new Operation() {
			public int operation(int a, int b) {
				return a + b;
			}
		};
		
		Operation substraction = new Operation() {
			public int operation(int a, int b) {
				return a - b;
			}
		};
		
		Operation mutiplication = new Operation() {
			public int operation(int a, int b) {
				return a * b;
			}
		};
		
		Operation a1 = (int a, int b) -> {return a+b;};
		Operation a2 = (int a, int b) -> a+b;
		Operation a3 = (a, b) -> a+b;
		
		Operation3 o = () -> 1;
		
		Operation4 o4 = () -> System.out.println("no arg no return");
		o4.operation();
		

	}

}

interface Operation {
	int operation(int a, int b);
}

interface Operation2 {
	int operation(int a);
}

interface Operation3 {
	int operation();
}

interface Operation4 {
	void operation();
}


