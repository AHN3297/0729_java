package com.kh.homework.vo;

public class Fitness {
	public String name;
	public int bmi;
	public String kind;
	public int rest;
	public int totaltime;
	
	public void jogging() {
		if(bmi > 25) {
			System.out.println("BMI수치가 비만 수준입니다. 유산소를 선택해주세요");
		}
		
	}
	public void running() {
		System.out.println("유산소 운동을 시작합니다.");
	}
	public void anaerobic() {
		System.out.println("무산소 운동을 시작합니다.");
	}

}
