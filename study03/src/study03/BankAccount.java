package study03;

public class BankAccount {
	double balance;
	
	public BankAccount(double initBankAccount) {
		this.balance = initBankAccount;
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount(0);//초기화/
		
		account.deposit(1000);
	}

	private void deposit(double amount) {
		balance += amount;
		System.out.println(balance + "원 입금되었습니다.");
		
	}

}
