package com.kh.homework.run;

import java.util.Scanner;

import com.kh.homework.vo.Clothes;

public class ClothesRun {
	public static void main(String[] args) {
		Clothes clothes = new Clothes();
		// System.out.println(clothes.info());
		Scanner sc = new Scanner(System.in);

		System.out.print("어떤 옷인이 알려주세요 (예 : 반바지) > ");
		String name = sc.nextLine();
		clothes.setName(name);

		System.out.print("어떤 색인지 입력해주세요 > ");
		String color = sc.nextLine();
		clothes.setColor(color);

		System.out.print("어떤 성별의 옷인지 입력해주세요 > ");
		String gender = sc.nextLine();
		clothes.setGender(gender);

		System.out.print("어떤 옷감의 옷인지 입력해주세요 >");
		String fabric = sc.nextLine();
		clothes.setFabric(fabric);

		System.out.print("사이즈를 입력해주세요(예 : 100) > ");
		int size = sc.nextInt();
		clothes.setSize(size);

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("나의 옷"); Clothes clo
		 * = new Clothes();
		 * 
		 * System.out.print("어떤 옷인이 알려주세요 (예 : 반바지) > "); clo.name = sc.nextLine();
		 * 
		 * System.out.print("어떤 색인지 입력해주세요 > "); clo.color = sc.nextLine();
		 * 
		 * System.out.print("어떤 성별의 옷인지 입력해주세요 > "); clo.gender = sc.nextLine();
		 * 
		 * System.out.print("어떤 옷감의 옷인지 입력해주세요 >"); clo.fabric = sc.nextLine();
		 * 
		 * System.out.print("사이즈를 입력해주세요(예 : 100) > "); clo.size = sc.nextInt();
		 * 
		 * boolean exit = false;
		 * 
		 * while(!exit) { System.out.println("======================================");
		 * System.out.println("옷 종류 : " + clo.name); System.out.println("색상 : " +
		 * clo.color); System.out.println("성별 : " + clo.gender);
		 * System.out.println("옷감 : " + clo.fabric); System.out.println("사이즈 : " +
		 * clo.size); System.out.println("======================================");
		 * 
		 * 
		 * 
		 * System.out.println("메뉴를 선택해주세요 > 1. 빨래 / 2. 다림질 / 3. 정리 / 4. 종료"); int menuNo
		 * = sc.nextInt(); switch(menuNo) { case 1 : clo.clean(); break; case 2 :
		 * clo.ironing(); break; case 3 : clo.organize(); break; case 4: exit = true;
		 * break; default : System.out.println("메뉴를 다시 선택해주세요");
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
