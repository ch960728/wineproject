package com.vo;

public class CommVo {
	private int c_id;
	private String title;
	private String id;
	private String c_text;
	private String c_img;
	private int c_count;
	private String c_date;
	
	
	public CommVo(int c_id, String title, String id, String c_text, String c_img, int c_count, String c_date) {
		super();
		this.c_id = c_id;
		this.title = title;
		this.id = id;
		this.c_text = c_text;
		this.c_img = c_img;
		this.c_count = c_count;
		this.c_date = c_date;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getC_text() {
		return c_text;
	}
	public void setC_text(String c_text) {
		this.c_text = c_text;
	}
	public String getC_img() {
		return c_img;
	}
	public void setC_img(String c_img) {
		this.c_img = c_img;
	}
	public int getC_count() {
		return c_count;
	}
	public void setC_count(int c_count) {
		this.c_count = c_count;
	}
	public String getC_date() {
		return c_date;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
}
