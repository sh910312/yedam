package com.yedam.KimSuho;

public class Professor {
	private String prfNo; // 34353-24234
	private String name;
	private String major;
	public Professor() {
	}
	public Professor(String prfNo, String name, String major) {
		this.prfNo = prfNo;
		this.name = name;
		this.major = major;
	}
	public String getPrfNo() {
		return prfNo;
	}
	public void setPrfNo(String prfNo) {
		this.prfNo = prfNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Professor [prfNo=" + prfNo + ", name=" + name + ", major=" + major + "]";
	}
	
}
