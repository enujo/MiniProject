package com.tistory.luahius.dto;

public class Skill {
	private int no;
	private String name;
	
	//�⺻ �����ڿ�
	public Skill() {
		super();
	}
	//�Ű��������� �޴� ������ ������ ���� ���� �ִ� no�ϳ� �޴°�, name�� �޴°� ��
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
	//���� �׽�Ʈ �ϱ� ���ؼ� 
	@Override
	public String toString() {
		return "Skill [no=" + no + ", name=" + name + "]";
	}
	
	
	
}
