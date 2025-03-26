package study04;

import java.util.ArrayList;
import java.util.List;

public class BankAccount1 {
	String accoutNumber;
	String owner;
	double balance;
	List<String> transactions;
	
	String[] menu;	
	
	public BankAccount1(String accoutNumber, String owner, double balance) {
		this.accoutNumber = accoutNumber;
		this.owner = owner;
		this.balance = balance;
		this.transactions = new ArrayList<>();
		transactions.add("계정생성 - 초기잔액 : " + balance + "원");
		
		this.menu = new String[] {"아메리카노"};
		
	} //생성자
	
	


	public void printTransactions() {
		System.out.println("입출금 내역 / " + owner + "님");
		
		for(String han : transactions) {
			System.out.println(han);
		}
		
	}



	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			transactions.add("입금 :" + amount + "원, 현재잔액 : " + balance + "원 입니다.");
			System.out.println(amount + "원이 입금되었습니다. 현재잔액 : " + balance + "원 입니다.");
			System.out.println("------------------------------------------------------");
		}else {
			System.out.println("입금금액이 0원보다 커야합니다.");
		}
		
	}




	public void checkBalace() {
		System.out.println(owner + "님 잔액은 " + balance + "원 입니다.");
		System.out.println("---------------------------------------");
	}




	public void withDraw(double amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			transactions.add("출금 :" + amount + "원, 현재잔액 : " + balance + "원 입니다.");
			System.out.println(amount + "원이 출금되었습니다. 현재잔액 : " + balance + "원 입니다.");
			System.out.println("------------------------------------------------------");
		}else if(amount > balance){
			System.out.println("잔액이 부족합니다. 현재잔액은 " + balance + "원 입니다.");
			System.out.println("------------------------------------------------------");
		}else {
			System.out.println("출금 금액은 0원 보다 커야합니다.");
			System.out.println("------------------------------------------------------");
		}
	}
	
	
	
	
	

	
}