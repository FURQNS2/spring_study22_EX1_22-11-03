package com.sycompany.testDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
		//기존방법
//		MyCalculator mycalcu = new MyCalculator();
//		
//		Calculator calcu = new Calculator();
//		
//		mycalcu.setA(20);
//		mycalcu.setB(10);
//		mycalcu.setCalculator(calcu);
//		
//		mycalcu.addtion();
//		
//		mycalcu.subtration();
//		mycalcu.multiplication();
//		mycalcu.division();
				
		
		
		//스프링 DI설정 적용(만들어져있는 내용을 가져와서 사용)
		String configLocation = "classpath:applicationCTX.xml";  //불러오는곳
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator mycalcu = ctx.getBean("mycalcu", MyCalculator.class);

		mycalcu.addtion();		
		mycalcu.subtration();
		mycalcu.multiplication();
		mycalcu.division();

		ctx.close();
		
	}

}
