package com.kh.array;

import java.util.Arrays;

public class Array {

	// 변수(variable)
	// 변수란?
	//메모리(RAM) 공간에 DATA(VAlUE)값을 저장하는 공간
	
	// 변수의 특징
	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다.
	// 4. 지역변수의 경우 메모리의 Stack영역에 올라간다.
	// 5. 하나의 변수공간에는 하나의 값만 대입될 수 있다.
	// 6. 초기화를 해야만 사용이 가능하다.
	// 7. 초기화는 한 번만 가능하다.
	// 8. 자료형은 크기가 정해져있다.
	// 9. 자료형끼리의 변환이 가능하다.
	// 10. 선언된 Scope안에서만 사용이 가능하다.
	// 11. 변수끼리 연산도 가능하다.
	
	/*
	 * 매열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음.
	 * 				단, "같은 자료형의 값들"만 담을 수 있음
	 * 				동종 모음(homogegeous collection)이라고도 함
	 * 
	 * 				자바라는'언어 자체에 내장된' 유일한 자료구조
	 * 
	 * 				=> 배열의 각 인덱스에 실제 값이 담김
	 * 					index는 '0'부터 시작한다.
	 * 
	 */
	
	
	
	
	
	public void method1() {
		
		//임의의 정수 4개를 선언하고 초기화를 진행하자
		
		/*
		int num1 = 12;
		int num2 = 5;
		int num3 = 7;
		int num4 = 45;
		int num5 = 35;
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		
		
		
		System.out.println(sum);
		*/
		
		// 배열
		
		// 1. 배열 선언
		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수식별자;
		 * 
		 * 배열선언방법
		 * 
		 * 1) 자료형 배열식별자[];
		 * 2) 자료형[] 배열식별자; --> 이 방법 사용
		 * 
		 * 
		 */
		
		// 변수 선언
		//int num;
		
		// 배열 선언
		//int [] nums;
		
		//int[] nums = 0;
		
		// 2. 배열 할당
		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 *  int[] numbers; // 배열 선언
		 * numbers = new int[5]; // 할당
		 * 
		 * int[] arr = new int[5]; //선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형.(주소값)
		 * 
		 */
		
		// int[] nums = new int[2];
		//nums라는 정수형 배열을 선언하고 5칸 할당받아보기
		int[] nums = new int [5]; //동적할당이라고도한다.
		
		// 3. 배열의 각 인덱스에 값 대입
		
		/*
		 * [ 표현법 ]
		 * 배열 식별자 [인덱스] = 값;
		 * 
		 * 
		 */
		
		nums[0] = 15;
		nums[1] = 33;
		nums[2] = 6;
		nums[3] = 2;
		nums[4] = 66;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		int sum = 0;
		for(int i =0; i<5;i++) {
			sum+= nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능
			
	}
	
	
	
	
	
	
	
	
	public void methodA() {
		// 배열 공부
		// 1. 배열 선언 및 할당
		
		int[] integers = new int[3];		// 0, 1, 2
		double[] doubles = new double[2];	// 0, 1
		
		// 배열식별자.length : 배열의 크기(길이) => 정수
		
		System.out.println(integers.length);
		System.out.println(doubles.length);
		
		int i;
		//System.out.println(i); error code : localvariable 초기화를 진행하지 않으면 사용할 수 없음
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]);
		
		/*
		 * 기본자료형 : boolean, char, byte, shortm intm lingm float, double
		 * 				=> 변수 공간에 실제 값을 바로 담을 수 있음 : (지역(scope))변수
		 * 
		 * 참조자료형 : boolean[], cjar[], byte[], int[], ... String
		 * 				=> 주소값을 담고있는 변수 : 참조변수(래퍼런스)
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		 * 연결이 끊긴 기존의 배열은
		 * 일정시간이 지나면 GC가 알아서 삭제 해준다. : 자동 메모리 관리
		 * 
		 * 기존배열식별자에 할당만 새롭게 한다면
		 * => 기존 참조하고 있던 연결이 끊기고 새로운배열을 참조함
		 * 
		 * 
		 */
		
		/*
		 * 기본값
		 * 
		 * 정수 = 0
		 * 실수 0.0
		 * 문자 =''
		 * 
		 * 참조자료형 = null
		 * 
		 * 참조자료형에는null이라는 값이 들어감
		 * 주소값이 존재하는가 그렇지 않은가
		 * 연결고리 끊을때는 
		 * 
		 * 배열이름 = null
		 * 
		 * 
		 * 
		 */
		
		
		/*
		 * 배열 복사
		 * 
		 * 1. 얕은 복사
		 * 
		 * 2. 깊은 복사
		 * 
		 * 
		 * 
		 */
		
		
		
		
			
		}
	public void methodF() {
		int[] origin = {1, 2, 3, 4, 5,};
		System.out.println(Arrays.toString(origin));
		
		// 얕은 복사로 배열을 복사
		
		int [] copy = origin;
		
		System.out.println(Arrays.toString(copy));
		
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		// 얕은 복사 => 주소값을 대입하는것이기 때문에 가리키고 있는 대상이 같다.
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());	
		
	}
	
	public void methodG() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[6];
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		*/
		for(int i = 0; i < origin.length; i++) {
			
			copy[i] = origin[i];
		}
		
		// 배열의 깊은 복사의 경우 기존배열의 크기보다 큰 배열로복사하는 경우가 많음
		// alt + 방향키 위, 아래(행 이동)
		// ctrl + alt + 방향키 위, 아래(행 복사) <= 얘는 당분간 쓰지말기
		// ctrl +shift +f(코드 정리)
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		
		int[] copy2 = new int[10];
		System.arraycopy(origin, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스 / 인터페이스
		 * arraycopy() == System클래스
		 * 
		 * 
		 * System.arraycopy(원본배열 식별자, 원본배열에서 복사를 시작할 인덱스,
		 * 					복사본 배열 식별자, 복사본 배열에서 복사가 시작될 인덱스,
		 * 					복사할 개수);
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		// Arryas클래스에서 제공하는 copyOf()
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}
	
	
}
