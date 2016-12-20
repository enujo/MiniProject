package member.db;


public class Member {
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_level;
	private String member_phone;
	private String member_addr;
	private String member_date;
	private String member_img;
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		System.out.println("Member.java member_id : "+member_id);
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		System.out.println("Member.java member_pw : "+member_pw);
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		System.out.println("Member.java member_name : "+member_name);
		this.member_name = member_name;
	}
	public String getMember_level() {
		return member_level;
	}
	public void setMember_level(String member_level) {
		System.out.println("Member.java member_level : "+member_level);
		this.member_level = member_level;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		System.out.println("Member.java member_phone : "+member_phone);
		this.member_phone = member_phone;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		System.out.println("Member.java member_addr : "+member_addr);
		this.member_addr = member_addr;
	}
	public String getMember_date() {
		return member_date;
	}
	public void setMember_date(String member_date) {
		System.out.println("Member.java member_date : "+member_date);
		this.member_date = member_date;
	}
	public String getMember_img() {
		return member_img;
	}
	public void setMember_img(String member_img) {
		System.out.println("Member.java member_img : "+member_img);
		this.member_img = member_img;
	}
	
	
	
}