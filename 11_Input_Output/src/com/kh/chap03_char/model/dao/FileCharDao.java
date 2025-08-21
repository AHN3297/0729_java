package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	//프로그램 --> 외부매체(파일)
	// 출력
	public void outputToFile() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림
		
		// 0. 스트림 선언
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			//2. 데이터출력 => write()
			fw.write("와 신기해");
			fw.write("와 신기해");
			
			
		}catch(IOException e) {
			System.out.println("다시 시도해주세요");
		}finally {
			try {
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		*/
		/*
		 * try ~ with ~ resource 구문
		 * - JDK 7이상부터 사용가능
		 * try(스트림객체생성; ...){
		 * 		예외가 발생할 수도 있는 구문;
		 * } catch(예외클래스 e){
		 * 		예외가 발생했을 때 실행할 구문;
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해줌
		 * 혹여나 할 수도 있는 실수를 줄일 수 있는 아주 훌륭한 문법
		 * 대전제 : Closeable를 구현할것
		 */
		
		try(FileWriter fw = new FileWriter("c_char.text")){
			fw.write("와...IO...ㅎㅎ");
			fw.write("E");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void writeTil() {
		// 사용자에게 오늘 학습내용을입력받아서
		//외부 파일에 내용출력
		
		//내보낼 파일 명은 : 2025년 08월 14일 오늘의 학습일지
		Date now = new Date();
		//System.out.println(now);
		//2025년 08월 14
		String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		//System.out.println(titleDate);
		StringBuilder sb = new StringBuilder();
		//String fileName = titleDate + "오늘의 학습일지.txt";
		sb.append(titleDate);
		sb.append("오늘의 학습일지.txt");
		
		// 한글로쓸려면
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		try {
			fw = new FileWriter(sb.toString());
			System.out.print("오늘 배운내용을 작성해 보세요 > ");
			String content = sc.nextLine();
			fw.write("오늘 학습한 내용 : \t" + content);// 얘네들도 빌더에 어펜드 쓰기
		}catch(IOException e) {
			System.out.println("비상비상");
		}finally {
			try {
				if(sc != null) sc.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				System.out.println("자원 반납하다가 문제발생");
			}
		}
		
	}

}
