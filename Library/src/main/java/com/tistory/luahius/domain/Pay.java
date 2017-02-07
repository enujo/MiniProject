package com.tistory.luahius.domain;

public class Pay {
	private int payNo;
	private LibraryMember libmember;
	private BookRent bookRent;
	private int payTotal;
	public int getPayNo() {
		return payNo;
	}
	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}
	public LibraryMember getLibmember() {
		return libmember;
	}
	public void setLibmember(LibraryMember libmember) {
		this.libmember = libmember;
	}
	public BookRent getBookRent() {
		return bookRent;
	}
	public void setBookRent(BookRent bookRent) {
		this.bookRent = bookRent;
	}
	public int getPayTotal() {
		return payTotal;
	}
	public void setPayTotal(int payTotal) {
		this.payTotal = payTotal;
	}
	@Override
	public String toString() {
		return "Pay [payNo=" + payNo + ", libmember=" + libmember + ", bookRent=" + bookRent + ", payTotal=" + payTotal
				+ "]";
	}
	
	

}
