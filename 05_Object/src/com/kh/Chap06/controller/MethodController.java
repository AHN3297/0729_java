package com.kh.Chap06.controller;

public class MethodController {
	/*
	 * 메소드(Method) == 멤버 함수 : 입력값을 가지고 특정 동작을 수행한 뒤 결과물으 내놓ㄴㅡㄴ다.
	 * 
	 * 프로그래밍 언어에서의함수 : 특정 작업을 수행하기 위해서 만들어진 코드블록
	 * 1. 재사용성
	 * 2. 모귤화
	 * 
	 * 객체지향 프로그래밍에서의 메소드 : 객체가 수행할 수 이쓴행동을 정의한 코드블록
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * 
	 * [ 표현법 ]
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의자료형 매개변수식별자){
	 * 			수행할코드
	 * 			return 반환값;
	 * }
	 * 
	 * 생략가능 : 예약어, 매개변수, return(void일경우)
	 * 반환형 : return값의 자료형
	 * 호출할 때 메소드 전달 인자값 => 매개변수의 자료형과 개수가정확하게 일치해야함
	 * 
	 * 한 번 정의해두면 필요할때마다 언제든 호출가능
	 * 
	 * 
	 * 
	 */
	// 더하기를 해서 결과를 반환해주는 코드 블럭을 만들고 있다.
	public int add(int a, int b){ //메소드시그니처
		int sum = a + b;//본문
		return sum; //반환값
		
	}
	
	
	
	// 1. 매개변수가 존재하지 않고 반환값도 존재하지 않는 메소드
	public void method1() {
		
		System.out.println("매개변수와 반환값이 둘 다 존재하지 않는다.");
		
		//return;//클래스의 기본생성자같은거
		// returnType이 void일 경우 return문을 생략할 수 있다.
		
		//2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드	
	}
	//2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드
	public String method2() {
		System.out.println("매개변수는 존재하지만 반환값은존재한다.");
		return "returnValue";
	}
	public String method3() {
		return method2();
	}
	public void ptintln(String parameter) {
		System.out.println(parameter);
	}
	// 3. 매개변수는 존재하지만 반환값은 존재하지않는 메소드.
	/*public void setName(String name) {
		this.name = name;
	}
	*/
	public void method4(int num) {
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달받은값 + 100" + (num + 100));
		
	}
	public int method5(int num) {
		System.out.println("매개변수도있음, 반환값도 있음");
		return num + 50;
	}
	
	public void a() {
		System.out.println("메소드 a 호출");
		b();
	}
	public void b() {
		System.out.println("메소드 b 호출");
		a();
	}
	
	
	public void test(MethodController mc) {
		mc.method1();
	}
	
	public static void staticMethod() {
		System.out.println("스태틱 메소드");
	}
}

