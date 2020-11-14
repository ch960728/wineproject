package com.vo;

public class cReplyVO {
	private int rc_id;
	private String id;
	private int c_id;
	private String r_text;
	private String r_date;
	
	
	public cReplyVO(int rc_id, String id, int c_id, String r_text, String r_date) {
		super();
		this.rc_id = rc_id;
		this.id = id;
		this.c_id = c_id;
		this.r_text = r_text;
		this.r_date = r_date;
	}
	
	public int getRc_id() {
		return rc_id;
	}
	public void setRc_id(int rc_id) {
		this.rc_id = rc_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getR_text() {
		return r_text;
	}
	public void setR_text(String r_text) {
		this.r_text = r_text;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	
	
	
}
