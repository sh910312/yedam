package com.yedam.KimSuho.extendPkg;

public class Man {
	String name;
	String company;
	String major;
	
	Man(){ } 
	Man(String name){
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("이름: " + name);
	}
}
