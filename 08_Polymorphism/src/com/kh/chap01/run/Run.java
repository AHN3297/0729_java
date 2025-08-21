package com.kh.chap01.run;

import com.kh.chap01.model.vo.*;

public class Run {
	/*
	 * 상속이란 무엇인가
	 * 필드 / 메소드 => 별로 안중요함
	 * 
	 * 자식 클래스는 부모클래스의 자료형을 받는다.
	 * 중요*******************************************중요
	 * 					타  		입
	 * 중요*******************************************중요
	 * 
	 */

	public static void main(String[] args) {
		// 1. 부모타입 자료형으로 부모 타입 객체를 다룸
		Parent p1 = new Parent();
		p1.printParent();
		//p1.printChild1(); 자식이 가지고 있는 멤버는 부모가 사용할 수 없음
		// p1 변수로는 Parent에만 접근이 가능
		
		//2. 자식 타입 자료형으로 자식 타입객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		//c1변수로는 Chil1,Paren랑 둘 다 접근가능
		
		
		// = <-- 얘를 기준으로 양변의 자료형이 같아야한다.
		//3. 부모 타입 자료형으로 자식 타입 객체를 다룸
		Parent p2 = /*(Parent)*/new Child1();
		p2.printParent();
		//p2.printChild1();
		// p2 로는Parent타입만 접근할 수있음
		
		
		// 양쪽의 자료형이 다름에도 불구 하고 에러가 발행하지않는이유는
		//클래스 형변환이 일어났기때문
		
		/*클래스 형 변환
		 * 
		 * "상속 구조"일경우에만 가능
		 * 
		 * 1. Up Casting
		 * 자식 타입 => 부모타입
		 * 생략이가능함
		 * 
		 * 
		 * 2. Down CAsting
		 * 부모타입 => 자식타입
		 * 생략이 불가능하다.
		 * 
		 * 
		 * 
		 */
		((Child1)p2).printChild1();
		
		//Child1타입의 객체 두 개
		//Child2타입의 객체 두 개
		// 총 네 개의 객체를 다뤄볼것
		/*
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		*/
		
		// 배열 사용
		// 배열 == 한 종류의 자료형인값들을 묶어서 관리할 수 있다.ㅣ
		/*
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[0] = new Child2();
		*/
		System.out.println("\n\n\n다형성을 적용해보자.");
		Parent[]arr = new Parent[4];
		arr[0] = (Parent)new Child1();
		arr[1] = (Parent)new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		
		//arr[0].printChild1();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].printParent();
		}
		System.out.println("\n\n\n\n");
		for(int  i = 0; i<arr.length; i++) {
			/*
			if(i == 0 || i== 3) {
				
				((Child1)arr[i]).printChild1();
			}else((child2)arr[i]).printChild2();
			*/
			/*	
			if (arr[i] instanceof Child1) {
					// instanceof => true/flase
					// 현재 참조변수가 실질적으로 어떤 클래스 타입을 참조하고 있는지 확인할 때사용
					((Child1)arr[i]).printChild1();
				}else {
					((Child2)arr[i]).printChild2();
				}
				*/
			arr[i].print();
			// 부모클래스머시기 X 4
			
			/*
			 * 동적바인딩 : 프로그램 :실행 전 " 컴파일 시저에 정적바인딩 수행(자료형의 메소드를 가리킴)
			 * 				실질적으로 참조하고 있는 개체가 해당 메소드를 오버라디잏ㅆ다면
			 * 				프로그램"실행 시점" 동적으로 자식 클래스의 오버라인딩된 메소드를 실핼
			 *					 	(Runtime) 
			 * 다형성 : 부모클래스 자ㅛㄹ형으로에러 자식클래스를 다루는 기술
			 */
		}
	}

}
