package com.kh.homework.vo;

public class Tree {
	public String name;
	public int water;
	public String plantfood;
	public int pesticide;
	public int howmany;

	
	
	public void giveWater(){
		System.out.print("물을 주었습니다!");
	}
	public void givePesticide() {
		System.out.print("농약을 치셨습니다.");
	}
}
