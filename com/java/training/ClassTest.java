package com.java.training;

public class ClassTest {
	private int age;
	private String address;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setName(String ...strings) {
		
		this.name = strings[0];
		if (strings.length > 1) {
			System.out.println(strings[1]);
			System.out.println(strings[2]);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public  static void main(String[] args) {
		ClassTest classTest = new ClassTest();
		classTest.setName("Nikhil");
		System.out.println("Name = " + classTest.getName());
		System.out.println("classTest = " + classTest);
		ClassTest classTest2 = new ClassTest();
		classTest2.setName("Sudha");
		System.out.println("Name = " + classTest2.getName());
		System.out.println("classTest 2 = " + classTest2);
		classTest2 = new ClassTest();
		String[] names = {"Param", "Sarath", "Saikrishna"};
		classTest2.setName(names);
		System.out.println("Name = " + classTest2.getName());
		System.out.println("classTest 2 = " + classTest2);
		
	}

}
