package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("== Welcome KH Library == ");
			System.out.println();
			System.out.println(" ****** 메인메뉴 ******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 >> ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5:  break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못입력하였습니다. 다시입력해주세요.");return;
			}
		}
	}
	
	public String getCategoryName(int genre) {
	    switch (genre) {
	        case 1: return "인문";
	        case 2: return "과학";
	        case 3: return "외국어";
	        case 4: return "기타";
	        default: return "알 수 없음";
	    }
	}
	
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println();
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int genre = sc.nextInt();
		sc.nextLine();
		String category = getCategoryName(genre);
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		Book book = new Book(title, author, category, price);
		
		bc.insertBook(book);
		
	}
	public void selectList() {
		List<Book> book = bc.selectList();
		if(book.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			
		}else {
			for(Book i : book) {
				System.out.println(i.getTitle() + " / " 
								 + i.getAuthor()+" / "
								 + i.getCategory()+ " / "
								 + i.getPrice());
			}
		}
		
	}
	
	public void searchBook() {
		System.out.println("=====도서검색=====");
		System.out.print("검색 키워드 > ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
		
		List<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가존재하지 않는다.");
		}else {
			System.out.println ("검색 키워드 : " + keyword);
			for(Book b : searchList) {
				System.out.println("==================================");
				System.out.println(b.getTitle() + " / " + 
								   b.getAuthor() + " / " +
								   b.getCategory() + " / " +
								   b.getPrice());
			}
		}
	}
	public void deleteBook() {
		System.out.println("=====도서삭제=====");
		System.out.println("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book removeBook = bc.deleteBook(title, author);
		if(removeBook != null) {
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}

}
