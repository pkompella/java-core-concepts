package com.java.training;

import java.lang.reflect.Method;

public class CoreClassesTest extends Object {
	public String name;
	
	
	
	@Override
	public boolean equals(Object object) {
		CoreClassesTest cc = (CoreClassesTest)object;
		if (this.name.equals(cc.name)) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return 0;
	};
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(name);
		sb.append("\nthis is how u can append!");
		sb.append("\ttabbed output");
		
		
		return sb.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		CoreClassesTest test = new CoreClassesTest();
		test.name = this.name + "test";
				
		return test;
	}
	
	
	public static void main(String[] args) {
		CoreClassesTest test = new CoreClassesTest();
		test.setName("Java Training");
		//System.out.println(test.toString());
		test.classMethods();
		/*String s = "this is test";
		String s2 = new String("this is S2");
		String s3 = s;
		s3 = "another test";
		String s4 = s3.concat(" one more test");	*/
		
		
		//System.out.println(s); 
		//System.out.println(s2); 
		//System.out.println(s4.indexOf("x")); 
		Integer value = new Integer(10);
		value = 100;
		Long longValue = 20L;
		System.out.println(longValue);
		
		String[] myArray = new String[] {"A", "B", "C"};
		for (int i=0; i < myArray.length; i++) {
			//myArray[i] = "DSFDSFDSF";
			System.out.println(myArray[i]);
		}
		
		for (String s: myArray) {
			System.out.println(s);
		}
		
			
		Object obj = new Double(0.00);
		if (obj instanceof Double) {
			System.out.println("double");
		}
		if (obj instanceof String) {
			
		}
		
		
		
		
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void classMethods() {
		String className = CoreClassesTest.class.getName();
		System.out.println("Class Name = " + className);
		 
		Method[] methods = CoreClassesTest.class.getMethods();
		for (int i=0; i<methods.length; i++) {
			System.out.println("Method name = " + methods[i].getName());
			System.out.println("Method parameters = " + methods[i].getParameterCount());
		}
		
		
		
	}

}
