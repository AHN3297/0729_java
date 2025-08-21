package com.kh.chap01.model.vo;

public class JapanFood {
	private String foodName;
	private String material;
	private int cookingTime;
	private int fresh;
	
	public JapanFood() {
		
	}
	public JapanFood(String foodName, String material, int cookingtime, int fresh) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.fresh = fresh;
	}
	public String getfoodName() {
		return foodName;
	}
	public String getmaterial() {
		return material;
	}
	public int getcookingTime() {
		return cookingTime;
	}
	public int getfresh() {
		return fresh;
	}
	//set
	public void setFoodName() {
		this.foodName = foodName;
	}
	public void setMaterial() {
		this.material = material;
	}
	public void setCookingTime() {
		this.cookingTime = cookingTime;
	}
	public void setFresh() {
		this.fresh = fresh;
	}
	public String info() {
		return "음식 이름 : " + foodName  + ", "
				+"재료 : " + material + ", "
				+"조리시간 : " + cookingTime + ", "
				+ "신선도 : " + fresh  + ", ";
	}
}
