package com.java.training.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		QueueDemo demo = new QueueDemo();
		Queue<Employee> employeeList = new LinkedList<Employee>();
		//add elements to the Queue
		demo.addElements(employeeList);
		
			
		//access queued elements using Iterator
		demo.displayElements(employeeList);
		

	}
	
	private void addElements(Queue<Employee> employees) {
		//Adding 3 employees
		employees.add(new Employee(1, 42, "Xavier", "Doe", "US Address"));
		employees.add(new Employee(2, 28, "Jane", "Doe", "US Address"));
		employees.add(new Employee(5, 25, "Mark", "McKay", "US Address"));
	}
	
	private void displayElements(Queue<Employee> employees) {
		
/*
		//access via Iterator
		Iterator<Employee> iterator = employees.iterator();
		while(iterator.hasNext()){
		  Employee emp = (Employee) iterator.next();
		  //System.out.println("Employee ==> " + emp);
		}

		//access via new for-loop
		for(Employee emp : employees) {
			System.out.println("Employee ==> " + emp);
		}
*/		

		
		//Lambda way
		employees.forEach(System.out::println);
		
		Employee emp = employees.remove();
		System.out.println("Employee at head  ==> " + emp);
	}

}
