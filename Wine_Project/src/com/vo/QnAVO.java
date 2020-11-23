package com.vo;

public class QnAVO {
	private int q_id;
	private String id;
	private String q_text;
	private String a_text;
	private String q_date;
	
	//다 가져올 때
	public QnAVO(int q_id, String id, String q_text, String a_text, String q_date) {
		super();
		this.q_id = q_id;
		this.id = id;
		this.q_text = q_text;
		this.a_text = a_text;
		this.q_date = q_date;
	}
	
	public int getQ_id() {
		return q_id;
	}
	

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQ_text() {
		return q_text;
	}
	public void setQ_text(String q_text) {
		this.q_text = q_text;
	}
	public String getA_text() {
		return a_text;
	}
	public void setA_text(String a_text) {
		this.a_text = a_text;
	}
	public String getQ_date() {
		return q_date;
	}
	public void setQ_date(String q_date) {
		this.q_date = q_date;
	}
	
}

