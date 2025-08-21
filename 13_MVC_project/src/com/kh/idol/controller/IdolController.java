package com.kh.idol.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolController {
	private List<Fan> fans = new ArrayList();
	private List<Board> boards = new ArrayList(); // <= 생성을 넣어놔서 강제 초기화 안하는 이상 Null이 될 수 없음.
	private List<Idol> aespa = new ArrayList();
	private int boardNo;

	{
		aespa.add(new Idol("카리나","리더", "Rocket Puncher"));
		aespa.get(0).setImage(null);
		aespa.add(new Idol("지젤","외국인", "Xenoglossy"));
		aespa.get(0).setImage(null);
		aespa.add(new Idol("윈터","불자", "Armamenter"));
		aespa.get(0).setImage(null);
		aespa.add(new Idol("닝닝","외국인2", "E.D Hacker"));
		aespa.get(0).setImage(null);
		
	}
	public List<Idol> findAll() {
		return aespa;
		
	}
	public Idol findMember(int memberNo) {
		/*
		if(memberNo == 0) {
			return aespa.get(0);
		}else if(memberNo == 1) {
			return aespa.get(1);
		}else if(memberNo == 2) {
			return aespa.get(2);
		}else {
			return aespa.get(3);
		}
		*/
		return aespa.get(memberNo -1);
	}
	
	// 사용자닥 아이디를 입력했을 때 입력한 ㅏ이디가
	// fan들이 들어가는 list의 요소릐 userId필드값과 중복되는게 있는지
	// 확인 한 뒤에 결과를 View도 다시 반환
	public boolean checkId(String userId) {
		
		// 1. userId
		// 2. fans
		// 3. fans.get(i).getuserId();
		// 4. equals()
		
		for(int i = 0; i < fans.size(); i++) {
			if(userId.equals(fans.get(i).getUserId())) {
				return true;
			}
		}
		return false;
	}
	// 사용자가 입력한 아이디, 비밀번호, 닉네임을 가지고
	// 새로운 Fan이라는 객체를 생성하면서 필드에 값을 대입해주고
	// 생성된 Fan객체의 주소값을 내가 가지고 있는 Fan들이 들어가는 List의 요소로
	// 추가를 해주는 메소드를 구현을 해야함
	
	public boolean signUp(String userId, String userPwd, String nickName) {
		// 1. 데이터 가공
		Fan fan = new Fan(userId, userPwd, nickName);
		
		// 2. 요청 처리(아직 요청 처리하는계층을 안배웠으므로 컨트롤러에서 처리)
		boolean result = checkId(userId);
		if(!result) {			
			fans.add(fan);
		} else { 
			
		}
		// 3. 결과값 반환
		return result;
	}
	// 사용자가 로그인 요청 시 호출되는 메소드
	public Fan login(String userId, String userPwd) {
		
		// 컨트롤러가 가지고 있는
		// Fan의 정보를 필드에 저장하는Fan객체들의 주소를 가지고 있는
		// fnas라는 리스트의 요소에하나하나접근해서
		// Fan객체의 userId필드 및 userPwd필드를
		// 사용자가 입력한 userId값 + userPwd값과 각각비교하여
		// 둘 다 일치하는Fan객체가 존재한다면 사용자의 정보가 담겨있는Fan을 반환
		for(int i =0; i<fans.size(); i++) {
			// 반복하면서 순차적으로 접근할 요소 객체를 변수로 선언
			Fan fan = fans.get(i);
		
			if(userId.equals(fan.getUserId())
					&&
					userPwd.equals(fan.getUserPwdd()));
		}
		return null;
	}
	
	// 로그인에 성공한 사용자가 게시글작성 요청을할 때마다 호출이 되는 메소드
	public void post(String boardTitle, String boardContent, String userId) {
		
		// 기존 boardNo 보다 1 증가 시킨 값과
		// 사용자가 입력한 게시글 제목, 내용 값봐
		// 현재 로그인된사용자의 아이디 값와
		// 현재 게시글 작성 요청이 들어온 시간 값을 가지고
		// Board객체를 만들어서 Board타입들이 들어다는 list의 요소로 추가
		
		// 1. 데이터 가공
		Board board = new Board();
		board.setBoardTitle(boardTitle);
		board.setBoardContent(boardContent);
		board.setUserId(userId);
		board.setBoardNo(++boardNo);
		String createDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
		board.setCreateDate(createDate);
		
		// 2. 요청처리
		boards.add(board);
		
	}
	
	public List<Board> selectBoardList() {
		// View에 요청에 의해 호출되며,
		// 게시글 목록이 담겨있는 것을 되돌려 주어야함
		return boards;
	}
	
}

