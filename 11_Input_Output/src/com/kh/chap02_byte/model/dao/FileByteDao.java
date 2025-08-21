package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Date Access object)
// 데이터가 보관되어있는 공간에 직접 접근해서
// 입력/출력하는 메소드들을 만들어줌
public class FileByteDao {
	
	// 파일에 데이터를 출력(Byte Stream사용)
	
	public void outputToFile() {
		// 출력 : 프로그램 내의 데이터를 밖으로 내보내겠다.
		// 프로그램 --> 외부(파일)
		
		// FileOutputStream : "파일"로 데이터를출력할 때 , 파일과 연결하는 1Byte단위의 스트림
		
		// 1. FileOutputStream 객체 생성
		// 파일과 연결하는 스트림을 생성하는 과정
		FileOutputStream fos = null;
		try {
			// 생성자 호출 시 인자값으로 파일명을 전달하는데 파일명이 존재하지않을경우
			// 해당 파일을 생성하면서 통로를 연결
			fos = new FileOutputStream("a_byte.txt",true);
			
			//aoroqustn todtjdwk ghcnftl
			// 두번째 인자로 true를 작성하면 이어서작성 가능
			//안쓰면 => 덮어쓰기
			
			//2. 연결통로를 가지고 데이터를 출력 write()호출
			fos.write(97);
			fos.write(98);
			fos.write(99);
			byte[]arr = {101,102,103};
			fos.write(arr);
			fos.write('B');
			fos.write('안');
			fos.write('예');
			fos.write('성');
			
			// 1Byte의 범위 : =128 ~127
			// 한글은 2Byte기 때문에 깨ㅐ짐
			// 바이스트림으로는 한글/ 일어/ 한자 해결X
			//문자스트림사용해야함
			
			//3. 스트림 사용이 끝났다며 반드시 꼭 무조건 절대로 너무너무 해야하는 작업이 있음
			// 코드상에서 사용이 전부 종료되었다면 자원반납을 해주어야함 <--약속**(중요)**
			// 너무 정말정말정말정말 중요중요중요중요한 약속
			
			//자원 반납 하는법
			// .close()
			//fos.close();
			return;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
			return;
		}finally { // 어디에서 retuen하던지 무조건 finally블럭 구문을 수행
			try {
				if(fos != null) {
					fos.close();			
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	// 프로그램 <== 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	// FileInputStream
	// 파일로부터 데이터를 가져와서 입력을받을 건데, 1Byte단위로 입력받겠다
	
	public void inputFromFile() {
		FileInputStream fis = null;
		
		try {
			// 1. 객체생성
			fis = new FileInputStream("a_Byte.txt");
			//2. 스트림으로 입력받기
			//read()호출
			//1Byte단위로 읽어옴
			/*
			System.out.println((char)fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			파일의 마지막 데이터를 입력받고 나서 read()를 호출시 -1을 반환
			System.out.println(fis.read());
			*/
			/*
			System.out.println((char)fis.read());
			while(true) {
				int value = fis.read();
				if(value != -1) {
					System.out.println(value);
				}else {
					break;
				}
			}
			*/
			
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println((char)value);
			}
			// 3. 마지막으로 꼭해야하는일 => 자원반납
			
			
			// 문자열 비교
			
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
