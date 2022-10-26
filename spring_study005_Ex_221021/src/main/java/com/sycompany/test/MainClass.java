package com.sycompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	

		
		
// 방법2		Student stu = new Student("홍길동","30","3학년","3반");

// 방법1		
//		String name = stu.setName("홍길동");
//		String age = stu.setAge("30");
//		String gradenum = stu.setGradeNum("3학년");
//		String classnum = stu.setClassNum("3반");
		
		
		
		
		
		
		
		AbstractApplicationContext ctx =new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		StudentInfo stuInfo1 = ctx.getBean("studentInfo1", StudentInfo.class);	
		stuInfo1.getStudentInfo();
		
		StudentInfo stuInfo2 = ctx.getBean("studentInfo2", StudentInfo.class);
		stuInfo2.getStudentInfo();
		
		
		Student stu1 = ctx.getBean("stu1",Student.class);
		stuInfo2.setStudent(stu1);
		stuInfo2.getStudent();
		
		ctx.close();
		
	}

}
