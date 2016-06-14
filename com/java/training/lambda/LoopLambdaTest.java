package com.java.training.lambda;

import java.util.Arrays;
import java.util.List;

public class LoopLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println("old way");
		for (Integer n : list) {
			System.out.println(n);
		}

		// New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println("new way");
		list2.forEach(n -> System.out.println(n));
		System.out.println("new way 2");
		list2.forEach(System.out::println);
		
		//Streaming with lambda
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
		list.stream()
		.map((x) -> x*x)
		//.filter(x -> (x %2 ==0))
		.forEach(System.out::println);
	}

}
