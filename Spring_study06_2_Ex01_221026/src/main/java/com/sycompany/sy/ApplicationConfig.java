package com.sycompany.sy;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration   // 지금부터 스프링 설정되는 클래스입니다.라고 명시해주는 것
@ImportResource("classpath:applicationCTX0.xml")
public class ApplicationConfig {

	@Bean   //	bean을 선언할 것이라고 알려줌 미리 알려주는 것
	public Student student1 () {
		
		ArrayList<String> hobbys = new ArrayList<String>();  //리스트 파일로 생성자에 넣는 방법(매우 중요!)
		hobbys.add("운동");
		hobbys.add("노래");
		hobbys.add("게임");
		

		Student student = new Student("홍길동", 30, hobbys);
		
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	
	}

	@Bean   //	bean을 선언할 것이라고 알려줌 미리 알려주는 것	
	public Student student2 () {
		
		ArrayList<String> hobbys = new ArrayList<String>();  //리스트 파일로 생성자에 넣는 방법(매우 중요!)
		hobbys.add("영화");
		hobbys.add("체육");
		hobbys.add("야구");
		
		Student student = new Student("김유신", 23, hobbys);
		
		student.setHeight(176);
		student.setWeight(83);
		
		return student;
	
	}
	
}
