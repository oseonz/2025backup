package study04_coffee;

import java.util.Scanner;

public class CoffeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CoffeeShop shop = new CoffeeShop(); // instance 생성
		Customer customer = new Customer("홍길동",10000); // instance 생성
		
		shop.showMenu(); // coffeeShop class
		
		while(true) {
			System.out.println("구매할 커피 이름을 입력");
			String coffeeName = sc.nextLine();
			
			if(coffeeName.equalsIgnoreCase("exit")) {
				System.out.println("주문 종료");
				break;
			}
			
			customer.buyCoffee(shop, coffeeName);
		}
	
	}

}