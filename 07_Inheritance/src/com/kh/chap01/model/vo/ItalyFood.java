package com.kh.chap01.model.vo;

public class ItalyFood {
	private String foodName;
	private String material;
	private int cookingTime;
	private int oil;
	
	public ItalyFood() {
		
	}
	public ItalyFood(String foodName, String material, int cookingtime, int oil) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.oil = oil;
	}

	
	// get
	public String getfoodName() {
		return foodName;
	}
	public String getmaterial() {
		return material;
	}
	public int getcookingTime() {
		return cookingTime;
	}
	public int getoil() {
		return oil;
	}
	
	//set
	public void setFoodName() {
		this.foodName = foodName;
	}
	public void setmaterial() {
		this.material = material;
	}
	public void setCookkingTime() {
		this.cookingTime = cookingTime;
	}
	public void setOil() {
		this.oil = oil;
	}
	
	public String info() {
		return "음식 이름 : " + foodName + ", "
				+"재료 : " + material + ", "
				+"조리 시간 : " + cookingTime  + ", "
				+"오일 수 : " + oil + ", "; 
	}

}
