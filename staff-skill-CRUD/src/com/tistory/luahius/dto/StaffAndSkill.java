package com.tistory.luahius.dto;

public class StaffAndSkill {
	private int no;
	private Staff staff;
	private Skill skill;
	
	public StaffAndSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StaffAndSkill(int no, Staff staff, Skill skill) {
		super();
		this.no = no;
		this.staff = staff;
		this.skill = skill;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		System.out.println(">>> StaffAndSkill.java <<< setNo : "+no);
		this.no = no;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		System.out.println(">>> StaffAndSkill.java <<< setStaff : "+staff);
		this.staff = staff;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		System.out.println(">>> StaffAndSkill.java <<< setSkill : "+skill);
		this.skill = skill;
	}
	
	@Override
	public String toString() {
		return "StaffAndSkill [no=" + no + ", staff=" + staff + ", skill=" + skill + "]";
	}
	
}
