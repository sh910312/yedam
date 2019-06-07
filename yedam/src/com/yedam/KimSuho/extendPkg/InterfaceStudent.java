package com.yedam.KimSuho.extendPkg;

public class InterfaceStudent implements InterfaceMan {

	String name;
	String phone;
	String sNo;
	
		
	
	public InterfaceStudent(String name,String phone, String sNo) {
		
		this.name = name;
		this.phone = phone;
		this.sNo = sNo;
	}
	@Override
	public void getInfo() {
		
		System.out.println("이름 = " + name +", 전화번호 = " + phone+", sNo = " + sNo);
	}
	@Override
	public String getName(){
		
		return name;
	}

	}
	

class InterfaceProfessor implements InterfaceMan {

	String name;
	String phone;
	String pNo;
	
public InterfaceProfessor(String name,String phone, String pNo) {
		
		this.name = name;
		this.phone = phone;
		this.pNo = pNo;
	}
	
	@Override
	public void getInfo() {
		
		System.out.println("이름 = " + name +", 전화번호 = " + phone+", pNo = " + pNo);
	}
	@Override
	public String getName(){
		
		return name;
	}
}
