package githrd.vo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MemberVO {
	
	private int mno;
	private String name, id, pw, mail, tel, sdate;
	private Date jdate;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", name=" + name + ", id=" + id + ", pw=" + pw + ", mail=" + mail + ", tel="
				+ tel + ", sdate=" + sdate + ", jdate=" + jdate + "]";
	}


}
