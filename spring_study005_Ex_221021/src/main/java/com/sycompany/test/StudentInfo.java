package com.sycompany.test;

public class StudentInfo {

	private Student student;  //클래스를 멤버변수로 선언

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() { //컨테이너 안에 application 초기화값 불러오기
		System.out.println("이름: " + student.getName());
		System.out.println("나이: " + student.getAge());
		System.out.println("학년: " + student.getGradeNum());
		System.out.println("반: " + student.getClassNum());
		
	}
	
}
