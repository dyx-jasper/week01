package com.bw.bean;

public class Hero {
	private Integer id;
	private String hname;
	private Double price;
	private String isHave;
	private String picurl;
	private Integer cid;
	private String cname;
	@Override
	public String toString() {
		return "Hero [id=" + id + ", hname=" + hname + ", price=" + price + ", isHave=" + isHave + ", picurl=" + picurl
				+ ", cid=" + cid + ", cname=" + cname + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getIsHave() {
		return isHave;
	}
	public void setIsHave(String isHave) {
		this.isHave = isHave;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(Integer id, String hname, Double price, String isHave, String picurl, Integer cid, String cname) {
		super();
		this.id = id;
		this.hname = hname;
		this.price = price;
		this.isHave = isHave;
		this.picurl = picurl;
		this.cid = cid;
		this.cname = cname;
	}
	
	
	
	
	

}
