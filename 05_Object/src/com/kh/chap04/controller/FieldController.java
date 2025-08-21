package com.kh.chap04.controller;
/*
 * 필드(field) == 멤버 변수 == 인스턴스 변수
 * 
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 내부에 정의하지만 메소드영역 밖에 존재
 * 
 * 
 * 변수 구분
 * -field : 클래스 블록(Scope)에 바로 선언하는 변수!
 * -(local) variable : 클래스영역 내부에 특정한 구역에서 선언됨({})
 * 						=> method, for, if 등등
 * 
 * 
 * 1. 전역 변수의 역할을 하는 친구들
 * - 필드(멤버 변수, 인스턴스변수) :
 * 							  생성시점 => new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당
 * 							  소멸지점 => 객체가 소멸될 때 사라진다.
 * 									 => G.C가 일을 안하면 OOM(Out Of Memory) 발생
 * 
 * - 클래스 변수(static) : static이라는 예약어가 붙어있는 변수
 * 						생성 시점 : 프로그램 시작과 동시에 static영역에 올라감
 * 						소멸 시점 : 프로그램 종료되면 소멸
 * 2. 지역 변수
 * 			생성 시점 : 특정 영역{()}내부에서 시점에 메모리 영역에 할당 -> stack
 * 			소멸 시점 : 특정 영역{()}이 종료될 때
 * 
 * 
 */

public class FieldController {
	
	
	// 필드 선언
	public int global;
	public void checkVariable(int parameter) {
		int local = 1; // 지역변수 특 : 초기화 안하면 사용할 수 없음
		
		System.out.println(global); //필드
		System.out.println(parameter);//매개변수
		System.out.println(local);//지역변수
	}

}
