package yedamOracle.com;

public class Account {
	//필드
	
	int balance;
	private String acNumber;
	private String ssNumber;
	// 생성자 Constructor
		
	Account(String ac, String ss){
		acNumber = ac;
		ssNumber = ss;
		
	}
	
	void initAccount(int amt) {
		
	}
	
	//메소드
	void withdraw (int amt) { //인출
		
		balance = balance - amt;
	};
	void input (int amt) { //입금
		
		balance = balance - amt;
	};
	void checkBalance () { //잔액조회
		System.out.println("계좌번호 :" + ssNumber);
		System.out.println("잔액은 : " + balance);
	};
	
	
	
	
	
}
