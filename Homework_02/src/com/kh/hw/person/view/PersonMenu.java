package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.*;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	int count = pc.personCount();
	int ecount = pc.EmployeeCount();
	
	public void mainMenu() {
		System.out.println("학생은 최대 " + pc.SIZE+"명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + count + "명 입니다.");
		System.out.println("사원은 최대 " + pc.ESIZE + "명까지 저장할 수 있습니다." );
		System.out.println("현재 저장된 사원은 "+ ecount + "명 입니다.");
		
		while (true) {
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 프로그램종료");
			System.out.println("=====================");
			System.out.print("메뉴선택 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
				case 9:
					System.out.println("프로그램을 종료합니다.");
                    return;
			}
		}
			
		}
		
	public void studentMenu() {
		while (true) {
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 학생 추가");
			System.out.println("2. 사원 추가");
			System.out.println("9. 메인메뉴로 돌아가기");
			System.out.println("=====================");
			System.out.print("메뉴선택 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
				case 1:
					insertStudent();
					break;
				case 2:
					insertEmployee();
				case 9:
					System.out.println("메인메뉴로 돌아갑니다.");
                    return;
			}
		}
		
	}
	public void  employeeMenu() {
		while(true) {
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.println("=====================");
			System.out.println("메뉴선택 : ");
			
			
		}
		
	}

}
