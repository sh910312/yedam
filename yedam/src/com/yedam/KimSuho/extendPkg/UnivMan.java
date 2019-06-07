package com.yedam.KimSuho.extendPkg;

public class UnivMan extends Man {
	
	UnivMan(){ }
	UnivMan(String name, String major){
		super(name);
		this.major = major;
	}
	public void tellYourUniv() {
		System.out.println("교수번호 : " + major);
	}
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("학생학번 : " + major);
	}
	
}
