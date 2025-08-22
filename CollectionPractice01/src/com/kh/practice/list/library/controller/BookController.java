package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;


import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> book = new ArrayList();
	{
		book.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		book.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		book.add(new Book("대화의 기술", "강보람", "인문", 17500));
		book.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {
		book.add(bk);
	}
	public List<Book> selectList() {
		return book;
	}
	public List<Book> searchBook(String keyword){
		List<Book> searchList = new ArrayList();
		for(int i = 0; i<book.size(); i++) {
			Book b = book.get(i);
			
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
				
			}
		}
		return searchList;
		
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i =0; i<book.size(); i++) {
			// 반복하면서 순차적으로 접근할 요소 객체를 변수로 선언
			removeBook = book.get(i);
		
			if(title.equals(removeBook.getTitle())
					&&
					author.equals(removeBook.getAuthor())) {
				book.remove(book.get(i));
				
			}
		}
		return removeBook;
		
	}

}
