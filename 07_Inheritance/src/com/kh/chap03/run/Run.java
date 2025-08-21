package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		Book b = new Book("그 많든 싱아는 누가 다 먹었을까", "웅진 지식 하우스", "박완서", 16650);
		
		ElectronicBook eb = new ElectronicBook("저속노화 마인드셋", "웨일북", "정희원", 17550, "yes24");
		
		PaperBook pb = new PaperBook("혼모노", "창비", "성해나", 16200, 0);
		
		System.out.println(b.info());
		System.out.println(eb.info());
		System.out.println(pb.info());
		
		System.out.println(b);
		System.out.println(b.toString());
		// toString() : 해당 객체의 풀클래스명 + "@" + 해당
		System.out.println(eb);
		System.out.println(pb);
		
		LastTime lt = new LastTime();
		System.out.println(lt);
		
		
		
	}

}
