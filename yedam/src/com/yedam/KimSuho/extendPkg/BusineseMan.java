package com.yedam.KimSuho.extendPkg;

public class BusineseMan extends Man {
	
	BusineseMan(){
		super();
	}
	BusineseMan(String company){
		this.company = company;
	}
	BusineseMan(String name, String company) {
		super(name);
		this.company = company;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
	}
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("교수번호:  " + company);
	}

}
