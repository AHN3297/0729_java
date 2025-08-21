package com.kh.hw.person.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height,double weight,int grade, String major) {
		
		this.grade = grade;
		this.major = major;
	}
	
	//get
	
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
	//set
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return major;
	}
}
