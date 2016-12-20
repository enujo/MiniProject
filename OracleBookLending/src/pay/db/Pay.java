package pay.db;

import java.util.Date;

public class Pay {
	private int pay_no;
	private String member_id;
	private Date pay_date;
	private int pay_money;
	private Date pay_date_start;
	private Date pay_date_end;
	private int pay_state;
	private int pay_term;
	public int getPay_no() {
		return pay_no;
	}
	@Override
	public String toString() {
		return "Pay [pay_no=" + pay_no + ", member_id=" + member_id + ", pay_date=" + pay_date + ", pay_money="
				+ pay_money + ", pay_date_start=" + pay_date_start + ", pay_date_end=" + pay_date_end + ", pay_state="
				+ pay_state + ", pay_term=" + pay_term + "]";
	}
	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Date getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	public int getPay_money() {
		return pay_money;
	}
	public void setPay_money(int pay_money) {
		this.pay_money = pay_money;
	}
	public Date getPay_date_start() {
		return pay_date_start;
	}
	public void setPay_date_start(Date pay_date_start) {
		this.pay_date_start = pay_date_start;
	}
	public Date getPay_date_end() {
		return pay_date_end;
	}
	public void setPay_date_end(Date pay_date_end) {
		this.pay_date_end = pay_date_end;
	}
	public int getPay_state() {
		return pay_state;
	}
	public void setPay_state(int pay_state) {
		this.pay_state = pay_state;
	}
	public int getPay_term() {
		return pay_term;
	}
	public void setPay_term(int pay_term) {
		this.pay_term = pay_term;
	}
	

}
