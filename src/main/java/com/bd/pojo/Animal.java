package com.bd.pojo;

public class Animal {

	private int aid;
	private int cid;
	private int disid;
	private String aname;
	private String cname;
	private String disname;
	private String datea;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getDisid() {
		return disid;
	}
	public void setDisid(int disid) {
		this.disid = disid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDisname() {
		return disname;
	}
	public void setDisname(String disname) {
		this.disname = disname;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Animal(int aid, int cid, int disid, String aname, String cname, String disname, String datea) {
		super();
		this.aid = aid;
		this.cid = cid;
		this.disid = disid;
		this.aname = aname;
		this.cname = cname;
		this.disname = disname;
		this.datea = datea;
	}
}
