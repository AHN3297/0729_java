package com.kh.chap03.model.vo;



public class ElectronicBook extends Book {
	private String platform;
	
	public ElectronicBook() {}
	public ElectronicBook(String title, String publisher,
							String author, int price,
							String platform) {
		
		super(title, publisher, author,price);
		this.platform = platform;
		
		}
		public String getPlatForm() {
			return platform;
		}
		public void setPlatForm(String platForm) {
			this.platform = platForm;
		}
		public String info() {
			return super.info() + ", 플랫폼 : " + platform;
		}
	

}
