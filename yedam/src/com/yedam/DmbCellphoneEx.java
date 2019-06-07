package com.yedam;

class CellPhone {
	
	String model;
	String color;
	
	CellPhone(){}
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	
	void powerOn() {
		System.out.println("전원 ON");
	}
	void poweroff() {
		System.out.println("전원OFF");
	}
	
	void bell() {
		System.out.println("벨 ON");
	}
	void sendVoice(String mesege) {
		System.out.println("자신: "+mesege);
	}
	void receiveVoice(String mesege) {
		System.out.println("상대: "+mesege);
	}
	void handUp() {
		System.out.println("전화끊기");
	}
	
	
}

class DmbCellPhone extends CellPhone {
	
	int channel;
	
	DmbCellPhone(){	}
	DmbCellPhone(String model, String color, int channel){
		
		super(model, color); // 부모 클래스의 생성자(arguemnts 2개인)
		this.channel = channel;
	}
		
	
	void turnOnDmb() {
		System.out.println("채널: "+channel);
	}
	void changChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+ channel +"번으로 바꿈" );
	}
	void turnOffDbm() {
		System.out.println("DMB종료");
	}
	@Override
	void handUp() {
		System.out.println("DMB 방소종료");
	}
	
	
}


public class DmbCellphoneEx {

	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("SMT-300","red",10);
		dcp.bell();
		dcp.turnOnDmb();
		System.out.println(dcp.channel);
		dcp.changChannelDmb(20);
		System.out.println(dcp.channel);
		

	}
}


	

