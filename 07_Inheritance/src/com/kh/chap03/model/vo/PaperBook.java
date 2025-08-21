package com.kh.chap03.model.vo;

public class PaperBook extends Book {
	private int lostPage;
	public PaperBook() {}
	public PaperBook(String title, String publisher,
			String author, int price,
			int losPage) {
		super(title, publisher, author,price);
		this.lostPage = lostPage; 
		
		
		
		}
	public int getLostpage() {
		return lostPage;
		
	}
	public void setLostPage(int lostPage) {
		this.lostPage = lostPage;
	}
	public String info() {
		return super.info() + ", 잃어버린 페이지 : " + lostPage;
	}
	public String toString() {
		return super.info()+", 잃어버린 페이지 : "+ lostPage;
	}
	

}
