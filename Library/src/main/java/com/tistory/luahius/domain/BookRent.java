package com.tistory.luahius.domain;

public class BookRent {
	private int brentNo;
	private int libmemberNo;
	private int bookNo;
	private String brentStart;
	private String brentEnd;
	public int getBrentNo() {
		return brentNo;
	}
	public void setBrentNo(int brentNo) {
		this.brentNo = brentNo;
	}
	public int getLibmemberNo() {
		return libmemberNo;
	}
	public void setLibmemberNo(int libmemberNo) {
		this.libmemberNo = libmemberNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	@Override
	public String toString() {
		return "BookRent [brentNo=" + brentNo + ", libmemberNo=" + libmemberNo + ", bookNo=" + bookNo + ", brentStart="
				+ brentStart + ", brentEnd=" + brentEnd + "]";
	}
	
	
	
}
