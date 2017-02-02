package com.tistory.luahius.domain;

public class Library {
	private int libraryNo;
	private int regionNo;
	private String libraryPw;
	public int getLibraryNo() {
		return libraryNo;
	}
	public void setLibraryNo(int libraryNo) {
		this.libraryNo = libraryNo;
	}
	public int getRegionNo() {
		return regionNo;
	}
	public void setRegionNo(int regionNo) {
		this.regionNo = regionNo;
	}
	public String getLibraryPw() {
		return libraryPw;
	}
	public void setLibraryPw(String libraryPw) {
		this.libraryPw = libraryPw;
	}
	@Override
	public String toString() {
		return "library [libraryNo=" + libraryNo + ", regionNo=" + regionNo + ", libraryPw=" + libraryPw + "]";
	}
	
	
}
