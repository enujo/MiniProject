package com.tistory.luahius.domain;

public class dicardBook {
	private int disbookNo;
	private Book book;
	private String disbookRegister;
	private String disbookDueday;
	public int getDisbookNo() {
		return disbookNo;
	}
	public void setDisbookNo(int disbookNo) {
		this.disbookNo = disbookNo;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getDisbookRegister() {
		return disbookRegister;
	}
	public void setDisbookRegister(String disbookRegister) {
		this.disbookRegister = disbookRegister;
	}
	public String getDisbookDueday() {
		return disbookDueday;
	}
	public void setDisbookDueday(String disbookDueday) {
		this.disbookDueday = disbookDueday;
	}
	@Override
	public String toString() {
		return "dicardBook [disbookNo=" + disbookNo + ", book=" + book + ", disbookRegister=" + disbookRegister
				+ ", disbookDueday=" + disbookDueday + "]";
	}
		
}
