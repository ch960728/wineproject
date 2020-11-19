package com.vo;

public class MyScoreVo {
	private String w_name;
	private String img;
	private int wr_id;
	private String id;
	private int wine_id;
	private int score;
	private String rw_text;
	private String rw_date;
	
	public MyScoreVo(String w_name,String img,int wr_id, String id, int wine_id, int score, String rw_text, String rw_date) {
		super();
		this.w_name=w_name;
		this.img=img;
		this.wr_id = wr_id;
		this.id = id;
		this.wine_id = wine_id;
		this.score = score;
		this.rw_text = rw_text;
		this.rw_date = rw_date;
	}
	
	public MyScoreVo(String w_name,String id, int wine_id, int score, String rw_text) {
		super();
		this.w_name=w_name;
		this.id = id;
		this.wine_id = wine_id;
		this.score = score;
		this.rw_text = rw_text;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getW_name() {
		return w_name;
	}

	public void setW_name(String w_name) {
		this.w_name = w_name;
	}

	public int getWr_id() {
		return wr_id;
	}
	public void setWr_id(int wr_id) {
		this.wr_id = wr_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWine_id() {
		return wine_id;
	}
	public void setWine_id(int wine_id) {
		this.wine_id = wine_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRw_text() {
		return rw_text;
	}
	public void setRw_text(String rw_text) {
		this.rw_text = rw_text;
	}
	public String getRw_date() {
		return rw_date;
	}
	public void setRw_date(String rw_date) {
		this.rw_date = rw_date;
	}
	
	
	
}
