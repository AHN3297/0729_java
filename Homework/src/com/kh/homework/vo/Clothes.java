package com.kh.homework.vo;

public class Clothes {
	private String name;
	private String color;
	private String gender;
	private String fabric;
	private int size;
	
	/*
	public void clean() {
		System.out.print("옷감에 유의하여 빨래해 주세요");
	}
	
	public void ironing() {
		System.out.print("화상에 주의하여 다림질해주세요");
	}
	
	public void organize() {
		System.out.print("옷이 구겨지지 않게 정리해주세요");
	}
	*/
	// getter
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public String getgender() {
		return gender;
	}
	
	public String  getfabric(){
		return fabric;
	}
	public int getsize() {
		return size;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;	
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setFabric(String fabric) {
		this.gender = fabric;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String info() {
		String info = "옷 종류 : " + name
					+", 옷 생상 : " + color
					+", 어느성별 옷 : " + gender
					+", 옷감 : " + fabric
					+", 사이즈 : " + size;
		return info;
	}
	
	
	

}
