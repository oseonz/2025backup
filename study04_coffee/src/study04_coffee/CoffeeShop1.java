package study04_coffee;

import java.util.Scanner;

public class CoffeeShop1 {

	private static boolean run;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("커피 메뉴");
		System.out.println("1. 아메리카노 - 4,000원");
		System.out.println("2. 아이스 아메리카노 - 4,500원");
		System.out.println("3. 라떼 - 5,000원");
		System.out.println("4. 종료");
		
		int balance = 10000;
		
		while(run) {
			System.out.print("구매할 커피 번호를 선택하세요: ");
			int select = sc.nextInt();
			
			int price = 0;
			String coffeeName = "";
			
			switch(select) {
			case 1:
				System.out.println("아메리카노");
				price = 4000;
				break;
			case 2:
				System.out.println("아이스 아메리카노");
				price = 4500;
				break;
			case 3:
				System.out.println("라떼");
				price = 5000;
				break;
			case 4:
				System.out.println("주문을 종료합니다.");
				run = false;
				continue;
			default:
				System.out.println("올바른 번호를 입력하세요.");	
				continue;
			}
			
			if(balance >= price) {
				balance -= price;
				System.out.println(coffeeName + "주문 완료! 잔액: " + balance + "원입니다.");
			} else {
				System.out.println("잔액 부족! 현재 잔액: " + balance + "원입니다.");
			}
		
//			System.out.println("주문 내용: " + coffeeName + ", 금액: " + price + "원 주문하였습니다.");
		}
	}

}
