package study04_coffee;

public class Customer {
	String name;
	int balance;
	
	public Customer(String name, int balene) {
		this.name = name;
		this.balance = balance;
	}
	
	public void buyCoffee(CoffeeShop shop, String coffeeName) {
		Coffee coffee = shop.getCoffee(coffeeName); //메뉴 확인
		if(coffee == null) {
			System.out.println("해당 메뉴는 없습니다.");
		}else {
			if(balance >= coffee.price) {
				balance -= coffee.price;
				System.out.println(name + "님이" + coffee.name + "를 구매하였습니다." + coffee.price + "원입니다.");
			}else {
				System.out.println("잔액 부족! 현재 잔액: " + balance + "원");
			}
//			System.out.println(coffee.name + " / " + coffee.price);
		}
	}
}
