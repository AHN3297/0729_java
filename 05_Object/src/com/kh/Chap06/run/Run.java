package com.kh.Chap06.run;
import com.kh.Chap06.controller.MethodController;
import com.kh.Chap06.controller.OverloadingController;

import java.util.Arrays;

import com.kh.Chap06.controller.Human;

public class Run {
	public static void main(String[] args) {
		//Human human = new Human();
		MethodController mc = new MethodController();
		//int a = mc.add(1,  2);
		//int[] dd = new int [3];
		//mc.method1();
		//mc.method2();
		//String returnValue = mc.method2();
		//System.out.println(mc.method2());
		//System.out.println(returnValue);
		//mc.ptintln("method3 호출결과 : "+ mc.method3());
		//String parameter = "method3 호출결과 : " + mc.method3();
		//mc.method4(0);
		
		//int resulr = mc.method5(5);
		//System.out.println(result);
		//mc.a();
		//MethodController mc = mc;
		
		//=======매우 중요========
		//mc.test(mc);
		//복습하자
		
		// 객체를 생성하지 않고 메서드를 호출 할 수 있음
		
		/*
		Math.random();
		int[] arr = {2,3};
		System.out.println(Arrays.toString(arr));
		MethodController.staticMethod();
		*/
		
		//mc.haha();
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라");
		System.out.println(mc);
		System.out.println();
		*/
		
		OverloadingController oc = new OverloadingController();
		
		// 정적 바인딩(static Binding)
		// 컴파일이 끝난시점 어떤메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출
		oc.test();
		oc.test(2);
		oc.test("3");
		oc.test(1,2);
		oc.test(2, "sdf");
		oc.test("sda", 2);
		
	}

}
