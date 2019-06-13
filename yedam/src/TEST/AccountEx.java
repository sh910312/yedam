package TEST;

class BalanceInsuffientException extends Exception { // 예외처리 클래스 

	BalanceInsuffientException() {
	}

	BalanceInsuffientException(String message) {
		super(message);
	}
}

class Account {

	private long balance;

	Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsuffientException {
		if (balance < money)
			throw new BalanceInsuffientException("잔고부족" + (money - balance));
		balance -= money;

	}

}

public class AccountEx {
	public static void main(String[] args) {

		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		try {
			account.withdraw(30000);
		} catch (BalanceInsuffientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}
}