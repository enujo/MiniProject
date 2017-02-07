package com.tistory.luahius.domain;

public class BookRent {
	private int brentNo;
	private LibraryMember libmember;
	private Book book;
	private String brentStart;
	private String brentEnd;
	private Pay pay;
	
	public int getBrentNo() {
		return brentNo;
	}

	public void setBrentNo(int brentNo) {
		this.brentNo = brentNo;
	}

	public LibraryMember getLibmember() {
		return libmember;
	}

	public void setLibmember(LibraryMember libmember) {
		this.libmember = libmember;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getBrentStart() {
		return brentStart;
	}

	public void setBrentStart(String brentStart) {
		this.brentStart = brentStart;
	}

	public String getBrentEnd() {
		return brentEnd;
	}

	public void setBrentEnd(String brentEnd) {
		this.brentEnd = brentEnd;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "BookRent [brentNo=" + brentNo + ", libmember=" + libmember + ", book=" + book + ", brentStart="
				+ brentStart + ", brentEnd=" + brentEnd + ", pay=" + pay + "]";
	}
	
}
