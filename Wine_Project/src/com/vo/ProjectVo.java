package com.vo;

public class ProjectVo {
	private int u_id;
	private String user_name;
	private String id;
	private String mail;
	private String tel;
	private String tendency;
	private String sex;
	private String birth;
	private String join_date;
	
	
	public ProjectVo(int u_id, String user_name, String id, String mail, String tel, String tendency, String sex,
			String birth, String join_date) {
		super();
		this.u_id = u_id;
		this.user_name = user_name;
		this.id = id;
		this.mail = mail;
		this.tel = tel;
		this.tendency = tendency;
		this.sex = sex;
		this.birth = birth;
		this.join_date = join_date;
	}
	public ProjectVo(String id) {
		super();
		this.id = id;
	}
	
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getTendency() {
		return tendency;
	}
	public void setTendency(String tendency) {
		this.tendency = tendency;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	
}
