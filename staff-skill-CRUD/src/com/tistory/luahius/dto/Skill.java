package com.tistory.luahius.dto;

public class Skill {
	private int no;
	private String name;
	
	//기본 생성자와
	public Skill() {
		super();
	}
	//매개변수값을 받는 생성자 여러개 만들 수도 있다 no하나 받는거, name만 받는거 등
	public Skill(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		System.out.println(">>> Skill.java <<< setNo : "+no);
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(">>> Skill.java <<< setName : "+name);
		this.name = name;
	}
	//단위 테스트 하기 위해서 
	@Override
	public String toString() {
		return "Skill [no=" + no + ", name=" + name + "]";
	}
	
	
	
}
