package com.kh.chapter3.escape;
import java.util.Scanner;

public class A_Break {
	
	/*
	 * 
	 *  ** 주의사항 : switch문 내부에 있는 break문과는 구분을 해야할 필요가 ㅣㅇㅆ음
	 *  			switch문 내부에 있는 break는 switch문을 빠져나가는 용도로 사용
	 *  
	 *  
	 *  break : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나감
	 *  		break;문이 속해있는 반복문 "한 겹"만 빠져나감
	 */
	
	
	public void method1() {
		
		// 무한 반복하면서 랜덤한 정수 1~100를 생성해서 출력
		// 50이 생성되면 반복을 중단!
		
		while(true) {
			
			int num = (int)(Math.random() * 100) + 1;
			
			System.out.println(num);
			// 생성된 정수값이 50이면 멈춰
			
			if(num == 50) {
				System.out.println("멈춰");
				break;
			}
			
			
			
		}
		
	}
	public void method2() {
		
		// 무한반복하면서 사용자에게 매번 문자열을 입력받은 후
		// 해당 문자열의 길이를 출력
		// 단, 사용자가 입력한 문자열이 "exit"과 같다면 반복을 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아무거나 입력(종료를 원한다면'exit'을 입력) > ");
			String keyword = sc.nextLine();
			
			System.out.println(keyword + "은(는)"+ keyword.length() + "글자 입니다!");
			
			if(keyword.equals("exit")) {
				System.out.println("후로구래무를 종료합니다!");
				break;
			}
		}
			
	}
	
	// 매번 사용자로부터 정수값으 입력받고
	// 만약 입력한 숫자가 0보다 작으면 " 프로그램을 종료합니다"라는 문구를 출력하고 종료
	
	
	
	
	public void method2_2() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수값 입력해봐여(0보다작으면종료됨ㅇㅇ) >");
			int value = sc.nextInt();
			if(value < 0) {
				System.out.println("후로구래무를 종료합니다!");
				break;
			}
			
		}
		
	}
	
	/*
	 * 사용자로부터 한 개의 정수값을 입력받아서
	 * 입력받은 숫자부터 1까지의 모든 숫자를 출력해보아요
	 * 
	 * 단, 입력받는정수는1보다 커야한다.
	 * 
	 * 만약 1미만의 숫자를 입력받았으면 "1이상의 숫자를 입력해주세요"라고 출력한 뒤
	 * 다시 사용자에게 갑ㅅ을 입력받을 수 있도록
	 * 
	 * 출력 예시 )
	 * 1이상의 숫자를 입력하세요 > 
	 * 4 3 2 1
	 * 
	 * 1이상의 숫자를 입력하세요 > -1
	 * 1이상의 숫자를 입력하세요!!
	 * 1이상의 숫자를입력하세요 > 6
	 * 6 5 4 3 2 1
	 * 
	 * 
	 * 
	 */
	
	/*public void method4() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1이상의 숫자를 입력해보세요 > ");
			int num = sc.nextInt();
			if(num<1) {
				System.out.print("*!1이상의 숫자를 입력해주세요!*");
			}while(num < 1);
			for(;num > 0;num--) {
				System.out.print(num +" ");
				}
			}
		
	}
	*/
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 숫자를 입력해보세요 > ");
			
			int num = sc.nextInt();
			if(num > 1) {
				for(int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				
			}
		}
	}
}
