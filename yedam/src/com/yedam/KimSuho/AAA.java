package com.yedam.KimSuho;

public class AAA {
	
	public int aaa; //필드
	
	AAA () { // 생성자 'private'은 외부에서의 접근을 차단함 . 'public'모든 패키지에서 접근 가능				 // AAA라는 클래스에서만 사용가능
	}
	
	public void aaa() { // 메소드
	System.out.println("aaa");
	}
	
	public void setAAA(int a) {
		aaa = a ;
	}
	
}

// private 해당 클래스 내에서만 사용가능
// public 모든 곳에서 사용가능
// protected 상속에서만