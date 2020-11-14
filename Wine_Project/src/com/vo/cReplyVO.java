package com.vo;

public class cReplyVO {
	private int r_id;
	private String id;
	private String r_text;
	private String r_date;
	
	public cReplyVO(int r_id, String id, String r_text, String r_date) {
		super();
		this.r_id = r_id;
		this.id = id;
		this.r_text = r_text;
		this.r_date = r_date;
	}
	
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
