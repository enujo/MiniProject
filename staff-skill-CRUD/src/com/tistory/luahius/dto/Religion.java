package com.tistory.luahius.dto;

public class Religion {
	private int no;
	private String name;
	
	public Religion() {
		super();
	}
	public Religion(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		System.out.println(">>> Religion.java <<< setNo : "+no);
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(">>> Religion.java <<< setName : "+name);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Religion [no=" + no + ", name=" + name + "]";
	}
	
	
}
