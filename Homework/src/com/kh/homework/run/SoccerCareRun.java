package com.kh.homework.run;

import java.util.Scanner;

import com.kh.homework.vo.Soccer;

public class SoccerCareRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("==축구장예약==");
		Soccer s = new Soccer(); 
		
		System.out.print("경기장을 입력해주세요 > ");
		s.name = sc.nextLine();
		
		System.out.print("팀이름을 입력해주세요 > ");
		s.tim = sc.nextLine();
		
		System.out.print("멤버 수를 입력해주세요 > ");
		s.member = sc.nextInt();
		
		System.out.print("유니폼색상을 입력해주세요 > ");
		s.color = sc.nextLine();
		
		System.out.print("경기장 대여 시각을 입력해주세요(1시간 기준 예 : 17 -> O, 17시 15분 -> X) > ");
		s.time = sc.nextInt();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("======================================");
			System.out.println("구장 이름 : " + s.name);
			System.out.println("팀 이름 : " + s.tim);
			System.out.println("멤버 수 : " + s.member);
			System.out.println("유니폼색상 : " + s.color);
			System.out.println("대여시각 : " + s.time);
			System.out.println("======================================");
			
			
			
			System.out.println("메뉴를 선택해주세요 > ");
			if((s.member <8) || (s.member>30) ) {
				System.out.println("인원이 너무 적거나 너무 많습니다!!");
			}
			
			System.out.print("1. 예약하기 / 2. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1 : s.succes();break;
			case 2 : exit = true;break;
			default : System.out.println("메뉴를 다시 선택해주세요");
			
			}
		}
	}

}
