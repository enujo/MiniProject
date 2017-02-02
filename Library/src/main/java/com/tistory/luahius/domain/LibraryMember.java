package com.tistory.luahius.domain;

public class LibraryMember {
	private int libmemberNo;
	private int libraryNo;
	private String libmemberName;
	private String libmemberAdress;
	private int libmemberPhone;
	private int libmemberState;
	
	public int getLibmemberNo() {
		return libmemberNo;
	}
	public void setLibmemberNo(int libmemberNo) {
		this.libmemberNo = libmemberNo;
	}
	public int getLibraryNo() {
		return libraryNo;
	}
	public void setLibraryNo(int libraryNo) {
		this.libraryNo = libraryNo;
	}
	public String getLibmemberName() {
		return libmemberName;
	}
	public void setLibmemberName(String libmemberName) {
		this.libmemberName = libmemberName;
	}
	public String getLibmemberAdress() {
		return libmemberAdress;
	}
	public void setLibmemberAdress(String libmemberAdress) {
		this.libmemberAdress = libmemberAdress;
	}
	public int getLibmemberPhone() {
		return libmemberPhone;
	}
	public void setLibmemberPhone(int libmemberPhone) {
		this.libmemberPhone = libmemberPhone;
	}
	public int getLibmemberState() {
		return libmemberState;
	}
	public void setLibmemberState(int libmemberState) {
		this.libmemberState = libmemberState;
	}
	@Override
	public String toString() {
		return "libraryMember \n[libmemberNo=" + libmemberNo + ", \nlibraryNo=" + libraryNo + ", \nlibmemberName="
				+ libmemberName + ", \nlibmemberAdress=" + libmemberAdress + ", \nlibmemberPhone=" + libmemberPhone
				+ ", \nlibmemberState=" + libmemberState + "]";
	}
	
}
