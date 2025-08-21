package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자 : 피 연산자가 3개 => 값 3개와1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 			결과값이 true일 경우 첫 번째 문장을 처리
	 * 			결과값이 false일 경우 두 번째 문장을 처리
	 * 
	 * [ 표현식 ]
	 * 조건식 ? 조건식 true일  셩우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 * 
	 */
	
	// 원섬후레이스
	public void method1() {
		System.out.println("시즌 메뉴");
		System.out.println("1. 아메리카노");
		System.out.println("2. 더 멜론 오브 멜론 프라푸치노");
		System.out.println("3. 봄봄 어른커피");
		// 메뉴 번호 가지고 메뉴 받기
		
		// ctrl + shift + o(import 자동완성 단축키)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		String selectedMenu = (menuNo == 1)
							? "아메리카노를 주문하셨습니다."
							: "1번아닌거 시킴";
		System.out.println(selectedMenu);	
	}

}
