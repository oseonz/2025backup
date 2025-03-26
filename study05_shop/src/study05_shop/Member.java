package study05_shop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Member {
	String member;
	List<Product> products;
	
	public Member(String member) {
		this.member = member;
		this.products = new ArrayList<>();
	}
	
	public void addProduct(String productName, int price) {
		products.add(new Product(productName, price));
	}
	
	public void printProducts() {
		System.out.println(member+"고객의 전자 제품 구매 리스트 : ");
		for(Product product:products) {
			System.out.println("- "+product);
		}
		System.out.println(getNum()+"제품 구매, 총금액은 "+getSum()+"원 입니다.");
	}

	public int getSum() {
		int sum = 0;
		for(Product product:products) {
			sum += product.getPrice();
		}
		return (int) Math.floor((double)sum);
	}
	
	public int getNum() {
		return products.size();
	}
	
}
