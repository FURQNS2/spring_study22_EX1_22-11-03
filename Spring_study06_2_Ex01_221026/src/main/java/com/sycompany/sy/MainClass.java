package com.sycompany.sy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 =ctx.getBean("student1", Student.class);
		
		System.out.println(student1.getName());  //홍길동
		System.out.println(student1.getAge());  // 30
		System.out.println(student1.getHobbys());   // [운동, 노래, 게임]
		System.out.println(student1.getWeight());   // 몸무게 80
		System.out.println(student1.getHeight());   //키 180
		
		Student student2 =ctx.getBean("student2", Student.class);
		
		System.out.println(student2.getName());  //홍길동
		System.out.println(student2.getAge());  // 30
		System.out.println(student2.getHobbys());   // [운동, 노래, 게임]
		System.out.println(student2.getWeight());   // 몸무게 80
		System.out.println(student2.getHeight());   //키 180
		
		
//		Student student3 =ctx.getBean("student1", Student.class);
//		
//		System.out.println(student3.getName());  //홍길동
//		System.out.println(student3.getAge());  // 30
//		System.out.println(student3.getHobbys());   // [운동, 노래, 게임]
//		System.out.println(student3.getWeight());   // 몸무게 80
//		System.out.println(student3.getHeight());   //키 180
		
		Student student4 =ctx.getBean("student4", Student.class);
		
		System.out.println(student4.getName());  // 을지문덕
		System.out.println(student4.getAge());  // 30
		System.out.println(student4.getHobbys());   // [기마술, 전력짜기]
		System.out.println(student4.getWeight());   // 몸무게 97
		System.out.println(student4.getHeight());   //키 180
		
		ctx.close();
	}

}
