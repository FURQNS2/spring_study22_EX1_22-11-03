package com.sycompany.test;

public class BMICalculator {
	
	private double normal;  //정상
	private double lowWeight;//저체중  
	private double overWeight; //과체중
	private double obesity; //비만
	
	
	public void bmiCalculator(double weight, double height) {
		// BMI=(몸무게/(키*0.01))^2
		
		 double h = height * 0.01;
		 double bmiResult = weight/(h * h);
			
		 System.out.println("당신의 BMI 지수:" + bmiResult);
		
		 if(bmiResult>obesity) {
			 System.out.println("비만");					 
		 }else if (bmiResult> overWeight) {
			 System.out.println("과체중");			  
		 }else if (bmiResult>normal) {
			 System.out.println("정상체중");			
		 }else {
			 System.out.println("저체중");
			 
		 }
		 
		 
	}


	public void setNormal(double normal) {
		this.normal = normal;
	}


	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}


	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}


	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
}
