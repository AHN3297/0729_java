package com.kh.homework.run;

import java.util.Scanner;

import com.kh.homework.vo.Tree;

public class TreeCareRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==나무관리==");
		Tree tree = new Tree(); 
		
		System.out.print("나무 이름을 입력해주세요 > ");
		tree.name = sc.nextLine();
		
		System.out.print("물을 준지 얼마나 지났는지 입력해주세요(일) > ");
		tree.water = sc.nextInt();
		
		System.out.print("식물영양제의 이름을 입력해주세요 > ");
		tree.plantfood = sc.nextLine();
		
		System.out.print("농약을 친지 얼마나 지났는지 입력해주세요(일) > ");
		tree.pesticide = sc.nextInt();
		
		System.out.print("식물이 얼만 있는지 입력해주세요 > ");
		tree.howmany = sc.nextInt();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("======================================");
			System.out.println("식당 이름 : " + tree.name);
			System.out.println("메뉴 : " + tree.water);
			System.out.println("음료 : " + tree.plantfood);
			System.out.println("후식 : " + tree.pesticide);
			System.out.println("방문예정시각 : " + tree.howmany);
			System.out.println("======================================");
			
			
			
			System.out.println("메뉴를 선택해주세요 > ");
			if(tree.water > 7) {
				System.out.println("식물에게 물을 안준지 7일이 넘어갑니다! 식물을 확인해주세요!");
			}
			if(tree.pesticide > 10) {
				System.out.println("식물에게 농약을 안친지 10일이 넘어갑니다! 식물을 확인해주세요!");
			}
			System.out.print("1. 물주기 / 2. 농약 치기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1 : tree.giveWater();break;
			case 2 : tree.givePesticide();break;
			case 3 : exit = true;break;
			default : System.out.println("메뉴를 다시 선택해주세요");
			
			}
		}
	}

}
