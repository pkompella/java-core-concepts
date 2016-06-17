package com.java.training.collections;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
	private int age;
	private String fname;
	private String lname;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Employee(int id, int age, String fname, String lname, String address) {
		super();
		this.id = id;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.fname.compareTo(o.fname);
	}
	
	
}
