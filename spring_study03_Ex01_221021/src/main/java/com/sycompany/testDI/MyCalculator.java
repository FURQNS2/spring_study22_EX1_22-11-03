package com.sycompany.testDI;

public class MyCalculator {
	
	private int a;
	private int b;
	Calculator calculator;  //멤버변수
	
	public void addtion() {
		calculator.add(a, b);
	}
	
	public void subtration() {
		calculator.sub(a, b);
	}
	public void multiplication() {
		calculator.mul(a, b);
	}
	public void division() {
		calculator.div(a, b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

		
	
}
