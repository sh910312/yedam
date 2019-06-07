package com.yedam.KimSuho;

public class PerBMI {

	String age;
	String name;
	String hap;
	int kg;
	int cm;

	PerBMI() {
	}

	PerBMI(String age, String name, String hap) {
		this.age = age;
		this.name = name;
		this.hap = hap;
	}

	String getage() {
		return age;
	}

	String getname() {
		return name;
	}

	String gethap(int ky, int mom) {
		double has = (double) mom/((ky * ky)/100);
		hap = "체지방 결과는 : " + 100*has+"%";
		return hap;
	}

	void setage(String age) {
		this.age = age;
	}

	void setname(String name) {
		this.name = name;
	}

	void sethap() {
		this.hap = hap;
	}

}
