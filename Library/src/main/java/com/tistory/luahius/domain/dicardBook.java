package com.tistory.luahius.domain;

public class dicardBook {
	private int disbookNo;
	private int bookNo;
	private String disbookRegister;
	private String disbookDueday;
	public int getDisbookNo() {
		return disbookNo;
	}
	public void setDisbookNo(int disbookNo) {
		this.disbookNo = disbookNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
		return "dicardBook [disbookNo=" + disbookNo + ", bookNo=" + bookNo + ", disbookRegister=" + disbookRegister
				+ ", disbookDueday=" + disbookDueday + "]";
	}
	
}
