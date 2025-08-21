package com.kh.chapter01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if ~else
	 * 
	 *  [표현법]
	 *  
	 *  if(조건식) {
	 *  		조건식의 결과가 true였을 때 실행할 코드  	-a
	 * } else {
	 * 		조건식의 결과가 false였을 때 실행할 코드		-b
	 * }
	 * 
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 flase일 경우 b를 실행
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		// 사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 루 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0보다 큼ㅇㅇ");
			
		} else {
			System.out.println("0보다 크진않음;;");
		}
		
		// if 문의 조건식의 결과가 true일 셩우 => else 블럭을 건너 뜀
		// 불필요한 연산이 줄어듬 => 처리속도가 향상
	}
	
	
	/*if ~else if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식1) {
	 * 		조건식1이 true일 경우 실행할 코드
	 * }else if(조건식2) {
	 * 		조건식2가 true일 경우 실행할 코드
	 * }else if(조건식3) {
	 * 		조건식이3이 true일 경우 실행할 코드
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드
	 * }
	 * 
	 * 
	 */
	
	public void method2( ) {
		
		// 정수를 입력받아서 0 보다 큰지 / 0인지/ 0보다 작은지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력");
		int num = sc.nextInt();
		
		// if(num > 0) System.out.println("0보다큼");
		// if(num == 0) System.out.println("0임");
		// if(num < 0) System.out.println("0보다작음");
		
		if (num == 0 ) {
			System.out.println("0임");
		} else if (num>0) {
			System.out.println("0임");
		} else if (num < 0) {
			System.out.println("0보다작음");
		}
		
		
		
	}
	
	public void ageCheck() {
		/* 사용자에게 나이(정수)를 입력받고
		 * 입력받은 나이에 따라서 각기 다른내용을 출력
		 * 1~12 : 어린이
		 * 13~17 : 청소년
		 * 18~ : 성인
		 * 0,- : 외계인
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("님 몇살임? >");
		int age = sc.nextInt();
		
		if( (1 <= age) && (age< 12) ) {
			
			System.out.print("잼민이");
		} else if ((13 <= age) && (age< 17)){
			System.out.print("급식이");
		} else if (age >= 18) {
			System.out.print("으른");
		} else {
			System.out.print("외계인");
		}
			
				
	}
	
	
	
}
