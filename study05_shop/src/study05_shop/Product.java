package study05_shop;

public class Product {
	private String member;
	private int price;
	
	public Product(String member, int price) {
		this.member = member;
		this.price = price;
	}

	private String getMember() {
		return member;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "제품명 : "+member+", 금액 : "+price+"원";
	}
}
