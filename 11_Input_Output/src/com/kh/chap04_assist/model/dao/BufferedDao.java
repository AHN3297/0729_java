package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//보조스트림 : 기반스트림만으로 부족한  성능을 향상시켜주는 용도로 만들어진 스트림
	// 				=> 단독 사용불가(반드시 기반스트림이 존재해야만 사용이 가능함)
	//				=> 속도향상, 자료형에맞춰서 변환, 객체단위로 입출력, 바이트 <==> 문자
	
	// 기반스트림이 input / output계열일 경우
	// 보조스트림도 input / output 계열을 사용
	
	// 기반스트림이 Reader / Writer 계열일 경우
	// 보조스트림도 Reader / Writer 계열을 사용
	
	// BufferedReader / BufferedWriter
	// ㄴ> 속도 향상이 목적인 보조스트림
	// -> 임시공간을 제공해서 한 번에 모아두었다가 한꺼번에 입/출력을 진행
	
	// [ 표현법 ]
	// 기반 스트림클래스이름 기반 스트림 = new 기반스트림생성자 (외부매체인자값);
	// 보조스트림클래스이름 보조스트림 = new 보조스트림생성자 (기반스트림);
	
	// 출력
	
	public void outputFile() {
		
		// BufferedWriter
		
		// 0.변수선언
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 1. 객체 생성
			fw = new FileWriter("c_buffer.txt");
			bw = new BufferedWriter(fw);
			
			// 2. 출력 => write()
			bw.write("하잉");
			bw.newLine();
			bw.write("반가워");
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			// 3. 자원반남 => close()
			try {
				if(bw!= null) {
					bw.close();
				}
				}catch(IOException e) {
					e.printStackTrace();
			
					try {
						if(fw!= null) {
							fw.close();
						}
						}catch(IOException e1) {
							e1.printStackTrace();		
			}
		}
	}
	}
	
	public void inputFile() {
		try(BufferedReader bfr = new BufferedReader(new FileReader("c_buffer.txt"))){
			String str = "";
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
			}catch(IOException e) {
				e.printStackTrace();
		}
	}
	
	
}
