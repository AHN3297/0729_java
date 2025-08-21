package com.kh.chapter01.condition;
import java.util.Scanner;

public class A_If {
	
	public void method4() {
		
		System.out.println("술집 메뉴판");
		System.out.println("1. 맥주 (5000)");
		System.out.println("2. 소주 (3000)");
		System.out.print("메뉴 번호를 선택해주세요 >");
		
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		
		System.out.print("몇 잔 주문하실건가요 > ");
		int cup = sc.nextInt();
		
		String menuName = "";
		if(menuNo == 1) menuName = "맥주";
		if(menuNo == 1) menuName = "맥주";
		if(!(menuNo == 1) &&! (menuNo == 2)) menuName = "맥주";
		
		System.out.println("주문내역");
		System.out.println();
		System.out.println(menuName + "를" + cup + "잔 주문하셨습니다.");
		System.out.println();
		System.out.println("===================================");
		
		System.out.print("\n위 주문내역으로 주문하기셌습니까 (Y/N) >");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		
		if(answer == 'Y' || answer == 'y') {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3000;
			
		}
		
	
		
	}

}
