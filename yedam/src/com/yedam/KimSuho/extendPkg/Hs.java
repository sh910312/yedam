package com.yedam.KimSuho.extendPkg;

public class Hs extends Hak { // extends가 불러올 클래스?
						// ex) Busin..이랑 Man이랑 연동가능?
	
	String name2;
	String hsa;
		
	Hs() { // main에 new = dd 어쩌고 하기위해서 필요한거
	}
	
	Hs(String name2,String hsa) {
	
		super();  // 현재 클래스의 상속자 (상속받게 해주는 역할)
		this.name2 = name2;
		this.hsa = hsa;
		}
	
	public void name() {
		System.out.println("hak 이름: "+name);
	}
	
	public void name2() {
		System.out.println("hsa 이름: "+name2);
	}
	
	
	
}
