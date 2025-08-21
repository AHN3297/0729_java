package com.kh.homework.vo;

public class Restaurant {
	public String name;
	public String menu;
	public String drink;
	public String desert;
	public int opentime;
	
	
	
	public void open() {
		if(opentime < 9) {
			System.out.println(name +"이(가) 아직 오픈하지않았습니다. 3. Exit을 누른 뒤 다시예약해주세요.");
		}else if(opentime >20) {
			System.out.println(name +"의 영업이 종료되었습니다.");
			
		}else {
			System.out.println(name +"이(가) 영업중입니다. 예약하실 수 있습니다.");
		}
		
	}
	public void reviewOk(){
		System.out.print("리뷰 이벤트로 쐬주 한 병 드립니다!");
	}
	public void reviewNo() {
		System.out.print("리뷰 이벤트 불참 확인하였습니다.");
	}

}
