package com.kh.homework.run;

import java.util.Scanner;
import com.kh.homework.vo.Restaurant;

public class RestaurantCareRun {
	public static void main(String[] args) {
		
		// 레스토랑 이름을 입력받고
		// 해당레스토랑의 주문을 미리 입력하여
		// 예약할 수 있는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==식당예약==");
		Restaurant res = new Restaurant(); //식당 속성 저장소
		
		System.out.print("식당 이름을 입력해주세요 > ");
		res.name = sc.nextLine();
		
		System.out.print("주문하실 메뉴를 입력해주세요 > ");
		res.menu = sc.nextLine();
		
		System.out.print("주문하실 음료를 입력해주세요 > ");
		res.drink = sc.nextLine();
		
		System.out.print("주문하실 후식을 입력해주세요 > ");
		res.desert = sc.nextLine();
		
		System.out.print("방문시간을 입력해주세요 > ");
		res.opentime = sc.nextInt();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("======================================");
			System.out.println("식당 이름 : " + res.name);
			System.out.println("메뉴 : " + res.menu);
			System.out.println("음료 : " + res.drink);
			System.out.println("후식 : " + res.desert);
			System.out.println("방문예정시각 : " + res.opentime);
			System.out.println("======================================");
			res.open();
			
			
			System.out.println("리뷰 이벤트 참여 > 1.Yes / 2. No / 3. Exit");
			int num = sc.nextInt();
			switch(num) {
			case 1 : res.reviewOk();break;
			case 2 : res.reviewNo();break;
			case 3 : exit = true;break;
			default : System.out.println("방문하실 식당을 다시 입력해주세요");
			
			}
		}
		
	}

}
