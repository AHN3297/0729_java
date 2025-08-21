package com.kh.chap04_assist.model.vo;

import java.io.Serializable;

public class Plant implements Serializable{
	private String type;
	private String name;
	
	public Plant() {}
	public Plant(String type, String name) {
		this.type = type;
		this.name = name;
			
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return"식물정보 [이름 = " + name + ", 종류 = " + type + "]";
	}
}
