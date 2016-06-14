package com.java.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {

	public static void main(String[] args) {
		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		
		 MathOperation addition2 = new MathOperation() {
			 @Override public int operation(int a, int b) {
				 return a+b;
			}
		 };
		
		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		LambdaExpression test = new LambdaExpression();

		System.out.println("100 + 50 = " + test.operate(100, 50, addition));
		System.out.println("100 - 50 = " + test.operate(100, 50, subtraction));
		System.out.println("100 * 50 = "
				+ test.operate(100, 50, multiplication));
		System.out.println("100 / 50 = " + test.operate(100, 50, division));

		// without parenthesis
		GreetingService greetService1 = message -> System.out
				.println("Hello ==> " + message);
		/*
		 * GreetingService greetService = new GreetingService() { public void
		 * sayMessage(String message) { System.out.println("Hello ==> " +
		 * message); } };
		 */

		// with parenthesis
		GreetingService greetService2 = (message) -> System.out
				.println("Hello ==> " + message);

		greetService1.sayMessage("Lamda expressions rock!");
		greetService2.sayMessage("Lamda expressions tough to understand");

		NoOpService noOp = () -> System.out
				.println("Hello ==> I am no op service");
		/*NoOpService noOpService = new NoOpService() {
			@Override
			public void noOp() {
				System.out
				.println("Hello ==> I am no op service");
			}
		};*/
		noOp.noOp();

		// Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for (Integer n : list) {
			System.out.println(n);
		}

		// New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list2.forEach( n -> System.out.println(n));

		// New way:
		// List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		// list.stream().map((x) -> x*x).forEach(System.out::println);
		// int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		// System.out.println(sum);

		System.out.println("Print all numbers:");
		evaluate(list, (n) -> true);

		System.out.println("Print no numbers:");
		evaluate(list, (n) -> false);

		System.out.println("Print even numbers:");
		evaluate(list, (n) -> n % 2 == 0);

		System.out.println("Print odd numbers:");
		evaluate(list, (n) -> n % 2 == 1);

		System.out.println("Print numbers greater than 5:");
		evaluate(list, (n) -> n > 5);

	}
	
	@FunctionalInterface
	interface MathOperation {
		int operation(int a, int b);
		

	}

	interface GreetingService {
		void sayMessage(String message);
	}

	interface NoOpService {
		void noOp();
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}

}
