package com.tistory.luahius.domain;

public class Book {
	private int bookNo;
	private int disbookNo;
	private int libraryNo;
	private int bookcategoryNo;
	private String bookName;
	private String bookWriter;
	private String bookPulisher;
	private String bookFirstrent;
	private int bookTotalrent;
	private int bookTotalday;
	private int bookState;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getDisbookNo() {
		return disbookNo;
	}
	public void setDisbookNo(int disbookNo) {
		this.disbookNo = disbookNo;
	}
	public int getLibraryNo() {
		return libraryNo;
	}
	public void setLibraryNo(int libraryNo) {
		this.libraryNo = libraryNo;
	}
	public int getBookcategoryNo() {
		return bookcategoryNo;
	}
	public void setBookcategoryNo(int bookcategoryNo) {
		this.bookcategoryNo = bookcategoryNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getBookPulisher() {
		return bookPulisher;
	}
	public void setBookPulisher(String bookPulisher) {
		this.bookPulisher = bookPulisher;
	}
	public String getBookFirstrent() {
		return bookFirstrent;
	}
	public void setBookFirstrent(String bookFirstrent) {
		this.bookFirstrent = bookFirstrent;
	}
	public int getBookTotalrent() {
		return bookTotalrent;
	}
	public void setBookTotalrent(int bookTotalrent) {
		this.bookTotalrent = bookTotalrent;
	}
	public int getBookTotalday() {
		return bookTotalday;
	}
	public void setBookTotalday(int bookTotalday) {
		this.bookTotalday = bookTotalday;
	}
	public int getBookState() {
		return bookState;
	}
	public void setBookState(int bookState) {
		this.bookState = bookState;
	}
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", disbookNo=" + disbookNo + ", libraryNo=" + libraryNo + ", bookcategoryNo="
				+ bookcategoryNo + ", bookName=" + bookName + ", bookWriter=" + bookWriter + ", bookPulisher="
				+ bookPulisher + ", bookFirstrent=" + bookFirstrent + ", bookTotalrent=" + bookTotalrent
				+ ", bookTotalday=" + bookTotalday + ", bookState=" + bookState + "]";
	}
	
	
	
	
	
}
