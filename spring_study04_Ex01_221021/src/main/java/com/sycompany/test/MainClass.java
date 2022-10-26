package com.sycompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Myinfo myinfo1 = ctx.getBean("myInfo1", Myinfo.class);    //변수 선언	
		myinfo1.getInfoOutput();   //MyInfo클래스에서 getInfoOutput 메소드를 불러옴

		Myinfo myinfo2 = ctx.getBean("myInfo2", Myinfo.class);    //변수 선언	
		myinfo2.getInfoOutput();   //MyInfo클래스에서 getInfoOutput 메소드를 불러옴
		
		
		
		ctx.close();
		

	}

}
