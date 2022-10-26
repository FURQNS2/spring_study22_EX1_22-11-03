package com.sycompany.testDI;


public class Calculator {

	public void add(int a, int b) {
		System.out.println("add 메소드 실행!");
		int c = a + b;
		System.out.println(a + " + " + b + "=" + c);
			
	}
	
	public void sub(int a, int b) {
		System.out.println("sub 메소드 실행!");
		int c = a - b;
		System.out.println(a + " - " + b + "=" + c);
			
	}
	
	public void mul(int a, int b) {
		System.out.println("mul 메소드 실행!");
		int c = a * b;
		System.out.println(a + " * " + b + "=" + c);
			
	}
	
	public void div(int a, int b) {
		System.out.println("div 메소드 실행!");
		double c = a / b;
		System.out.println(a + " / " + b + "=" + c);
			
	}
}
