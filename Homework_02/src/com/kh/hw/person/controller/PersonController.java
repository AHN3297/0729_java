package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	public static final int SIZE = 3;
	public static final int ESIZE = 10;
	private Student[] s = new Student[SIZE];
	private Employee[] e = new Employee[10];
	
	public int personCount() {
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				count++;
			}
		}
		return count;
		
	}
	public int EmployeeCount() {
		int ecount = 0;
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				ecount++;
			}
		}
		return ecount;
		
	}
	
	public void insertStudent(String name, int age, 
								double height, double weight, 
								int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				s[i] = new Student(name, age, height, weight, grade, major);
			break;
			}
			
		}
			
	}

}
