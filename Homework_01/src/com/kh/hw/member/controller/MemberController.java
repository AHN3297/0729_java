package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController{
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	
	
	// static블럭
	static {
		//System.out.println("호잇");
		
	}
	
	//초기화블럭
	{
		//System.out.println("내가3등");
		m[0] = new Member("admin","관리자", "ad1234", "admin@kh.com",'M', 24);
	}
	public MemberController(){
		//System.out.println("내가 4등");
		m[0] = new Member("admin","관리자", "ad1234", "admin@kh.com",'M', 24);
	}
	
	public Member[] getM() {
		return m;
	}
	
	public int existMemberNum(){
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		
		return count;
		
	}
	public boolean checkId(String inputId) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].getId().equals(inputId)) {
                return true;
            }
        }
        return false;
    }
	public void insertMember(String id, String name, 
						String password, String email,
						char gender, int age) {
		 for (int i = 0; i < m.length; i++) {
	            if (m[i] == null) {
	                m[i] = new Member(id, name, password, email, gender, age);
	                break;
	            }
	        }
		
	}
	public Member searchId(String id) {
		for(int i =0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				// 중복된아이디가있음.
				return m[i];
			}	
		}
		return null;
	}
	public Member[] searchName(String keyword) {
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index = 0;
		
		for(int i =0; i < m.length; i++) {
			if(m[i] !=null && m[i].getName().equals(keyword)) {
				members[index++] = m[i];
			}
		}
		return members;
	}
	public Member[] searchEmail(String email) {
		return null;
	}
	public boolean updatePassword(String userId, String userPw, String newPassword) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && 
			   m[i].getId().equals(userId) && 
			   m[i].getPassword().equals(userPw)) {
				m[i].setPassword(newPassword);
				return true;
				
				
			}
			
		}
		return false;
	}
	public int deleteMember(String userId, String userPwd) {
		for(int i = 0; i < m.length; i++) {
			if (m[i] !=null && m[i].getId().equals(userId)&&
					m[i].getPassword().equals(userPwd)) {
				m[i] = null;
				return 1;
			}
		}
		return 0;
	}
	public void delete() {}
	
	public Member[] printAll;
	
}
