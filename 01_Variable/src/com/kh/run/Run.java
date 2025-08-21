package com.kh.run;

import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;
public class Run {
	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드 호출
		// 클래스이름 클래스별칭 = new 클래스이름();
		com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		// a.findSeasonMenu();
		// a.declareVariable();
		
		// com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput();
		
		//B_KeyboardInput b = new B_KeyboardInput();
		// import쓰지 않으면 실수 할 확률 올라감
		// 효율이 떨어짐 -> 생산성이 떨어짐
		//b.inputTest();
		Casting C = new Casting();
		//C.autoCasting();
		C.forceCasting();
		
		
	}

}
