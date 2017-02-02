package com.tistory.luahius.domain;

public class BookCategory {
	private int bookcategoryNo;
	private String	bookcategoryName;
	
	public int getBookcategoryNo() {
		return bookcategoryNo;
	}
	public void setBookcategoryNo(int bookcategoryNo) {
		this.bookcategoryNo = bookcategoryNo;
	}
	public String getBookcategoryName() {
		return bookcategoryName;
	}
	public void setBookcategoryName(String bookcategoryName) {
		this.bookcategoryName = bookcategoryName;
	}
	
	@Override
	public String toString() {
		return "BookCategory [bookcategoryNo=" + bookcategoryNo + ", bookcategoryName=" + bookcategoryName + "]";
	}
}
