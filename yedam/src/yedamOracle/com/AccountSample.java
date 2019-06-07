package yedamOracle.com;

public class AccountSample {

	public static void main(String[] args) {
				
		
		Account acct = new Account("1111-1111", "800101-123456789");
		
		//acct.acNumber = "1234-5678";
		//acct.ssNumber = "800101-123456789";
		
		//acct.balance = 10000;
		
		acct.initAccount(10000);
		acct.checkBalance();
		acct.input(5000);
		acct.checkBalance();
		check(acct);
		
	}
	static void addNum(int a, double b) {
				
	}
	static void check(Account act) {
		
	}

}
