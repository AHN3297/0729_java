package com.kh.homework.run;

import java.util.Scanner;

import com.kh.homework.vo.Fitness;

public class FitnessCareRun {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==헬스케어==");
		Fitness fit = new Fitness(); 
		
		System.out.print("이름을 입력해주세요 > ");
		fit.name = sc.nextLine();
		
		System.out.print("어떤운동을 하실지 입력해주세요 > ");
		fit.kind = sc.nextLine();
		
		System.out.print("BMI 수치를 입력해주세요 > ");
		fit.bmi = sc.nextInt();
		
		System.out.print("각 세트 사이의 휴식 시간을 입력해주세요 > ");
		fit.rest = sc.nextInt();
		
		System.out.print("총 운동시간을 입력해주세요 > ");
		fit.totaltime = sc.nextInt();
		
		
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("======================================");
			System.out.println("이름 : " + fit.name);
			System.out.println("BMI : " + fit.bmi);
			System.out.println("운동 : " + fit.kind);
			System.out.println("휴식 : " + fit.rest);
			System.out.println("총 시간 : " + fit.totaltime);
			System.out.println("======================================");
			fit.jogging();
			
			
			System.out.println("메뉴를 입력해주세요 >");
			System.out.print("1. 유산소 운동 / 2. 무산소 운동 / 3. 프로그램 종료 ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : fit.running();break;
			case 2 : fit.anaerobic();break;
			case 3 : exit = true;break;
			default : System.out.println("메뉴를 선택해주세요");
			
			}
		}
		
	}

}
