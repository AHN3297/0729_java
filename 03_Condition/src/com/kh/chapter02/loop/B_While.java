package com.kh.chapter02.loop;

public class B_While {
	public void lotto() {
		
		// 로또 번호 생성기 ver_0.1
		// 범위 : 1~45
		// 6개 선택
		
		//(Math.random() * 45)
		//0.0 ~44.9999999999999
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println("이번주는 이걸로 사야겠다 >");
		System.out.printf("%d, %d, %d,%d, %d, %d,",num1, num2, num3, num4, num5, num6);
		}
	
	/*
	 * do - while
	 * 
	 * 별도의 조건검사 없이 무조건 한 번은 실행
	 * 조건이 true값이 아니더라도 한 번은 꼭 수행
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; //필수 x
	 * 
	 * do {
	 * 		실행할코드;
	 * 		증감식; // 필수 x
	 * } while(조건식);
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public void method5() {
		/*while(false) {
			System.out.println("????");
		}
		*/
		do {
			System.out.println("나는 한 번은 돌아");
		} while(false);
	}
	

}
