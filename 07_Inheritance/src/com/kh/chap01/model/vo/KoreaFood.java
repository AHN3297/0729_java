package com.kh.chap01.model.vo;

public class KoreaFood {
	private String foodName;
	private String material;
	private int cookingTime;
	private int spicy;
	
	public KoreaFood() {
		
	}
	public KoreaFood(String foodName, String material, int cookingtime, int spicy) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.spicy = spicy;
	}
	
	//get
	public String getfoodName() {
		return foodName;
	}
	
	public String getmaterial() {
		return material;
	}
	public int getcookingTime() {
		return cookingTime;
	}
	public int getspicy() {
		return spicy;
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
	public void setSpicy() {
		this.spicy = spicy;
	}
	
	public String info() {
		return  "음식 이름 : " + foodName + ", "
				+"재료 : " + material + ", "
				+"조리 시간 : " + cookingTime +", "
				+"맵기 정도 :" + spicy;
	}

}
