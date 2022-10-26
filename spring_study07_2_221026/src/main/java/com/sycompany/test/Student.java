package com.sycompany.test;

public class Student {

	private String name;
	private int age;

	
	public Student() {   //빈 생성자
		super();
		
	}
	
	public Student(String name, int age) {  //매개변수 있는 생성자
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
