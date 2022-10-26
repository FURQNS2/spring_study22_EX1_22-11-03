package com.sycompany.test;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Myinfo {

	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;        //빈 리스트형태
	private BMICalculator bmicalculator;      //클래스값 멤머변수로 가져오기
	
	public void bmicalculation() {   //메서드 생성
		bmicalculator.bmiCalculator(weight, height);     //멤버변수.클래스(몸무게, 키)
	}
	
	public void getInfoOutput() {   //메서드 생성
		System.out.println("내 이름: "+ name);
		System.out.println("키: "+ height);
		System.out.println("몸무게: "+ weight);
		System.out.println("취미: "+ hobbys);
		bmicalculation();  //메서드 호출
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public void setBmicalculator(BMICalculator bmicalculator) {
		this.bmicalculator = bmicalculator;
	}
	
}
