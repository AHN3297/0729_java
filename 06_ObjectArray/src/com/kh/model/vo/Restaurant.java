package com.kh.model.vo;

public class Restaurant {
	
	// 상호, 주소, 메인메뉴
	
	private String storeName;
	private String address;
	private String mainMenu;
	
	// 기본생성자
	// 모든 필드를 매개변수로 갖는 생성자
	// getter()
	// setter()
	// information()
	//을 구현하여라
	public Restaurant() {}
	public Restaurant(String storeName, String address, String mainMenu) {
		
		this.storeName=storeName;
		this.address=address;
		this.mainMenu=mainMenu;
	}
	
	
	
	//get
	public String getStoreName() {
		return storeName;
	}
	public String getaddress() {
		return address;
	}
	public String getmainMenu() {
		return mainMenu;
	}
	
	//set
	public void setStoreName(String storeName){
		this.storeName=storeName;
	}
	public String setaddress(String address) {
		return address = address;
	}
	public String setmainMenu(String mainMenu ) {
		return mainMenu = mainMenu;
	}
	
	
	public String info() {
		return "식당 : " + storeName + ", "
				+"주소 : " + address + ", "
				+"메인메뉴 : " + mainMenu + ", "; 
	}
	

}
