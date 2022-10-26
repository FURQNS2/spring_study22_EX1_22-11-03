package com.sycompany.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	

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

	@Override
	public void destroy() throws Exception {   // 컨테이너 소멸 때 호출된다.
		// TODO Auto-generated method stub
		System.out.println("destroy 호출");
	}

	@Override
	public void afterPropertiesSet() throws Exception {  // 컨테이너에 담긴 만들어진 라이브러리와 bean을 호출
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet 호출");
				
	}

	
	
	
}
