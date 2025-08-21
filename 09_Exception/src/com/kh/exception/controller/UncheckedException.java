package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * RuntimeException
	 * 
	 * - NullpointerException : 주소값 객체를 참조했더니 null값이 들어있을경우 발생하는 예외
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * - NegativeArraySizeException : 배열을 할당할 때 크기를 음수로 지정하면 발생하는 예외 
	 *  '''
	 *  RunTimeException과 관련된 예외들은 공통점이 있음
	 *  개발자가 예측이 가능함
	 * 
	 * 
	 * 
	 */
	// ArithmeticException
	public void method1() {
		//사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요 (0입력하면 파업함)> ");
		int num2 = sc.nextInt();
		// 방법 1. 예외발생 자체를 완전 차단해버림
		/*
		if(num2 != 0) {
			System.out.println("연산결과 : " + (num1 / num2));
		}else {
			System.out.println("그거 쓰면안됨;;");
		}*/
		// 방법 2. 예외처리를 진행
		
		// 예외처리 : 
		// 예외상황을 감지하고 예외상황 발생 시
		//프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조치를 취하는것
		
		/*
		 * try ~ catch문
		 * [ 표현법 ]
		 * 
		 * try{
		 * 		(num1 / num2) // 예외가 발생할 수도 있는 구문
		 * }catch(발생할예외클래스며 변수명) { => 매개변수
		 * 		해당예외가 발생했을때 실행할 구문
		 * }
		 */
		
		
		try {
			System.out.println(num1/num2);
			
		} catch(ArithmeticException e) {
			
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수가 없습니다.");
		}
		System.out.println("프로그램 종료");
		
	}
	public void homework() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 추가하기");
			System.out.println("2. 검색하기");
			int menuNo = 0;
			try {
				
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요");
			
				// 예외처리 시 catch문에 적어야하는 내용이 출력문은 아님
			}
			sc.nextLine();
			System.out.println(menuNo +"번 메뉴를 선택하셨습니다." );
		}
	}
	
	public void method2() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요(0은제외) > ");
		try {
			
			int num = sc.nextInt();
			// InputMismatchException
			System.out.println("100을 입력값으로 나눈 결과 : " + 100/num);
			// ArithmeticException
			
			System.out.println("프로그램종료");
		}catch(InputMismatchException e) {
			System.out.println("숫자로 된 값이 아니다.");
		
		}catch(ArithmeticException e) {
			
		}
	}
	
	
	
	public void method3() {
		//배열
		
		//사용자에게 정수값을 입력받아서
		// 입력받은 만큼의 크기르 가진 배열으  생성 및 할당
		// 100번째 인덱스값을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		
		// InputMismatchException : 스캐너 메소드의 자료형과 일치하지않음
		// NegativeArraySizeException : 배여르이 크기를 음수로 지정하면파업
		// ArrayIndexoutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면 파업
		try {
			
			int num = sc.nextInt();
			int [] arr = new int[num];
			System.out.println(arr[100]);
		}catch(InputMismatchException e) {
			System.out.println("정수넣어라");
		}catch (RuntimeException e){
			System.out.println("음수를 입력하거나 100보다 커서?");
		/*	
		}catch(NegativeArraySizeException e) {
			System.out.println("음수를 입력하거나 100보다 커서?");
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		*/
	}

	}
	}
