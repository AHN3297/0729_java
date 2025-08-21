package com.kh.idol.model.vo;

public class Fan {
	private String userId;
	private String userPwdd;
	private String nickName;
	
	public Fan() {
		super();
	}
	
	public Fan(String userId, String userPwdd, String nickName) {
		super();
		this.userId = userId;
		this.userPwdd = userPwdd;
		this.nickName = nickName;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwdd() {
		return userPwdd;
	}

	public void setUserPwdd(String userPwdd) {
		this.userPwdd = userPwdd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Fan [userId=" + userId + ", userPwdd=" + userPwdd + ", nickName=" + nickName + "]";
	}
	
	

}
