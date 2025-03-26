package study05_shop;

public class ShopTest {

	public static void main(String[] args) {
		Member member = new Member("강영현");
		
		member.addProduct("충전기", 50000);
		member.addProduct("아이패드", 500000);
		member.addProduct("애플팬슬", 120000);
		
		member.getSum();
		member.printProducts();
	}

}
