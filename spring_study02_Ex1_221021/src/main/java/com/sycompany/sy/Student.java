package com.sycompany.sy;

public class Student {

	public String name;
	public int age;
	public int gradeNum;
	public Score score;
	
	public void scoreTest() {
		Score score = new Score(100, 30);
		this.score = score;
	}
	
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	
	
	
	
	
	
	
	
	

	
}
