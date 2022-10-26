package com.sycompany.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Pencil pencil = ctx.getBean("pencil", Pencil.class); // 부모클래스로 값을 받아준다. 부모클래스는 자식클래스의 값을 받아줄 수 있다.
		
		pencil.use(); //추상메소드 호출
		
		

	}

}
