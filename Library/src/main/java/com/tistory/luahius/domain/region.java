package com.tistory.luahius.domain;

public class region {
	private int regionNo;
	private String regionName;
	public int getRegionNo() {
		return regionNo;
	}
	public void setRegionNo(int regionNo) {
		this.regionNo = regionNo;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	@Override
	public String toString() {
		return "region [regionNo=" + regionNo + ", regionName=" + regionName + "]";
	}
	
	
}
