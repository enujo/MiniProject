package com.tistory.luahius.domain;

public class pay {
	private int payNo;
	private int libmemberNo;
	private int brentNo;
	private int payTotal;
	public int getPayNo() {
		return payNo;
	}
	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}
	public int getLibmemberNo() {
		return libmemberNo;
	}
	public void setLibmemberNo(int libmemberNo) {
		this.libmemberNo = libmemberNo;
	}
	public int getBrentNo() {
		return brentNo;
	}
	public void setBrentNo(int brentNo) {
		this.brentNo = brentNo;
	}
	public int getPayTotal() {
		return payTotal;
	}
	public void setPayTotal(int payTotal) {
		this.payTotal = payTotal;
	}
	@Override
	public String toString() {
		return "pay [payNo=" + payNo + ", libmemberNo=" + libmemberNo + ", brentNo=" + brentNo + ", payTotal="
				+ payTotal + "]";
	}
	
	
}
