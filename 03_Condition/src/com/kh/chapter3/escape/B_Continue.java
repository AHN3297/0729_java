package com.kh.chapter3.escape;

import java.util.Scanner;

public class B_Continue {
	/*
	 * continue : 반복문안에서 사용하는 문법
	 * 
	 * continue문을 만나면continue이후에 어떤 코드가 존재하던 실행하지않고 pass
	 * 반복문scope최상단으로 올라가는 것을 의미
	 * 
	 */
	
	public void method1() {
		//1부터 10까지반복을하면서정수값을 출력
		for(int i =1; i <=10; /*i+=2*/i++) {
			//if(i%2==2)
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입입니다.");
		
		while(true){
			System.out.println("아이디를 입력해주세요(10자이하) > ");
			String userId = sc.nextLine();
			if(userId.length()> 10) {
				System.out.println("아이디는 10자이하만 사용가능합니다.");
				continue;
			}else {
				System.out.println("사용가능한 아이디입니다.");
				break;
			}
		
		}System.out.println("anything");
	}

}
